
import java.util.Scanner;

public class upraznenie7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number abc: ");
		int num = input.nextInt();
		number(num);
	}
	
	public static void number(int num){
		int a = num % 10;
		int b1 = num / 10;
		int b = b1 % 10;
		int c1 = b1 / 10;
		int c = c1 % 10;
		System.out.printf("%d%d%d", a, b, c);
	}
}
