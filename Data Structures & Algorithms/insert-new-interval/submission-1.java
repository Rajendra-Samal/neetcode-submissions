
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        
        // 1. Add all intervals that completely end before the new interval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }
        
        // 2. Merge all overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        // Add the merged single interval
        list.add(newInterval);
        
        // 3. Add all remaining intervals
        while (i < n) {
            list.add(intervals[i]);
            i++; // This missing line caused the infinite loop/broken state
        }
        
        // Convert List to 2D Array
        return list.toArray(new int[list.size()][]);
    }
}
