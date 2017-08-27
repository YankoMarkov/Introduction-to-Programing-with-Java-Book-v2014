
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		int index = 0;
		int count = 1;
		int bestIndex = 0;
		int bestCount = 0;
		for(int i = 0; i < n - 1; i++){
			if (i == 0 || array[i] != array[i - 1]) {
				count = 1;
				index = i;
			} else {
				count++;
			}
			if (count > bestCount) {
				bestCount = count;
				bestIndex = index;
			}
		}
		System.out.println("Best count is: " + bestCount);
		for(int j = bestIndex; j < bestCount + bestIndex; j++){
			System.out.print(" " + array[j]);
		}
	}

}
