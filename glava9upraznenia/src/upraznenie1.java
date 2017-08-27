
import java.util.Scanner;

public class upraznenie1 {
	
	public static void printName(String name){
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input Name:");
		String name = input.nextLine();
		printName(name);
	}
}
