class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();
        for(int x:nums1)
        s1.add(x);
        for(int x:nums2)
        s2.add(x);
        int j=0;
        int ans[]=new int[s1.size()];
        for(int x:s1){
            if(s2.contains(x)){
            ans[j]=x;
            j++;
            }
        }
        return Arrays.copyOfRange(ans,0,j);
    }
}