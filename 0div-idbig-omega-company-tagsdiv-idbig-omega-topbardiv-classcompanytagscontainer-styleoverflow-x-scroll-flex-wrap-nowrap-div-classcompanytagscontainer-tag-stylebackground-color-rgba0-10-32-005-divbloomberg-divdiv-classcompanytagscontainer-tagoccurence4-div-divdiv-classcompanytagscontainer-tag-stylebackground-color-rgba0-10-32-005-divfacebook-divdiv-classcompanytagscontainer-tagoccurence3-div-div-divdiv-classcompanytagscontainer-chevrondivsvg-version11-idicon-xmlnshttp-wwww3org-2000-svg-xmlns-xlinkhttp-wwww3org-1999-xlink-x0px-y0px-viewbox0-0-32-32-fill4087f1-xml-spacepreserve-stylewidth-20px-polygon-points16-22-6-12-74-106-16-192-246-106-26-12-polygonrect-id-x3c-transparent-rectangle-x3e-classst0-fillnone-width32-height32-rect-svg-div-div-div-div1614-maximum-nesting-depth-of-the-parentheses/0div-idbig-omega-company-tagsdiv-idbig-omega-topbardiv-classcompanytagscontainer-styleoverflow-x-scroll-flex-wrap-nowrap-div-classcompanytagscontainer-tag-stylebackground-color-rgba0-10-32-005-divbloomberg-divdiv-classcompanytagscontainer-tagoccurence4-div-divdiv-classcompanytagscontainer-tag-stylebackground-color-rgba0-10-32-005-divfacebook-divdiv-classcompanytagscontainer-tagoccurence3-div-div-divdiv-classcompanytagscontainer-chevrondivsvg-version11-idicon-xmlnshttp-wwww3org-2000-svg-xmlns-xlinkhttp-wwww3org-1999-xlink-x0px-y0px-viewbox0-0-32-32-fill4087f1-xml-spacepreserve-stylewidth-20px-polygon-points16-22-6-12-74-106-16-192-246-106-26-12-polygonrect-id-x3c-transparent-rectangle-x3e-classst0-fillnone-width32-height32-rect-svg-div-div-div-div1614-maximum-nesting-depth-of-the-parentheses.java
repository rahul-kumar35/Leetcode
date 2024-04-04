class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int d=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') d++;
            if(s.charAt(i) == ')') d--;
            maxDepth = Math.max(maxDepth, d);
        }
        return maxDepth;
    }
}