class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high = 0;
        int low = 0;
        for(int w : weights){
            low = Math.max(low,w);
            high += w;
        }
        while(high >= low){
            int mid = low + (high-low)/2;
            int d = 1;
            int sum = 0;
            for(int w: weights){
                if(sum + w > mid){
                     sum = w;
                     d++;
                }else{
                    sum += w;
                }
            }
            if(d > days){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}