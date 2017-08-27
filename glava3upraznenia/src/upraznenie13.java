
import java.util.Scanner;

public class upraznenie13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("n= ");
		int n = input.nextInt();
		for (int i = 0; i < (Math.sqrt(n)); i++){
			n /= Math.sqrt(n);
		}
		System.out.println(n);
		
	}

}
