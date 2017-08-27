
import java.util.Scanner;

public class upraznenie7_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number abc: ");
		int num = input.nextInt();
		number(num);
	}

	public static void number(int num){
		while(num != 0){
			System.out.print(num % 10);
			num = num / 10;
		}
	}
}
