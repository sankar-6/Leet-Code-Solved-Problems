class Solution {
    public void setZeroes(int[][] matrix) {
        int [] column= new int[matrix[0].length];
        int[] row = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    column[j]=1;
                    row[i]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 || column[j]==1){
                    matrix[i][j]=0;

                }
            }
        }
    }
}
