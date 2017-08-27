
import java.util.Scanner;

public class upraznenie2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		for (int num = 0; num <= n; num++){
			if (num % 3 != 0 && num % 7 != 0){
				System.out.println(num);
			}
			
		}
	}
}

