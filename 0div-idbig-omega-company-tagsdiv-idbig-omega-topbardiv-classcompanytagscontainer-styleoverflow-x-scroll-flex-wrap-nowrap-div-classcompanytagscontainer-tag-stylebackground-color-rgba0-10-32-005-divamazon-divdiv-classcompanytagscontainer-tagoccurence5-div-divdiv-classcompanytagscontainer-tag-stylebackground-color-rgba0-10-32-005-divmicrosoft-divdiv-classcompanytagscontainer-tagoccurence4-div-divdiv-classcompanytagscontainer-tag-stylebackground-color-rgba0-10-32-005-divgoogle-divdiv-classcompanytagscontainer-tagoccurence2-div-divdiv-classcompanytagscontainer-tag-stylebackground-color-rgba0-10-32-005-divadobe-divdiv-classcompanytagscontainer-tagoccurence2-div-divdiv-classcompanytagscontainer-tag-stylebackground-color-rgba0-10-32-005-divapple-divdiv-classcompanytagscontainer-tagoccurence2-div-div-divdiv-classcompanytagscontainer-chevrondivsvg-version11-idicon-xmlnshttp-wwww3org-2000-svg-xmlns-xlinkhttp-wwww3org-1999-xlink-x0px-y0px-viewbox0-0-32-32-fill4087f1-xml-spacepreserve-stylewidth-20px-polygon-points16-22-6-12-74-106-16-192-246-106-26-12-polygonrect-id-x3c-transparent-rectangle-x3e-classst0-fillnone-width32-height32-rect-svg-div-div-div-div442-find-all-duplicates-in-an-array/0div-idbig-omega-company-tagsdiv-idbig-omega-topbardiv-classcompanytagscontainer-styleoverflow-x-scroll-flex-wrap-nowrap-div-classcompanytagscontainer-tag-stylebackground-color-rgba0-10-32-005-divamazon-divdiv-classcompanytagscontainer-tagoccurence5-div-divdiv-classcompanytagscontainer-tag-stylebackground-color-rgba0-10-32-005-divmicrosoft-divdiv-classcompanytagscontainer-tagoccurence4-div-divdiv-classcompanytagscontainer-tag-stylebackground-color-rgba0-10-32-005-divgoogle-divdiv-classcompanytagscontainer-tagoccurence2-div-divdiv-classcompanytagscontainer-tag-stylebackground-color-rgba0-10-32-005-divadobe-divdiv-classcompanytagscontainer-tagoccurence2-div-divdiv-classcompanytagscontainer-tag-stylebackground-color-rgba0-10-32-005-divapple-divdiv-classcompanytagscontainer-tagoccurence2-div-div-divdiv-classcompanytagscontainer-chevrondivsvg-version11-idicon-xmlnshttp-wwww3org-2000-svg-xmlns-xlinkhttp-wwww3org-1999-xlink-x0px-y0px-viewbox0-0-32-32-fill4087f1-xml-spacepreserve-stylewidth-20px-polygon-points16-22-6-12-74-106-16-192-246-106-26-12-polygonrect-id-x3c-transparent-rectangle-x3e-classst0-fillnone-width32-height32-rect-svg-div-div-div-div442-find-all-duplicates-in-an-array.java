class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
               i++;
                  
            }
             

               
        }
        for(int j=0; j<nums.length; j++){
             if(nums[j] != j+1)
                  res.add(nums[j]);
        }
       
        return res;
    }
    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}