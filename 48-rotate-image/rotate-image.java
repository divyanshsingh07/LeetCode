class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int r[][] = new int[n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                r[j][n-i-1]=matrix[i][j];

            }
        }
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r[i][j];
            }
        }
    }
}