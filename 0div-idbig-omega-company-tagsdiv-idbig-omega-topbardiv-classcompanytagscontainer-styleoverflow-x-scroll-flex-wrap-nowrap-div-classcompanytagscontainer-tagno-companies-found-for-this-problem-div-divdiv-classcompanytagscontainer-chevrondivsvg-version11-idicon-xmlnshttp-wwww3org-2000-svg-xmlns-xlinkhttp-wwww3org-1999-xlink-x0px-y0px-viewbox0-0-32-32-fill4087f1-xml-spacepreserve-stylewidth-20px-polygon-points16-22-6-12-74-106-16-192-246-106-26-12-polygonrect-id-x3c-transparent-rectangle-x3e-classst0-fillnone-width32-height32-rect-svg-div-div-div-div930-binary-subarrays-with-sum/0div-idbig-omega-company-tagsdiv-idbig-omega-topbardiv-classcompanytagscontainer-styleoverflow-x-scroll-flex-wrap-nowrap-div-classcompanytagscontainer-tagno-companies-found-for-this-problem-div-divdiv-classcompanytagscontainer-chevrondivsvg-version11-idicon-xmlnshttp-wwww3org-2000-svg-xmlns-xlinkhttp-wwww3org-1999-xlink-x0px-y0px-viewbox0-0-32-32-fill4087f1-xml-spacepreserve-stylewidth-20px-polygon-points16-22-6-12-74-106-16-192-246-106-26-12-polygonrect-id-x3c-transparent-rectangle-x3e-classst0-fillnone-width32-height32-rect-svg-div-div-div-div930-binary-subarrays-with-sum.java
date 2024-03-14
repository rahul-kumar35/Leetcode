class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int AnsCount = 0;
        int currSum = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            currSum += num;
            if(currSum == goal){
                AnsCount++;
            }
            if(freq.containsKey(currSum-goal)){
                AnsCount += freq.get(currSum - goal);
            }
            freq.put(currSum, freq.getOrDefault(currSum, 0)+1);
        }
        
        return AnsCount;
    }
}