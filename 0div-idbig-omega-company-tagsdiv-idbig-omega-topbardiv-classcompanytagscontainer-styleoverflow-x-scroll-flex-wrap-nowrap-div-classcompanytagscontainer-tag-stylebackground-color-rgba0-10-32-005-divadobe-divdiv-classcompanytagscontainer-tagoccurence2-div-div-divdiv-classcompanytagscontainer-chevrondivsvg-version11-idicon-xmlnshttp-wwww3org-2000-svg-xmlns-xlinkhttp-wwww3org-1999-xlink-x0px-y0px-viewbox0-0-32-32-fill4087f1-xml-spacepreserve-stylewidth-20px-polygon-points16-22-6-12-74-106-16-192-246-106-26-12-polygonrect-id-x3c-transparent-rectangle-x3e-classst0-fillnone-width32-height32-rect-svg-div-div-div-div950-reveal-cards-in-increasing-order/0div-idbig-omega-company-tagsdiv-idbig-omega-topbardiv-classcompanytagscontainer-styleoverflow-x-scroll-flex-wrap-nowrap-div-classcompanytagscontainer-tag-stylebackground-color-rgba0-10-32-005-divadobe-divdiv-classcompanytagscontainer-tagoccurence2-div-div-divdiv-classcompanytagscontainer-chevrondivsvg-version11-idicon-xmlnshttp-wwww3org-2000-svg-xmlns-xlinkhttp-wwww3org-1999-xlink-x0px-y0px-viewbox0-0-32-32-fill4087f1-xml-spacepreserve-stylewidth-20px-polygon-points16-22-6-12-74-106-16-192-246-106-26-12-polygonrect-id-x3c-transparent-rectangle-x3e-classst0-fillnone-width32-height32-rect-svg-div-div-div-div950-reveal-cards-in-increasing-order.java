class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int deckIdx =  0;
        int resIdx = 0;
        boolean skip = false;
        Arrays.sort(deck);
        int[] result = new int[n];
        while(deckIdx < n){
            if(result[resIdx] == 0){
                if(!skip){
                    result[resIdx] = deck[deckIdx];
                    deckIdx++;
                }
                skip = !skip;
            }
            resIdx = (resIdx+1)%n;
        }
        return result;
    }
}