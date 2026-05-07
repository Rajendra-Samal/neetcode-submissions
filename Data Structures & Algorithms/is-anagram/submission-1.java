class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        return false;
}
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){//addd char
            arr[s.charAt(i) - 'a']++;
        }
 
        for(int i=0; i<s.length(); i++){ //substract char
            arr[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
