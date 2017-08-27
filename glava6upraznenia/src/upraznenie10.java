
import java.util.Scanner;

public class upraznenie10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("N<20");
		System.out.print("n= ");
		int n = input.nextInt();
		for(int row = 1; row <= n; row++){
			for(int col = row; col <= n + (row - 1); col++){
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
