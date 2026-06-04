class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col=matrix[0].length, row=matrix.length;
        int l=0;
        int r=(row*col)-1;
        while(l<=r){
            int mid=(l+r)/2;
            int mrow=mid/col;
            int mcol=mid%col;
            if(matrix[mrow][mcol]==target){
                return true;
            }
            else if(target>matrix[mrow][mcol]) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}
