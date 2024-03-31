class Solution {
    public long countSubarrays(int[] nums, int k) {
        long res = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int i=0,j=0;
        int countMax=0;
        while(j<nums.length){
            if(nums[j] == max) countMax++;
            
            while(countMax >= k){
                res += nums.length - j;
                if(nums[i] == max) countMax--;
                i++;
            }
            j++;
        }
        return res;
    }
}