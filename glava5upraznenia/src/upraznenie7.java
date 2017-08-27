
import java.util.Scanner;

public class upraznenie7 {

	public static void main(String[] args) {
		// namira podmnozestva s rezultat 0 ot tri 4isla
		Scanner input = new Scanner(System.in);
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();
		System.out.print("c= ");
		int c = input.nextInt();
		if ((a + b) == 0){
			System.out.println("a= " + a + " " + "b= " + b);
		} else {
			if ((b + c) == 0){
				System.out.println("b= " + b + " " + "c= " + c);
			} else {
				System.out.println("Niama podmnozestva");
			}
		}
	}

}
