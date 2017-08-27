
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		System.out.print("SumNum= ");
		int num = input.nextInt();
		int sum = 0;
		int bestSum = 0;
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		for(int j = 0; j <= array.length; j++){
			sum += array[j];
			if(sum == num){
				bestSum = sum;
				System.out.println(bestSum);
				
			}
		}
	}

}
