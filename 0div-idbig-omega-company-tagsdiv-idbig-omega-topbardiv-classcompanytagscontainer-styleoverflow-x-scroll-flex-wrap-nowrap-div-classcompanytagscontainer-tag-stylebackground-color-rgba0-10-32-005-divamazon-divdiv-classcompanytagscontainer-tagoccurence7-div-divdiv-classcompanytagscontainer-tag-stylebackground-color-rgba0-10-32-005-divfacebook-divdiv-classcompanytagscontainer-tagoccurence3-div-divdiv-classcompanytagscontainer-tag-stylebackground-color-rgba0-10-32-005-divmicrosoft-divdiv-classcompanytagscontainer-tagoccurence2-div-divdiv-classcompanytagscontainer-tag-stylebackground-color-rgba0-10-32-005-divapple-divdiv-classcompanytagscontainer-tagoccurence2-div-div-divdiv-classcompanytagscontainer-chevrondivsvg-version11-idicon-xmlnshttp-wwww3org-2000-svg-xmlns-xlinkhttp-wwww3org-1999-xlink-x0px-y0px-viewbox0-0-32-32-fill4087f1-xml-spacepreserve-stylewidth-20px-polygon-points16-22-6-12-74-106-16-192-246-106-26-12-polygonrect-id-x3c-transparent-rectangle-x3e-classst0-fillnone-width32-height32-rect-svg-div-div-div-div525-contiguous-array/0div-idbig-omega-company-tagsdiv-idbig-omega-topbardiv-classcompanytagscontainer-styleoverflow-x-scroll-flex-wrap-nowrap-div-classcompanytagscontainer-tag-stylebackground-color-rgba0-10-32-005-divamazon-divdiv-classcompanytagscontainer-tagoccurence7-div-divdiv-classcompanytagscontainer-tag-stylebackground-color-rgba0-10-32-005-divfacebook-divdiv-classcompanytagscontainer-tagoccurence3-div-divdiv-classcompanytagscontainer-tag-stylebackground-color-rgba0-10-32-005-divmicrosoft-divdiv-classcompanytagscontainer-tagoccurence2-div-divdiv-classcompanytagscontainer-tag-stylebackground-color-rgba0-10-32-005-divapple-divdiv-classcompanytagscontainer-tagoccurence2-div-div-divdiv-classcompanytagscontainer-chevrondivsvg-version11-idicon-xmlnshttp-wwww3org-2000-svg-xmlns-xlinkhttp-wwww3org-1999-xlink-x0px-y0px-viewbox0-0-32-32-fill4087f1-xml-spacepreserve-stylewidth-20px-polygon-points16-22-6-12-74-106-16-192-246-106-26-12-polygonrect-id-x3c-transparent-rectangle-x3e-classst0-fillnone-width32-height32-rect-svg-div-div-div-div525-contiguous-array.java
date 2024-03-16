class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);// map<sum, index>
        int sum = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                sum--;
                if(map.containsKey(sum)){
                    ans = Math.max(ans, i-map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }else{
                sum++;
                if(map.containsKey(sum)){
                    ans = Math.max(ans, i-map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }
        return ans;
    }
}