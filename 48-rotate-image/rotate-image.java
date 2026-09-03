class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix,matrix.length);
        swapcols(matrix,matrix.length);
    }
    public void transpose(int[][] matrix,int n){
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
        }
        }
    }
    public void swapcols(int[][] matrix, int n){
    int l=0,r=n-1;
    while(l<r){
        for(int i=0;i<n;i++){
            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;
        }
        l++;r--;
    }
    }
}