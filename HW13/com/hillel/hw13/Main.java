package HW13.com.hillel.hw13;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(
        new String[] {"1","2","3" });
        list.addLast("59");
        list.addLast("18");
        list.addFirst("a");
        System.out.println(list.size());

    }
}
