class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase=true;
        boolean decrease =true;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                increase =false;
            }
            if(nums[i]<nums[i+1]){
                decrease = false;
            }
        }
        return increase || decrease;
    }
}
