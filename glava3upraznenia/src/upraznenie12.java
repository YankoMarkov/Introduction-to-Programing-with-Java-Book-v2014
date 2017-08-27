
import java.util.Scanner;

public class upraznenie12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.println("Number is: " + number);
		int n = number;
		int p = 5;
		int i = 1;
		int mask = i << p;
		System.out.println("p=6, " + ((n & mask) != 0 ? "v=0" : "v=1"));
		System.out.println("n=" + ((n & mask) != 0 ? (~(mask) & n) : (mask | n)));
		
	}

}
