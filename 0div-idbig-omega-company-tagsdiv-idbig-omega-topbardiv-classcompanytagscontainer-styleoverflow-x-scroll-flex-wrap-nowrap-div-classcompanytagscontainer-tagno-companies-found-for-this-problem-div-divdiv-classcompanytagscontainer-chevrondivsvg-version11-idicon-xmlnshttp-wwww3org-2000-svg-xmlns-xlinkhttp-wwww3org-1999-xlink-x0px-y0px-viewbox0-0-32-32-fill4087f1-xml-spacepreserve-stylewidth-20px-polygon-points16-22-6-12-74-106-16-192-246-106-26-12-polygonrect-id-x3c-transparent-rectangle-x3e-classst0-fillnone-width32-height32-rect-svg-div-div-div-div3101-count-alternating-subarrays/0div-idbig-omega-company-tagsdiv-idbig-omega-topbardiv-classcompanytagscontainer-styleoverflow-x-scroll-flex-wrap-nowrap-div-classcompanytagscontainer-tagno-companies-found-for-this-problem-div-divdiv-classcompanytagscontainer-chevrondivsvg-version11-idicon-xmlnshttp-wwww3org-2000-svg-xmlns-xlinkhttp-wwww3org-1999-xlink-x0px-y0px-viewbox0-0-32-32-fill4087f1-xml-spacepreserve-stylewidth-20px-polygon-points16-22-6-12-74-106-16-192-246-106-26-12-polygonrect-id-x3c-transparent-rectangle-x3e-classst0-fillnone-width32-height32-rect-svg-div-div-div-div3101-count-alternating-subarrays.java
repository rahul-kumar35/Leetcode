class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        if(nums.length == 1) return 1;
        long ans=nums.length;
        int r=1;
        long count = 0;
        while(r<nums.length){
            if(nums[r-1] != nums[r]){
                count++;
                r++;
                if(r==nums.length){
                    ans += (count*(count+1))/2;
                }
                
            }else{
                ans += (count*(count+1))/2;
                r++;
                count=0;
            }
        }
        return ans;
    }
}