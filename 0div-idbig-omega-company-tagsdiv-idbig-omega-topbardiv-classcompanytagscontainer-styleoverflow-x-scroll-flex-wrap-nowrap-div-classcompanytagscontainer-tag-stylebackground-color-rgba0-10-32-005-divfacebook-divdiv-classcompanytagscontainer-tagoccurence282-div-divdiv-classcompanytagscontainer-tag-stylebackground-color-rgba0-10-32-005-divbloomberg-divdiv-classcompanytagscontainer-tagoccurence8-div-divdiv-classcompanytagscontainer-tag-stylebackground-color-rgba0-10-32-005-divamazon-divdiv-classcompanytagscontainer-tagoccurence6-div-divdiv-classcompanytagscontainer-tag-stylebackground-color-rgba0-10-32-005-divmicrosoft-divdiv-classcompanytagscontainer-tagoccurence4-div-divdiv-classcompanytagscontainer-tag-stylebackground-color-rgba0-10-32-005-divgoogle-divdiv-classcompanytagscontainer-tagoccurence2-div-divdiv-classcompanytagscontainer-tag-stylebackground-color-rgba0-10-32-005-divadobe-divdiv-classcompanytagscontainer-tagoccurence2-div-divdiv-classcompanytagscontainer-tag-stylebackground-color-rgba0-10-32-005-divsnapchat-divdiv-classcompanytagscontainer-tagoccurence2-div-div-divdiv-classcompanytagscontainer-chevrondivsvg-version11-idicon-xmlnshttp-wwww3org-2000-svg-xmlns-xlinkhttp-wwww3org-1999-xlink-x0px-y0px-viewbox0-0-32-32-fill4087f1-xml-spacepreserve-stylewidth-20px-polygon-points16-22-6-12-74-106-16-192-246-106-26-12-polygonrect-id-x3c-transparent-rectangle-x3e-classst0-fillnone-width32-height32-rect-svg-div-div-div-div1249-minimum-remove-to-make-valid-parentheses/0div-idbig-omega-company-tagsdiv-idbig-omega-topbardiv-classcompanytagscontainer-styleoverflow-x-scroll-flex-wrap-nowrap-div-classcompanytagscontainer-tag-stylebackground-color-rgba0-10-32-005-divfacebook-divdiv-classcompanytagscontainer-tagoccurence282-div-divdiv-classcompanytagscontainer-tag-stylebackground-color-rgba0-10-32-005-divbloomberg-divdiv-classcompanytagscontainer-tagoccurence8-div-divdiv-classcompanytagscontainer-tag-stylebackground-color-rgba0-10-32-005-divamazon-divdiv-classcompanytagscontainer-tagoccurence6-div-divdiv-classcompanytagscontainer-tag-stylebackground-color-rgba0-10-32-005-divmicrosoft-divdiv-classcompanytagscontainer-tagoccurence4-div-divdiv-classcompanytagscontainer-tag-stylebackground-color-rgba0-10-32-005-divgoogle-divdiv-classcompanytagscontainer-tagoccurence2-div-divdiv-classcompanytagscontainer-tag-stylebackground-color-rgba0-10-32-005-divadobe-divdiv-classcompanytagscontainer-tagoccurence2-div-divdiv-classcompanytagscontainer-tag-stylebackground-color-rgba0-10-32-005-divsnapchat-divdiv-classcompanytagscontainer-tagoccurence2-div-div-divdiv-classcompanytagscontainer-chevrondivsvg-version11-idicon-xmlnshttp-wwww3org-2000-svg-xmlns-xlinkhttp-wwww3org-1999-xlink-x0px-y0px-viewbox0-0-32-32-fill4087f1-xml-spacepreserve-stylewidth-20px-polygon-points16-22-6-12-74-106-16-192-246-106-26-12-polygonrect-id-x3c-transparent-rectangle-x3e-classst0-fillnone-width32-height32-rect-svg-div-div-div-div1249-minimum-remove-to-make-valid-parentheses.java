class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> sLeft = new Stack<>();
        Stack<Character> sRight = new Stack<>();
        
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) != '(' && sb.charAt(i) != ')') continue;
            if(sb.charAt(i) == '('){
                sRight.push(')');
            }else{
                if(sRight.isEmpty()){
                    sb.deleteCharAt(i);
                    i--;
                }else{
                    sRight.pop();
                }
            }
        }
        
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i) != '(' && sb.charAt(i) != ')') continue;
            if(sb.charAt(i) == ')'){
                sLeft.push('(');
            }else{
                if(sLeft.isEmpty()){
                    sb.deleteCharAt(i);
                    
                }else{
                    sLeft.pop();
                }
            }
        }
        return sb.toString();
    }
}