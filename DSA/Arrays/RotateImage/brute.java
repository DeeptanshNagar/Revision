public class brute {
	public static void main(String[] args) {
		int[][] matrix = {{1,  2,   3,    4},
						  {5,  6,   7,    8},
						  {9,  10,  11,   12},
						  {13, 14,  15,   16}};
		int n = matrix.length;
		int m = matrix[0].length;
		int[][] ans = rotateMatrix(matrix, n, m);
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
	}

	static int[][] rotateMatrix(int[][] matrix, int n, int m) {
		int[][] ans = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ans[j][n - 1 - i] = matrix[i][j];
			}
		}

		return ans;
	}
}
