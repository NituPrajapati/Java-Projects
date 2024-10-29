import java.util.Scanner;

class BankManagementSystem {
    public double balance;
    Scanner sc= new Scanner(System.in);
    //public static void start();
    public BankManagementSystem(double Balance){
      this.balance = Balance;
    }
    public void checkBalance(double balance) {

    System.out.println("Your Balance is :" + balance);
    
    }

    public void Deposit() {
    //double bal;
    System.out.println("Enter money:");
    double balc = sc.nextDouble();
    if(balance > 0) {
    balc =+ balance;
    checkBalance(balc);
    }
    else {
        System.out.println("Invalid Deposit");
    }
    }

    public void Withdrawl(double amount)
    {
      if(amount > 0 && amount <= balance ){
      amount  -= balance;
      checkBalance(amount);
    }
    else {
        System.out.println("Invalid withdrawl money");
        
    }
}
public class ATM {
     public BankManagementSystem account;
     //private Scanner sc;
     public ATM(BankManagementSystem bank) {
        //this.account = account;
        //this.Scanner = new Scanner(System.in);
     }
    //double balc;
    public void start() {
        //bank.Start();
        boolean exit = false;
        while(!exit) {
     System.out.println("Enter the ATM Menu :");
     System.out.println("1. Check Balance ");
     System.out.println("2. Deposit");
     System.out.println("3. Withdrawl");
     System.out.println("4. Exit");
     int choice = sc.nextInt();
     switch (choice) {
        case 1:
            checkBalance(balance);
            break;
        case 2:
            Deposit();
            break;
        case 3:
        System.out.println("Enter the Money to debit :");
        double amount = sc.nextDouble();
            Withdrawl(amount);
            break;
        case 4:
           exit = true;
           System.out.println("Thank you for visit our Bank Management system.");
           break;
        default:
        System.out.println("Invalid number,Please Enter Correct number");
            break;
      }
     }
   sc.close(); 
}
}
    
    public static void main(String[] args) {
        BankManagementSystem account = new BankManagementSystem(1000);
        //account.new atm();
        ATM atm = account.new ATM(account);
        atm.start();
     }
}
    
