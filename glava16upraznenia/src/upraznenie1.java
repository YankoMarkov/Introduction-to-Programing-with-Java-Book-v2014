import java.util.LinkedList;
import java.util.List;

public class upraznenie1 {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(5);
        list.add("Pesho");
        list.add(89);
        list.add("Gosho");
        list.remove(2);
        list.contains("Gosho");
        list.add(0, 77);

        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.println("Index= " + i + " Value= " + value);
        }
    }
}
