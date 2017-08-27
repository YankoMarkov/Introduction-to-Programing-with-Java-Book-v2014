
import java.util.Scanner;

public class upraznenie1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();
		if (a > b){
			System.out.printf("a= %d%nb= %d", b, a);
		}else{
			System.out.printf("a= %d%nb= %d", a, b);
		}
	}

}
