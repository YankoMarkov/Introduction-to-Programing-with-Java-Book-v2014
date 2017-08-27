
import java.util.Scanner;

public class upraznenie11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.println("Number is: " + number);
		int n = number;
		int p = 6;
		int i = 1;
		int mask = i << p;
		System.out.println("p=6-> " + ((n & mask) != 0 ? 1 : 0));
		
	}

}
