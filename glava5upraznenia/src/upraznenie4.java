
import java.util.Scanner;

public class upraznenie4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 0-9: ");
		int number = input.nextInt();
		switch (number){
		case 0: System.out.print("����"); break;
		case 1: System.out.print("����"); break;
		case 2: System.out.print("���"); break;
		case 3: System.out.print("���"); break;
		case 4: System.out.print("������"); break;
		case 5: System.out.print("���"); break;
		case 6: System.out.print("����"); break;
		case 7: System.out.print("�����"); break;
		case 8: System.out.print("����"); break;
		case 9: System.out.print("�����"); break;
		default: System.out.print("������� �� � �� 0 �� 9"); break;
		}
	}

}
