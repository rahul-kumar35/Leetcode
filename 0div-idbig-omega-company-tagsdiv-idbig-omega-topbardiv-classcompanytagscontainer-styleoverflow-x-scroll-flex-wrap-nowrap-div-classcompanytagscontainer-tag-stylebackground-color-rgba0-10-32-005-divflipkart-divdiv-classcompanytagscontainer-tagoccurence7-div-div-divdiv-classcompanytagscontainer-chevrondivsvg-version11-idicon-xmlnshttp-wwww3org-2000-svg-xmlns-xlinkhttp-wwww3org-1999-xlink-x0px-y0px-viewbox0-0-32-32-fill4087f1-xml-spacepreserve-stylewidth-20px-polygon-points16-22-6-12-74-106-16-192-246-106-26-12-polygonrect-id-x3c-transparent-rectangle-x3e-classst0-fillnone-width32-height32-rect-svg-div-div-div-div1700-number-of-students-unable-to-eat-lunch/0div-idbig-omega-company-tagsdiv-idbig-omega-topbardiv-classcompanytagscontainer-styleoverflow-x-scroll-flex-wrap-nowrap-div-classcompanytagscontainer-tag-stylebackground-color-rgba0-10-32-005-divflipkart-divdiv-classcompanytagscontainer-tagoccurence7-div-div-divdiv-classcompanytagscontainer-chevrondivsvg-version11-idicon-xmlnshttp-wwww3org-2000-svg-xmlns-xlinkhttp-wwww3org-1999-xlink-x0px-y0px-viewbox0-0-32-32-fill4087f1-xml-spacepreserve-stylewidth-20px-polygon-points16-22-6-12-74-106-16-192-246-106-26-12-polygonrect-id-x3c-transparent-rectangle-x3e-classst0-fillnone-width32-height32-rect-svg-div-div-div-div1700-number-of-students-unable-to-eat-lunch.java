class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int c0=0, c1=0;
        for(int demand : students){
            if(demand == 0) c0++;
            else c1++;
        }
        int i=0;
        while(i<sandwiches.length){
            if(sandwiches[i] == 0){
                if(c0 != 0) c0--;
                else break;       
            }else{
                if(c1 != 0) c1--;
                else break;
            }
            i++;
        }
        return sandwiches.length-i;
    }
}