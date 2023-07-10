class Solution {
    public void transpose(int n, int[][] a) {
        // Iterate over each element of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap the elements at (i, j) and (j, i)
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
