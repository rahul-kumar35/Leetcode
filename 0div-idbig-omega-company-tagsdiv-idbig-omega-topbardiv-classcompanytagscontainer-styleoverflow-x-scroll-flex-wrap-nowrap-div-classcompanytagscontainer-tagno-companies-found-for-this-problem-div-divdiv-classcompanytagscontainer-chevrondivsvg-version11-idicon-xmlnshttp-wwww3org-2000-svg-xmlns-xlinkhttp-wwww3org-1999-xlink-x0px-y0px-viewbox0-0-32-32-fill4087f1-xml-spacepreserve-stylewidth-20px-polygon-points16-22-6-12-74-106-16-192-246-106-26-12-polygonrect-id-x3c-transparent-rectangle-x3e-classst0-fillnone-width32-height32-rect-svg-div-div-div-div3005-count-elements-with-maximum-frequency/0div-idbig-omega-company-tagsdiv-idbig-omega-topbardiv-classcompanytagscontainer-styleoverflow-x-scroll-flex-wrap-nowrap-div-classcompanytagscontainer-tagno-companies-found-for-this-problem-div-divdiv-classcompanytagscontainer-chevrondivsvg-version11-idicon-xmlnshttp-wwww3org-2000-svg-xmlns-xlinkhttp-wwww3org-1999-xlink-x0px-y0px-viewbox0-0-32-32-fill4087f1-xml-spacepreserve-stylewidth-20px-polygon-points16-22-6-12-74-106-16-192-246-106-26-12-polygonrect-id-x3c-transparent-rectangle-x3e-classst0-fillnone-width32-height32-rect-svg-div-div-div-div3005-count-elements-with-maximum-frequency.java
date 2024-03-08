class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int maxF = 0;
        for(int key : map.keySet()){
            if(map.get(key) > maxF) maxF = map.get(key);
        }
        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key) == maxF){
                ans += maxF;
            }
        }
        return ans;
    }
}