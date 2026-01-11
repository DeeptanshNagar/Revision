import java.util.ArrayList;

public class brute {
	public static void main(String[] args) {
		int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
        };
        ArrayList<Integer> result = spiralMatrix(matrix);
        System.out.println(result);
	}

	static ArrayList<Integer> spiralMatrix(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		ArrayList<Integer> list = new ArrayList<>();

		int srow = 0;
		int erow = n - 1;
		int scol = 0;
		int ecol = m - 1;

		while(srow <= erow && scol <= ecol) {
			// Top row
			for(int j = scol; j <= ecol; j++) {
				list.add(matrix[srow][j]);
			}

			// Right column
			for (int i = srow + 1; i <= erow ; i++) {
				list.add(matrix[i][ecol]);
			}

			// Bottom row
			if(srow != erow) {
				for (int j = ecol - 1; j >= scol ; j--) {
					list.add(matrix[erow][j]);
				}
			}

			// left Column
			if(scol != ecol) {
				for (int i = erow - 1; i > srow; i--) {
					list.add(matrix[i][scol]);
				}
			}

			srow++;
			ecol--;
			erow--;
			scol++;
		}
		return list;
	}
}
