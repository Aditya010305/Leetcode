class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        boolean found = false;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == target){
                ans.add(i);
                found = true;
            }else if(found){
                break;
            }
        }
        return ans;
    }
}