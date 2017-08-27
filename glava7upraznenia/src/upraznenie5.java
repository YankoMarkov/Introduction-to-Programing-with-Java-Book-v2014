
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		int start = 0;
		int count = 1;
		int bestStart = 0;
		int bestCount = 0;
		for(int i = 0; i < n - 1; i++){
			if(i == 0 || (array[i] - array[i - 1]) != 1){
				count = 1;
				start = i;
			}else{
				count++;
			}
			if(count > bestCount){
					bestStart = start;
					bestCount = count;
			}
		}
		System.out.println("array start from index: " + bestStart);
		System.out.println("Best count is: " + bestCount);
		for(int j = bestStart; j < bestCount + bestStart; j++){
			System.out.print(" " + array[j]);
		}
	}

}
