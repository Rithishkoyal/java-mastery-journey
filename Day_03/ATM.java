package Day_03;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
      
      
        Scanner sc = new Scanner(System.in);
    

System.out.print("Enter Account Holder Name: ");
String accountHolder = sc.nextLine();

System.out.print("Enter Account Number: ");
long accountNumber = sc.nextLong();

System.out.print("Enter Initial Balance: ");
double balance = sc.nextDouble();
        ATMManagement atm = new ATMManagement(accountHolder,accountNumber,balance);


        while(true){
            atm.showMenu();
            System.out.println();
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            if(choice == 1){
                atm.display();
            }else if(choice ==2){
                System.out.print("Enter amount : ");
                double amount = sc.nextDouble();
                atm.deposit(amount);
            }
            else if(choice == 3){
                atm.checkBalance();
            }
            else if(choice == 4){
                System.out.print("Enter amount : ");
                double amount = sc.nextDouble();
                atm.withdraw(amount);
            }
            else if(choice == 5){
                System.out.println("Thank You ...");
                break;
            }
        }


     
    }
}

class ATMManagement{
String accountHolder;
long accountNumber;
double balance;

ATMManagement(String accH,long accN,double bal){
    accountHolder = accH;
    accountNumber = accN;
    balance = bal;
}


void display(){
    System.out.println("Account Holder : "+accountHolder);
    System.out.println("Account Number : "+accountNumber);
    System.out.println("Balance : "+balance);
} void deposit(double amount){
    
                System.out.println();
                System.out.println("Amount "+amount+ "Deposited Successfully...");
    balance = balance +amount;
}
void withdraw(double amount){
    if(balance>amount){
 balance-=amount;
 System.out.println("Amount"+amount +"Withrawn Successfully...");
    }else{
        System.out.println("Insufficient Balance..");
    }
   
}
void checkBalance(){
    System.out.println("Your Balance is : "+balance);
}

void showMenu(){
     System.out.println("============ATM============");
        System.out.println();
        System.out.println();
        System.out.println("1. Display Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
}


}