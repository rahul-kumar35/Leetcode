class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a1, a2) -> Integer.compare(a1[0], a2[0]));
       
        int min = points[0][1];
        int ans = 1;
        for(int i=1; i<points.length; i++){
            if(points[i][0] > min){
                ans++;
                min = points[i][1];
            }else{
                min = Math.min(min, points[i][1]);
            }
        }
        return ans;
    }
}