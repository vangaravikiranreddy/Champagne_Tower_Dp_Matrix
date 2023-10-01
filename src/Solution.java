class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] mat = new double[102][102];
        mat[0][0] = (double)poured;

        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if (mat[i][j] >= 1) {
                    mat[i + 1][j] += (mat[i][j] - 1.0) / 2.0;
                    mat[i + 1][j + 1] += (mat[i][j] - 1.0) / 2.0;
                    mat[i][j] = 1;
                }
            }
        }

        return mat[query_row][query_glass];
    }
}