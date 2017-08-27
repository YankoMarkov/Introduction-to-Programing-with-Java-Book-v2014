
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		System.out.print("K= ");
		int k = input.nextInt();
		int[] array1 = new int[n];
		int[] array2 = new int[k];
		for(int i = 0; i < array1.length; i++){
			array1[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		int sum = 0;
		for(int i = n - k; i < array1.length; i++){
			sum += array1[i];
		}
		for(int i = n - k; i < array1.length; i++){
		System.out.print(" " + array1[i]);
		}
		System.out.println();
		System.out.println(" Sum is: " + sum);
	}
}
