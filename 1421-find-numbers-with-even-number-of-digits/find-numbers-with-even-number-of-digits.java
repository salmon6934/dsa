class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int c:nums){
            if((c>9&&c<100)||(c>999&&c<10000)||c==100000)
            res++;
        }
        return res;
    }
}