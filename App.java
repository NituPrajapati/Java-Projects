import java.util.*;
public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();


       switch (buttom) {
        case 1:
            System.out.println("Hello ");
            break;
        case 2:
            System.out.println("Namste");
            break;
        case 3:
            System.out.println("BOnjur");
            break;
        default:
            System.out.println("Invalid Buttom");
            break;
       }
    sc.close();
    }
}
