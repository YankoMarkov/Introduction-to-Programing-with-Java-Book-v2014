
import java.util.Scanner;

public class upraznenie3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Firm name: ");
		String name = input.nextLine();
		System.out.print("Address: ");
		String address = input.nextLine();
		System.out.print("Phone number: ");
		long number = input.nextLong();
		System.out.print("Fax: ");
		long fax = input.nextLong();
		System.out.println("First name: ");
		String firstName = input.nextLine();
		System.out.print("Last name: ");
		String lastName = input.nextLine();
		System.out.print("Phone number: ");
		long phoneNumber = input.nextLong();
		String web ="www." + name + "." + "com";
		System.out.printf("Firm Name: %s%nAddress: %s%nPhone Number: %d%nFax: %d%nWeb: %s%nManager: %s %s%nPhone number: %d",
							name, address, number, fax, web, firstName, lastName, phoneNumber);
	}
}
