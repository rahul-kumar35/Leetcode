class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                char ch = s.charAt(i);
                while(i<j && s.charAt(i) == ch){
                    i++;
                }
                while(i<=j && s.charAt(j) == ch){
                    j--;
                }
            }else{
                break;
            }
        }
        return s.substring(i, j+1).length();
    }
}