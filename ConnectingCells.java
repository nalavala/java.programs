package programs;

import java.util.Scanner;

public class ConnectingCells {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] boolArray = new int[n+1][m+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				boolArray[i][j] = scan.nextInt();
			}
		}

		int maxSize = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (boolArray[i][j] == 1) {

					int size =1;
				    size = findCount(boolArray, i, j);
					maxSize = Math.max(size, maxSize);
				}
			}
		}
		
		System.out.println(maxSize);

	}

	private static int findCount(int[][] boolArray, int i, int j) {

		
		if(i<=0 || j<=0 || i>= boolArray.length || j >=boolArray[i].length)
			return 0;
		if (boolArray[i][j] == 0)
			return 0;
		boolArray[i][j] = 0;
		int size = 1;
		for (int row = i - 1; row <= i + 1; row++) {
			for (int col = j - 1; col <= j + 1; col++) {
					if(row!=i || col !=j)
						size += findCount(boolArray,row,col);
			}
		}
		return size;
	}
}
