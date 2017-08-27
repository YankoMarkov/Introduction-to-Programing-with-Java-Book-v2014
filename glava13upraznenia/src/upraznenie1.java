
public class upraznenie1 {

    public static String revText(String text) {
        StringBuilder reversText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0 ; i--) {
            reversText.append(text.charAt(i));
        }
        System.out.println(text);
        return reversText.toString();
    }

    public static void main(String[] args) {
        String text = "introduction";
        System.out.println(revText(text));
    }

}
