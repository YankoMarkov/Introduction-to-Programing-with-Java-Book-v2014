
import java.util.Scanner;

public class upraznenie11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the K! ");
		long K = scan.nextLong();
		long sum = K;
		for (long i = K; i > 1; i--) {
			sum *= (i - 1);
		}
		K = sum;
		System.out.println("K! is " + K);
		int count = 0;
		for (long tmp = K; tmp % 5 == 0; tmp /= 5) {
			count++;
		}
		System.out.println("K! finish with " + count + " \"0\"");
	}

}
