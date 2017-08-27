import java.util.Scanner;

public class upraznenie6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("\nSum= " + sum);
    }
}
