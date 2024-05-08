class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int[] arr = Arrays.copyOf(score, score.length);
        Arrays.sort(arr);
        HashMap<Integer, String> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int rank = arr.length - i;
            if (rank == 1) {
                map.put(arr[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(arr[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(arr[i], "Bronze Medal");
            } else {
                map.put(arr[i], String.valueOf(rank));
            }
        }
        
        for (int i = 0; i < score.length; i++) {
            ans[i] = map.get(score[i]);
        }
        
        return ans;
    }
}























