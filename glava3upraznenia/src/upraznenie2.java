
public class upraznenie2 {

	public static void main(String[] args) {

		int a = 30;
		System.out.println(a / 5);
		System.out.println(a % 5);
		System.out.println(a / 7);
		System.out.println(a % 7);
		int b = (a % 5);
		int c = (a % 7);
		boolean d = (b == 0);
		boolean e = (c == 0);
		System.out.println(d && e);
	}
}
