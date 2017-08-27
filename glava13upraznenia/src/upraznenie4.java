
public class upraznenie4 {

    public static void main(String[] args) {
        String ilegalWords = "Java, JVM, Microsoft";
        String[] words = ilegalWords.split("[ ,]");
        for(String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        String text = "Microsoft announced its next generation Java compiler today. " +
                "It uses advanced parser and special optimizer for the Microsoft JVM.";
        System.out.println(text);
        text = text.replace("Java", "****");
        text = text.replace("JVM", "***");
        text = text.replace("Microsoft", "*********");
        System.out.println(text);
    }
}
