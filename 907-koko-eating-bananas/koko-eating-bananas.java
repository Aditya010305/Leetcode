class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = 0;
        for(int i=0 ; i<piles.length ; i++){
            if(piles[i] > high){
                high = piles[i];
            }
        }
        int low = 1;
        while(high >= low){
            int mid = low + (high - low)/2;
            long count = 0;
            for(int p : piles){
                count += (p + (long)mid -1)/mid;
            }
            if(count <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return low;
    }
}