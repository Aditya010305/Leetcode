class Solution {
    public long maxAlternatingSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : nums){
            list.add(Math.abs(ele));
        }
        list.sort((b,a) -> Integer.compare(a,b));
        long sum = 0;
        for(int i=0 ; i<list.size() ; i++){
            if(i < (list.size()+1)/2){
                sum += (long) list.get(i)*list.get(i);
            }else{
                sum -= (long) list.get(i)*list.get(i);
            }
        }
        return sum;
    }
}