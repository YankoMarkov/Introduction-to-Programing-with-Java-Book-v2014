
import java.util.Scanner;

public class upraznenie8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("enter number betwin 1...9: " );
		int num = input.nextInt();
		switch (num){
		case 1:
		case 2:
		case 3: System.out.printf("%d * 10 = %d", num, (num * 10)); break;
		case 4:
		case 5:
		case 6: System.out.printf("%d * 100 = %d", num, (num * 100)); break;
		case 7:
		case 8:
		case 9: System.out.printf("%d * 1000 = %d", num, (num * 1000)); break;
		default: System.out.println("4isloto ne e ot 1 do 9");
		}
	}

}
