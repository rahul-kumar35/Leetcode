class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int mid = 0;
        if(nums.length % 2 == 0){
            mid = nums.length/2;
        }else{
            mid = nums.length/2;
        }
        long ans = 0;
        if(nums[mid] == k) return 0;
        if(nums[mid] > k){
            ans = countL(nums, 0, mid,k);
        }else{
            ans = countG(nums, mid, nums.length-1, k);
        }
        
        return ans;
    }
    public long countG(int[] nums, int i, int j, int k){
        long cnt = 0;
        while(i<=j){
            if(nums[i] < k){
                cnt += k-nums[i];
            }else{
                break;
            }
            i++;
        }
        return cnt;
    }
    
    public long countL(int[] nums, int i, int j, int k){
        long cnt = 0;
        while(i<=j){
            if(nums[i] > k){
                cnt += nums[i]-k;   
            }
            i++;
        }
        return cnt;
    }
}