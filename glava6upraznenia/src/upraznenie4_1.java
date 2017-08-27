
public class upraznenie4_1 {

	public static void main(String[] args) {

		String[] color = {"Спатия","Каро","Купа","Пика"};
		String[] number = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		for(int i = 0; i < color.length; i++){
			for(int j = 0; j < number.length; j++){
			System.out.println(number[j] + " " + color[i]);
			}
		}
	}
}
