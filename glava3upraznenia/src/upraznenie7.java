
import java.util.Scanner;

public class upraznenie7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.print("Enter number: "); 
		int number = input.nextInt();
		System.out.println(number - (0.17 * number));
		
	}

}
