
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("array length: N= ");
		int n = input.nextInt();
		System.out.print("Num: ");
		int num = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int lower = 0;
		int upper = n;
		int count = 1;
		int position;
		position = (lower + upper) / 2;
		while((array[position] != num) && (lower <= upper)){
			if (num < lower || num > upper) {
				break;
			}
			count++;
			if(array[position] > num){
				upper = position - 1;
			}else{
				lower = position + 1;
			}
			position = (lower + upper) / 2;
		}
		if(num < lower || num > upper){
			System.out.println("Sorry the number is not in this array. The binary search made: " +
					count + " comparison");
		}else{
			System.out.println("The number was found in array index: " + position);
			System.out.println("The binary search found the nuber after: " + count + " comparison");
		}
	}

}
