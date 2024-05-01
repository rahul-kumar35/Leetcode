class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(; i<word.length(); i++){
            if(word.charAt(i) != ch){
                sb.append(word.charAt(i));
            }else{
                sb.append(ch);
                break;
            }
        }
        if(i == word.length()) return word;
        String st = sb.reverse().toString() + word.substring(i+1);
        return st;
    }
}