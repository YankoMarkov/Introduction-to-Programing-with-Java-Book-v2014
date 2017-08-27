
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie3_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array length: ");
		int x = scanner.nextInt();
		int array[] = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.printf("Enter the value to " + i
					+ " position on the array: ");
			array[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		for(int i = 0; i < x; i++){
		}
		System.out.println("Max value is: " + array[array.length - 1]);
		System.out.println("Min value is: " + array[0]);
	}

}
