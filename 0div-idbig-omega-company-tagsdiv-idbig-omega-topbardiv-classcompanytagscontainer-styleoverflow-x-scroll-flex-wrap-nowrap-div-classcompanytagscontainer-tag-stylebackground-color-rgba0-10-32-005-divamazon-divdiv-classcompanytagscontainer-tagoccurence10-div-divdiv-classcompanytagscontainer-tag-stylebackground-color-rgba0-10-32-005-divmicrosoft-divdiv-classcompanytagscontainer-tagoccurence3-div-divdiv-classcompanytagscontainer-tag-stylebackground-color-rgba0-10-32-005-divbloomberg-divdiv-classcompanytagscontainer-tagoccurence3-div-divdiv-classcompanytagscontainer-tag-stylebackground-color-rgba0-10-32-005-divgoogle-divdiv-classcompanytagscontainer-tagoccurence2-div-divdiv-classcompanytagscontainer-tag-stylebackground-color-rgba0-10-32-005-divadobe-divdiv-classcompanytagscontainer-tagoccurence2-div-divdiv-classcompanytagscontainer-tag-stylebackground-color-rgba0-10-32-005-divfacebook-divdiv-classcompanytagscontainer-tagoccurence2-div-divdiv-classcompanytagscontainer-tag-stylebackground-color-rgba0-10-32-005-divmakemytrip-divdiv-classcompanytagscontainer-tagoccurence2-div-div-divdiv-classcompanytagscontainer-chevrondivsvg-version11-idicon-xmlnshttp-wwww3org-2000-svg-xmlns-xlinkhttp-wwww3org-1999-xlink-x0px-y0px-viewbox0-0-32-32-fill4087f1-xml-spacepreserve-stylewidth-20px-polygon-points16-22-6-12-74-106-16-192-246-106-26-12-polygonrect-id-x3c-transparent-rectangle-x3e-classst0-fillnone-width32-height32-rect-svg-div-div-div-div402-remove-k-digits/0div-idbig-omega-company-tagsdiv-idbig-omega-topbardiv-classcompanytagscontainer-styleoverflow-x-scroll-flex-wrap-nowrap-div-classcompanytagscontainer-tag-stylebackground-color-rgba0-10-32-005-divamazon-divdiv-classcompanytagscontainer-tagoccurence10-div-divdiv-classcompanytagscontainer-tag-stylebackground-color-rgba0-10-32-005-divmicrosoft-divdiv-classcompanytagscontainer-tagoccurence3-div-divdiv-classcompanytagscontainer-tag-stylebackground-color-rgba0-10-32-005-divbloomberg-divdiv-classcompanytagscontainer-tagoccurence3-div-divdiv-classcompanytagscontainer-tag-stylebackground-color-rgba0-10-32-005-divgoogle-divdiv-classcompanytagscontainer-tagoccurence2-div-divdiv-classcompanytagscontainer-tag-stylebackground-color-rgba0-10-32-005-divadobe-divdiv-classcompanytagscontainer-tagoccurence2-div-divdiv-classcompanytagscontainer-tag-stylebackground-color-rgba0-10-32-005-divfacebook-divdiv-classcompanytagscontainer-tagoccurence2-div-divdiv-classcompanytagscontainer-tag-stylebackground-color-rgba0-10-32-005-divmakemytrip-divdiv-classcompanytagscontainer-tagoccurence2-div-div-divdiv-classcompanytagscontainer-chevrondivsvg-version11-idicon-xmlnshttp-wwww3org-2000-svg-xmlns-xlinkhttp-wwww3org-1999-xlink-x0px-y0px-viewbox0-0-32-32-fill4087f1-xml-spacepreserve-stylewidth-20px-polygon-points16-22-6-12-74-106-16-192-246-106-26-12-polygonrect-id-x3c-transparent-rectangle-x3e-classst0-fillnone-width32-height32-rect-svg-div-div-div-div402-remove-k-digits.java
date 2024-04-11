class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(n == k) return "0";
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<n){
            while(k>0 && !st.isEmpty() && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }
            st.add(num.charAt(i));
            i++;
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        while(sb.length() > 1 && sb.charAt(sb.length()-1)=='0') sb.deleteCharAt(sb.length()-1);
        return sb.reverse().toString();
    }
}