
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int[] array1 = new int[n1];
		int[] array2 = new int[n2];
		for (int i = 0; i < array1.length; i++){
			array1[i] = input.nextInt();
		}
		for (int j = 0; j < array2.length; j++){
			array2[j] = input.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.equals(array1, array2));
	}
}

