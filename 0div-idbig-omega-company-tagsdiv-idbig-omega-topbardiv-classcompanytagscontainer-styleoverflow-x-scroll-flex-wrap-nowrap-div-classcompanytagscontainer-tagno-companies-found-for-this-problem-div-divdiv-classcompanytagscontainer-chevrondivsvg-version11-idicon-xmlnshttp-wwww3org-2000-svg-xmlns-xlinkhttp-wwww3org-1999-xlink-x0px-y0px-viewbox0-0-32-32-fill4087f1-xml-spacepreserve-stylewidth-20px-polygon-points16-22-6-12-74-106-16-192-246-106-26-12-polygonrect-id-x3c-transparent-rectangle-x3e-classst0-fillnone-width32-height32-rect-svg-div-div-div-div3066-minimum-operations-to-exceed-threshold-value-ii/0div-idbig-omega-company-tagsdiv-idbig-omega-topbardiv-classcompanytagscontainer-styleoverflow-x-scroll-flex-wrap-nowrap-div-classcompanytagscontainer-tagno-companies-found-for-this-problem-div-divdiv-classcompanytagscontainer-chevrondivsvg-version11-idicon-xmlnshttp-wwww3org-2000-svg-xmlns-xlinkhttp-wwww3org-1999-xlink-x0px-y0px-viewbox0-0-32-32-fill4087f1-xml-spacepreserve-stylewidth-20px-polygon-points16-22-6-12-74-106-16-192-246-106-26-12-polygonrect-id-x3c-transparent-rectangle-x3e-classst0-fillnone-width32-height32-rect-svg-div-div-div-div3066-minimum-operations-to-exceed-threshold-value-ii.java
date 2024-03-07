class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums) pq.offer((long)num);
        int ans = 0;
        while(pq.size() >= 2){
            long s1 = pq.poll();
            long s2 = pq.poll();
            if(s1<k || s2<k){
                long newVal = s1>=s2 ? 2*s2+s1 : 2*s1+s2;
                pq.offer(newVal);
                ans++;
            }else{
                pq.offer(s1);
                pq.offer(s2);
                break;
            }
        }
        return ans;
    }
}