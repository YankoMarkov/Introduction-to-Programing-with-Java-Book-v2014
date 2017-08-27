
import java.util.Scanner;

public class upraznenie2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter r= ");
		int r = input.nextInt();
		double pi = Math.PI;
		int d = (2 * r);
		System.out.printf("Perimeter= %.2f * %d = %.3f", pi, d, (pi * d));
		
	}

}
