
import java.util.Scanner;

public class upraznenie10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.println("Number ABCD is: " + number);
		System.out.println("D is: " + number % 10);
		int b = (number / 10);
		System.out.println("C is: " + b % 10);
		int c = (b / 10);
		System.out.println("B is: " + c % 10);
		int d = (c / 10);
		System.out.println("A is: " + d % 10);
		int e = (number % 10);
		int f = (b % 10);
		int g = (c % 10);
		int h = (d % 10);
		int sum = (e + f + g + h);
		System.out.println("Sum = " + sum);
		String z = "DCBA: " + e + f + g + h;
		System.out.println(z);
		String m = "DABC: " + e + h + g + f;
		System.out.println(m);
		String x = "ACBD: " + h + f + g + e;
		System.out.println(x);
		
	}

}
