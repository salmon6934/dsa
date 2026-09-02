class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        HashMap<Integer,Integer> h2=new HashMap<>();
        int n=Math.min(nums1.length,nums2.length);
        for(int x:nums1)
        h1.put(x,h1.getOrDefault(x,0)+1);
        int j=0;
        int ans[]=new int[n];
        for(int x:nums2){
            int count=h1.getOrDefault(x,0);
            if(count==0)
            continue;
            else{
                ans[j]=x;
                j++;
                h1.put(x,count -1);
            }
        }
        return Arrays.copyOfRange(ans,0,j);
    }
}