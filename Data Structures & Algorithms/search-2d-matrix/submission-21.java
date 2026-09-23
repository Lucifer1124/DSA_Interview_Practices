class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0; int high = (m*n) - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int row = mid / n; int col = mid % n;
            int flag = matrix[row][col];
            if(flag == target){
                return true;
            } else if(flag < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return false;
    }
}
