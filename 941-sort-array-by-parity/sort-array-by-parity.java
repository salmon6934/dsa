class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int ans[]=new int[nums.length];
        for(int num:nums)
        if(num%2==0)
        ans[i++]=num;
        for(int num:nums)
        if(num%2==1)
        ans[i++]=num;
        return ans;
    }
}