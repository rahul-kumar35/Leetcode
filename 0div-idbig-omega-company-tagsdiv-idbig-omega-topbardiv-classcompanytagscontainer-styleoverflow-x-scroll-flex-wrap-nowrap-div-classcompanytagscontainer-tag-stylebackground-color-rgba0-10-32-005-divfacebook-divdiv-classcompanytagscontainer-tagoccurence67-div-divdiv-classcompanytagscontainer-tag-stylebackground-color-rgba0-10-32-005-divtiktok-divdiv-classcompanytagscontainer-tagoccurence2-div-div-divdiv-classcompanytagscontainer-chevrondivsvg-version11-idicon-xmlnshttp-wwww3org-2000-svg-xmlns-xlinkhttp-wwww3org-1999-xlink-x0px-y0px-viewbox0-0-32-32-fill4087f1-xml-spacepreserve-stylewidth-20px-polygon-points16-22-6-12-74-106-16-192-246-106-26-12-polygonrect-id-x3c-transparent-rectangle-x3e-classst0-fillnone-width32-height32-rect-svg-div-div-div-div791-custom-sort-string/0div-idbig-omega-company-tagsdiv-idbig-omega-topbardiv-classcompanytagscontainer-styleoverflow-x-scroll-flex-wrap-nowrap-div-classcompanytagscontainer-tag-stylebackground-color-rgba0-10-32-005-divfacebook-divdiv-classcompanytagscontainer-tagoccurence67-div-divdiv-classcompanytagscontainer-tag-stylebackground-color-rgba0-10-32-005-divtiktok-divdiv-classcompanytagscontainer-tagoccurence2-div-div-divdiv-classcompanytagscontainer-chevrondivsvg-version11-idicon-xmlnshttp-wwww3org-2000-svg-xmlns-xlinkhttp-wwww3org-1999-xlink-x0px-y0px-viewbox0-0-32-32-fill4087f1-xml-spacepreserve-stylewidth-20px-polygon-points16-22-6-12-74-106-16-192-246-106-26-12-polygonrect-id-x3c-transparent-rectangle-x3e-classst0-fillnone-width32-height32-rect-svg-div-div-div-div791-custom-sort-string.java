class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<order.length(); i++){
            if(map.containsKey(order.charAt(i))){
                int freq = map.get(order.charAt(i));
                while(freq > 0){
                    sb.append(order.charAt(i));
                    freq--;
                }
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(!order.contains(s.charAt(i)+"")) 
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}