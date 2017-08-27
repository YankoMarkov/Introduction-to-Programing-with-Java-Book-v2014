import java.util.Scanner;

public class upraznenie4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int count = 0;
        for (int i = a; i <= b ; i++) {
            if (i % 5 == 0) {
                count++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nCount= " + count);
    }
}
