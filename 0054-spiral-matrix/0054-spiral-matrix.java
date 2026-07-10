class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m*n;
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        int firstRow = 0;
        int lastRow = m-1;
        int firstCol = 0;
        int lastCol = n-1;
        while (count < total) {
            //firstRow
            for (int i=firstCol; count < total && i <= lastCol; i++) {
                ans.add(matrix[firstRow][i]);
                count++;
            }
            firstRow++;

            //lastCol
            for (int i=firstRow; count < total && i <= lastRow; i++) {
                ans.add(matrix[i][lastCol]);
                count++;
            }
            lastCol--;

            //lastRow
            for (int i=lastCol; count < total && i >= firstCol; i--) {
                ans.add(matrix[lastRow][i]);
                count++;
            }
            lastRow--;

            //firstCol
            for (int i=lastRow; count < total && i >= firstRow; i--) {
                ans.add(matrix[i][firstCol]);
                count++;
            }
            firstCol++;
        }
        return ans;
    }
}