import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LibraryManagementSystem {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       ArrayList<String> books = new ArrayList<>();
      
       books.add("JavaScript & JQuery");     //Jon Duckett
       books.add("Clean Code");     //Robert C. Martin
       books.add("Python Crash Course");   //Eric Matthews
       //books.add("The Clean Coder");    //Robert Cecil Martin
       //books.add("Code Complete");  //S . McConnell
       //books.add("Spring in Action");    //Craig Walls
       
        while(true){
        System.out.println("****Welcome To Library****");
        System.out.println("1. Search Boooks.");
        System.out.println("2. Add Books.");
        System.out.println("3. Remove Books.");
        System.out.println("4. Show Books.");
        System.out.println("5. Exit!");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Enter the Book Name Which you want to Search in library :");
            String i=sc.next();
            books.contains(i);
                break;

            case 2:
            System.out.println("Enter the Book Name Which you want to add in library :");
            String j=sc.next();
            books.add(j);
                break;
            case 3:
            System.out.println("Enter the Book Name Which you want to Remove from library :");
            String k=sc.next();
            books.remove(k);
                break;
            case 4:
            System.out.println("Books Available in library :");
            for (String book : books) {
                System.out.println(book);
            }
            
                break;
            case 5:
            
            System.out.println("Thank You to Visit Us :)");
            System.exit(0);

            default:
            System.out.println("Please Enter Valid Number....");
                break;
        }
        }
        
       }
       }

