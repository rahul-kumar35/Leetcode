class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int i=0; i<tickets.length; i++){
            if(tickets[i] >= tickets[k]){
                if(i<=k)
                    time += tickets[k];
                else
                    time += tickets[k]-1;
            }else{
                time += tickets[i];
            }
        }
        return time;
    }
}