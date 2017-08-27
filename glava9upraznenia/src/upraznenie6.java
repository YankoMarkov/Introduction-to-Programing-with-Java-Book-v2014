
import java.util.Arrays;

public class upraznenie6 {
	
	public static int firstLargestElement(int[] arr){
		int index = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]){
				index = i;
				break;
			}else{
				index = 0;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		int[] array = {1, 3, 6, 2, 8, 0, 9, 2, 4, 7, 5};
		System.out.println(Arrays.toString(array));
		System.out.println("The first index position of array who is bigger "
							+ "from the next and the previous is: " + firstLargestElement(array));
	}

}
