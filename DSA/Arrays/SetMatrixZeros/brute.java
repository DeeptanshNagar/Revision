public class brute {
	public static void main(String[] args) {
		int[][] matrix = {{1, 1, 1, 1},
						  {1, 0, 0, 1},
						  {1, 1, 0, 1},
						  {1, 1, 1, 1}};
		int n = matrix.length;
		int m = matrix[0].length;
		int[][] ans = setZeros(matrix, n, m);
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
	}

	static int[][] setZeros(int[][] matrix, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(matrix[i][j] == 0) {
					setRow(matrix, i, m);
					setCol(matrix, j, n);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(matrix[i][j] == -1) {
					matrix[i][j] = 0;
				}
			}
		}

		return matrix;
	}

	static void setRow(int[][] matrix, int i, int m) {
		for (int j = 0; j < m; j++) {
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
			}
		}
	}

	static void setCol(int[][] matrix, int j, int n) {
		for (int i = 0; i < n; i++) {
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
			}
		}
	}
}
