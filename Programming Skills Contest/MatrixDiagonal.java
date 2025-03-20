class Solution {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            result += mat[i][i];
            result += mat[n-1-i][i]; 
        }
        return n % 2 == 0 ? result : result - mat[n/2][n/2];
    }
}
