
import java.util.Scanner;

public class upraznenie8 {
	
	public static long faktoriel(long num){
		long sum = 1;
		for(int i = 1; i < num; i++){
			sum = sum * i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		for(int a = 1; a < n; a++){
			System.out.println("N! from 1 to N is: " + faktoriel(a));
		}
	}

}
