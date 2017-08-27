
import java.util.Scanner;

public class upraznenie9 {

	public static void reverse(int num){
		int b = num % 10;
		int a = num / 10;
		System.out.printf("Reverse number is: %d%d", b, a);
	}
	
	public static void average(int num){
		double b = num % 10;
		double a = num / 10;
		double c = (a + b) / 2;
		System.out.println("(a + b) / 2");
		System.out.printf("Average number is: (%.2f + %.2f) / 2 = %.2f", a, b, c);
	}
	
	public static void equation(int num){
		double b = num % 10;
		double a = num / 10;
		double x = -b / a;
		System.out.printf("a= %.2f%nb= %.2f%n", a, b);
		System.out.printf("a * x + b = 0%nx= %.2f", x);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number between 1 and 99: ");
		int num = input.nextInt();
		System.out.println("Chouse one of this:" + '\n' + "1- Reverse" + 
							'\n' + "2- Average" + '\n' + "3- Equation a * x + b = 0");
		int a = input.nextInt();
		if(a == 1){
			reverse(num);
		}
		if(a == 2){
			average(num);
		}
		if(a == 3){
			equation(num);
		}
	}
}
