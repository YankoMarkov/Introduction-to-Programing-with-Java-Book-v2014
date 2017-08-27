
public class upraznenie5 {

    public static void main(String[] args) {
        String text = "http://www.devbg.org/forum/index.php";
        System.out.println(text);
        int index1 = text.indexOf("://");
        String protocol = text.substring(0, index1);
        int index2 = text.indexOf("/", index1 + 3);
        String server = text.substring(index1 + 3, index2);
        String resource = text.substring(index2, text.length());
        System.out.println("[protocol] = " + protocol);
        System.out.println("[server] = " + server);
        System.out.println("[resource] = " + resource);
    }
}
