
import java.util.Scanner;

public class upraznenie5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();
		System.out.print("c= ");
		int c = input.nextInt();
		int x = (b * b) - (4 * a * c);
		int d = (int) Math.sqrt(x);
		if(d == 0){
			int x12 = (-b / (2 * a));
			System.out.println("x12= " + x12);
		}else{
			if(d > 0){
				int x1 = ((-b + d) / (2 * a));
				int x2 = ((-b - d) / (2 * a));
				System.out.println("x1= " + x1 + "\n" + "x2= " + x2);
			}else{
				if(d < 0){
					System.out.println("���� ������ ������");
				}
			}
		}
	}

}
