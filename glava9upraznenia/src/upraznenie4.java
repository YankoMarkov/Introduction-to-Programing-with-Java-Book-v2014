
import java.util.Arrays;
import java.util.Scanner;

public class upraznenie4 {
	
	public static int searchingNumber(int number, int[] str) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == number) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N= ");
		int n = input.nextInt();
		System.out.print("Num= ");
		int num = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++){
			array [i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		System.out.println("The surching number: " + num
							+ " from array is finding " + searchingNumber(num, array)
							+ " time");
	}

}
