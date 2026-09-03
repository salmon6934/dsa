class Solution {
    public int removeElement(int[] nums, int val) {
        // int count=0;
        // for(int x:nums)
        // if(x==val)
        // count++;
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;j++;
                continue;
            }
            j++;
        }
        return i;
    }
}