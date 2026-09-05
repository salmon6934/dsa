class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        long max=Long.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<max){
                count++;
                max=nums[i];
            }
            if(count==3)
            return (int)max;
        }
        return nums[nums.length-1];
    }
}