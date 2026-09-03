class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int possibleDups=0;
        int last=n-1;
        for (int i=0;i<=last-possibleDups;i++){
            if(arr[i]==0){
                if(i==last-possibleDups){
                    arr[last]=0;
                    last--;
                    break;
                }
                possibleDups++;
            }
        }
        int read=last-possibleDups;
        for(int write=last;read>=0;read--){
            if(arr[read]==0){
                arr[write--]=0;
                arr[write--]=0;
            }else{
                arr[write--]=arr[read];
            }
        }
    }
}