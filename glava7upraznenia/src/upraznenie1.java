
import java.util.Arrays;

public class upraznenie1 {

	public static void main(String[] args) {

		int[] array = new int[20];
		for (int i = 0; i < array.length; i++){
			array[i] = 5 * i;
		}
		System.out.println(Arrays.toString(array));
	}
}
