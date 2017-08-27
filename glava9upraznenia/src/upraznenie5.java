
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie5 {
	
	public static void whatIsElement (int position, int[] arr){
		if(position > 0 && position < arr.length){
			if(arr[position] > arr[position + 1]){
				System.out.println("The position " + position + " is higher from the next.");
			}else{
				System.out.println("The position " + position + " is lower from the next.");
			}
			if(arr[position] > arr[position - 1]){
				System.out.println("The position " + position + " is higher from the previous.");
			}else{
				System.out.println("The position " + position + " is lower from the previous.");
			}
		if(position == 0){
			if(arr[position] > arr[position + 1]){
				System.out.println("The position " + position + " is higher from the next.");
			}else{
				System.out.println("The position " + position + " is lower from the next.");
			}
		if(position == arr.length){
			if(arr[position] > arr[position - 1]){
				System.out.println("The position " + position + " is higher from the previous.");
			}else{
				System.out.println("The position " + position + " is lower from the previous.");
			}
			
		}
		}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter position between 0 and 10: ");
		int positionIndex = input.nextInt();
		int[] array = {1, 3, 6, 2, 8, 0, 9, 2, 4, 7, 5};
		System.out.println(Arrays.toString(array));
		whatIsElement(positionIndex, array);
	}

}
