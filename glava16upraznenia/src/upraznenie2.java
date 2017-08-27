import java.util.Stack;

/**
 * Created by Yanko on 02-Oct-16.
 */
public class upraznenie2 {

    public static void main(String[] args) {
        Stack dinamicStack = new Stack();
        dinamicStack.push("1. Ivan");
        dinamicStack.push("2. Georgi");
        dinamicStack.push("3. Petar");

        System.out.println("Top= " + dinamicStack.peek());
        while (dinamicStack.size() > 0) {
            String names = (String) dinamicStack.pop();
            System.out.println(names);
        }
    }
}
