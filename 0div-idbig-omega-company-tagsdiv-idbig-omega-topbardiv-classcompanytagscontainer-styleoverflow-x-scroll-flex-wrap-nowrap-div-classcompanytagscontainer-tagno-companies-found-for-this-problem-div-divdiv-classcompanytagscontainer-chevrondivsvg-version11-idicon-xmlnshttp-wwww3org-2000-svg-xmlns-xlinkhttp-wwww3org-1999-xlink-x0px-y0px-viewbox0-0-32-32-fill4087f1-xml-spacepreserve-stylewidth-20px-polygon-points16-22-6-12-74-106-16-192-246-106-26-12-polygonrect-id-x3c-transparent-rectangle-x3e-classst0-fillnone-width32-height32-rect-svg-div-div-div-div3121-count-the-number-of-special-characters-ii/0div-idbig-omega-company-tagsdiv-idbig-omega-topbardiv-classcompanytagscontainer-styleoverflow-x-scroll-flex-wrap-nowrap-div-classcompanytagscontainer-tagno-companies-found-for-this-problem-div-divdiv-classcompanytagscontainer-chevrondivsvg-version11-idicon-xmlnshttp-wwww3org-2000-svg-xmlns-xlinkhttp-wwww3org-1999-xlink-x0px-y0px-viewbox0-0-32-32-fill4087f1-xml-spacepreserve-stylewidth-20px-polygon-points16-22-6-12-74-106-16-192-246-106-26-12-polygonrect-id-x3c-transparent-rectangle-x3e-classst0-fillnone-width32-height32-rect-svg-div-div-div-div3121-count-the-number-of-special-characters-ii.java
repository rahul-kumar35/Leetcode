class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=word.length()-1; i>=0; i--){
            if(word.charAt(i)>=97 && !map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), i);
            }
        }
        
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)<=90 && map.containsKey((char)((int)word.charAt(i)+32))){
                if(map.get((char)((int)word.charAt(i)+32)) < i){
                    ans++;
                    map.put((char)(word.charAt(i)+32), word.length());
                }else{
                    map.put((char)(word.charAt(i)+32), word.length());
                }
            }
        }
        return ans;
    }
}