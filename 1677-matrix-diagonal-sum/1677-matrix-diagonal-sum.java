class Solution {
    public int diagonalSum(int[][] matrix) {
        
        int n = matrix.length;
        int diagonal = 0;

        for (int i = 0; i < n; i++) {
            
            diagonal += matrix[i][i];
            
            diagonal += matrix[n - 1 - i][i];
        }
        
        if (n % 2 != 0) {
            diagonal -= matrix[n / 2][n / 2];
        }

        return diagonal;
    }
    
}