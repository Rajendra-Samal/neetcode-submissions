public class Solution {
    
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int count = 0;
        String curr = "";
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Formulate the full number (handles multi-digit cases like 12[a])
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                // Push the current multiplier and current string context onto the stacks
                countStack.push(count);
                stringStack.push(curr);
                
                // Reset for the inner content inside the brackets
                count = 0;
                curr = "";
            } else if (c == ']') {
                // Initialize StringBuilder with the previously saved string context
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();
                
                // Append the current decoded segment 'repeat' times
                for (int i = 1; i <= repeat; i++) {
                    decodedString.append(curr);
                }
                
                // Update current string with the newly combined result
                curr = decodedString.toString();
            } else {
                // It's a standard letter, just append it to the current running string
                curr += c;
            }
        }
        
        return curr;
    }
}