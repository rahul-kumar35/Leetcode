class Solution {
    public int minimumDistance(int[][] points) {
        ArrayList<Integer> list = new ArrayList<>();
        list = maxDist(points, -1); // here -1 is the index which is not considered
        int i=list.get(1);
        int j=list.get(2);
        return Math.min(maxDist(points,i).get(0), maxDist(points, j).get(0));
    }
    
    public ArrayList<Integer> maxDist(int[][] points, int excludeId){
        int maxSum = Integer.MIN_VALUE, maxSumId = -1;
        int minSum = Integer.MAX_VALUE, minSumId = -1;
        int maxDiff = Integer.MIN_VALUE, maxDiffId = -1;
        int minDiff = Integer.MAX_VALUE, minDiffId = -1;
        
        for(int i=0; i<points.length; i++){
            if(i == excludeId) continue;
            int sum = points[i][0] + points[i][1];
            int diff = points[i][0]-points[i][1];
            
            if(sum > maxSum){
                maxSum = sum;
                maxSumId = i;
            }
            if(sum < minSum){
                minSum = sum;
                minSumId = i;
            }
            if(diff > maxDiff){
                maxDiff = diff;
                maxDiffId = i;
            }
            if(diff < minDiff){
                minDiff = diff;
                minDiffId = i;
            }
        }
        int maxVal = Integer.MIN_VALUE;
        int firstId = -1;
        int secondId = -1;
        if(maxSum - minSum > maxDiff-minDiff){
            maxVal = maxSum-minSum;
            firstId = maxSumId;
            secondId = minSumId;
        }
            
        else{
            maxVal = maxDiff-minDiff;
            firstId = maxDiffId;
            secondId = minDiffId;
        }
            
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(maxVal);
        res.add(firstId);
        res.add(secondId);
        return res;
    }
}