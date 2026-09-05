class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int peak=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i])
            continue;
            peak=i-1;
            break;
        }
        if(peak==arr.length-1||peak==0||peak==-1)
        return false;
        for(int i=peak+1;i<arr.length;i++){
            if(arr[i-1]>arr[i])
            continue;
            return false;
        }
        return true;
    }
}