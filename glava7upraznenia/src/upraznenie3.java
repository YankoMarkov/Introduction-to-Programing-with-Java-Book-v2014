
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		char[] array1 = new char[n1];
		char[] array2 = new char[n2];
		for(int i = 0; i < array1.length; i++){
			array1[i] = input.next().charAt(0);
		}
		for(int j = 0; j < array2.length; j++){
			array2[j] = input.next().charAt(0);
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.equals(array1, array2));
	}
}
