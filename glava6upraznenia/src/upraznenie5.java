
import java.util.Scanner;

public class upraznenie5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int fib = scan.nextInt();
		int n = 0;
		int number[] = new int[fib];
		for (int i = 0; i <= fib - 1; i++) {
			if (n <= 2){
				number[i] = n;
				System.out.print(n + " ");
				n++;
			}
			else{
			System.out.print((number[i] = number[i - 1] + number[i - 2]) + " ");
			}
		}
	}
}
