import java.util.Scanner;

class BankManagementSystem {
    private double balance;
    Scanner sc= new Scanner(System.in);
    
    public BankManagementSystem(double balance){
      this.balance = balance;
    }
    public void checkBalance(double balance) {

    System.out.println("Your Balance is :" + balance);
    
    }

    public void Deposit() {
    //double bal;
    System.out.println("Enter money:");
    double balc = sc.nextDouble();
    if(balance >= 0) {
    balance += balc;
    checkBalance(balance);
    }
    else {
        System.out.println("Invalid Deposit");
    }
    }

    public void Withdrawl(double amount)
    {
      if(amount > 0 && amount <= balance ){
      balance  -= amount;
      checkBalance(balance);
    }
    else {
        System.out.println("Invalid withdrawl money");
        
    }
}
private class Account {
     
     public Account(BankManagementSystem bank) {
        
     }
   
    public void start() {
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
           System.out.println("Thank you for visit the Bank Management system.");
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
        Account atm = account.new Account(account);
        atm.start();
     }
}
    
