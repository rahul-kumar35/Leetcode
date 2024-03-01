class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }
        String str = "";
        for(int i=0; i<s.length()-1; i++){
            
            if(count > 1){
                count--;
                str = str + '1';
            }else
                str = str + '0';
        }
        return str + '1';
    }
}