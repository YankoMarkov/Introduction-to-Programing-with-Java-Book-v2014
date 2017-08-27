
import java.util.Scanner;

public class upraznenie2_2 {

	public static int getMax(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("Max number is: " + getMax(a, b, c));
	}
}
