class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;

        // transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse each row
        for(int[] row : matrix){
            int start = 0;
            int end = n-1;
            while(start < end){
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                start++;
                end--;
            }

        }
    }
}
