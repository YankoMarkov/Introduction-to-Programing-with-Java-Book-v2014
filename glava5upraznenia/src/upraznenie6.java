
import java.util.Scanner;

public class upraznenie6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();
		System.out.print("c= ");
		int c = input.nextInt();
		System.out.print("d= ");
		int d = input.nextInt();
		System.out.print("e= ");
		int e = input.nextInt();
		if(((a > b) && (a > c)) && ((a > d) && (a > e))){
			System.out.println("a= " + a);
		}else{
			if(((b > a) && (b > c)) && ((b > d) && (b > e))){
				System.out.println("b= " + b);
			}else{
				if(((c > a) && (c > b)) && ((c > d) && (c > e))){
					System.out.println("c= " + c);
				}else{
					if(((d > a) && (d > b)) && ((d > c) && (d > e))){
						System.out.println("d= " + d);
					}else{
						System.out.println("e= " + e);
					}
				}
			}
		}
	}

}
