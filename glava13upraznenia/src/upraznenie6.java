
public class upraznenie6 {

    public static void main(String[] args) {
        String text = "C# is not C++ and PHP is not Delphi";
        String[] str = text.split(" ");
        for (String txt : str) {
            System.out.print(txt + " ");
        }
        System.out.println();
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
    }
}
