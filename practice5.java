
import java.util.LinkedList;
import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        list.add("nitu");
        list.add("moni");
        list.add("priya");
        System.out.println(list);
        String i = sc.next();
        list.contains(i);
        System.out.println(list);
    }
}
