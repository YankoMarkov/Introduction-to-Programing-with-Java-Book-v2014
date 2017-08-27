
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		for(int i = 0; i < array.length - 1; i++){
			for(int j = i + 1; j < array.length; j++){
				if(array[i] > array[j]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for(int i = 0; i < array.length; i++){
			System.out.print(" " + array[i]);
		}
	}
}
