
import java.util.Scanner;

public class upraznenie1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a= ");
		int a = input.nextInt();
		System.out.print("Enter b= ");
		int b = input.nextInt();
		System.out.print("Enter c= ");
		int c = input.nextInt();
		System.out.printf("Sum= " + "%d + %d + %d = %d", a, b, c, (a + b + c));
		
	}

}
