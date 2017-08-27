
public class upraznenie2 {

	public static void main(String[] args) {
		String text = "We are living in a yellow submarine." + 
						"We don't have anything else. Inside the submarine is very tight." + 
						"So we are drinking all the day. We will move out of it in 5 days.";
		int index = text.indexOf("in");
		int count = 0;
		while (index != -1){
			count++;
			System.out.println("\"in\" found on index: " + index);
			index = text.indexOf("in", index + 1);
		}
		System.out.println("\"in\" fount: " + count + " times");
	}
}
