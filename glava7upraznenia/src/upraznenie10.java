
import java.util.Scanner;

public class upraznenie10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("rows= ");
		int rows = input.nextInt();
		System.out.print("cols= ");
		int cols = input.nextInt();
		int[][] arrayA = new int[rows][cols];
		for(int row = 0; row < arrayA.length; row++){
			for(int col = 0; col < arrayA[0].length; col++){

				System.out.printf("%d ", arrayA[row][col]);
			}
			System.out.println();
		}
	}
}
