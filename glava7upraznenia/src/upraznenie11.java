
public class upraznenie11 {

	public static void main(String[] args) {

		int[][] array = {
				{0, 6, 4, 8, 2, 3, 4},
				{8, 9, 7, 1, 6, 0, 6},
				{8, 5, 6, 1, 7, 0, 9},
				{8, 4, 7, 3, 9, 1, 7},
				{6, 8, 3, 0, 7, 3, 5}
		};
		int bestSum = Integer.MIN_VALUE;
		int bestRow = 0;
		int bestCol = 0;
		for(int row = 0; row < array.length - 2; row++){
			for(int col = 0; col < array[0].length - 2; col++){
				int sum = array[row][col] + array[row][col + 1] + array[row][col + 2]
						+ array[row + 1][col] + array[row + 1][col + 1] + array[row + 1][col + 2]
						+ array[row + 2][col] + array[row + 2][col + 1] + array[row + 2][col + 2];
				if(sum > bestSum){
					bestSum = sum;
					bestRow = row;
					bestCol = col;
					
				}
			}
		}
		System.out.println("The best platform is:");
		System.out.printf(" %d %d %d%n", array[bestRow][bestCol], array[bestRow][bestCol + 1], 
											array[bestRow][bestCol + 2]);
		System.out.printf(" %d %d %d%n", array[bestRow + 1][bestCol], array[bestRow +1][bestCol + 1],
											array[bestRow +1][bestCol +2]);
		System.out.println("The maximal sum is: " + bestSum);
		
	}
}


