import java.util.Stack;

public class AppMain {

    public static void main(String[] args) {

        Stack<String> stackList = new Stack();
        stackList.add("123");
        stackList.push("Ali");
        stackList.push("Salih");
        stackList.push("Orhun");
        System.out.println(stackList);

        stackList.pop();
        System.out.println(stackList);

        stackList.add("Burak");

        System.out.println(stackList.peek());
        System.out.println(stackList.lastElement());
        System.out.println(stackList.search("Salih"));

    }
}
