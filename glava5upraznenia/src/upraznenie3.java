
import java.util.Scanner;

public class upraznenie3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();
		System.out.print("c= ");
		int c = input.nextInt();
		if ((a > b) && (a > c)){
			System.out.println("a= " + a);
		}else{
			if ((b > c) && (b > a)){
				System.out.println("b= " + b);
			}else{
				System.out.println("c= " + c);
			}
		}
	}

}
