public class better {
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
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < m; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        return matrix;
	}
}
// tc - O(n²)
// sc - O(n * n/2)