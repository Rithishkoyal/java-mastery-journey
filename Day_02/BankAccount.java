package Day_02;

public class BankAccount {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        b2.accountHolder="Vennela";
        b2.accountNumber=678901;
        b2.balance=1000;
        b1.balance=10000;
        b1.accountHolder="Rithish Koyalkar";
        b1.accountNumber=123456;
        b1.deposit(300);
        b1.displayAccount();
        b2.transfer(b1, 100);
       b1.displayAccount();
        b2.displayAccount();
    }
}

class Bank{
    String accountHolder;
long accountNumber;
double balance;
   
    void displayAccount(){
        System.out.println("Account Details");
        System.out.println();
        System.out.println("Name : "+accountHolder);
        System.out.println("Acc.No. : "+accountNumber);
        System.out.println("Bal : "+balance);

    }
      void deposit(double amount){
        balance +=amount;
        System.out.println("Deposited "+amount+" SuccessFully ");
        System.out.println("Remaining Balance : "+ balance);
    }
    void withdraw(double amount){
        if(balance>amount){
        balance-=amount;
        System.out.println("Withdrawn "+amount+ " Successfully ");
        System.out.println("Remaining Balance :"+balance);
        }else{
            System.out.println("Insufficient Balance..");
        }
    }
    void transfer(Bank reciever,double amount){
        if(balance>=amount){
            balance-=amount;//sender losses money
            reciever.balance+=amount;//receiver gains money
        System.out.println("Transferred Succefully");
        }else{
            System.out.println("Insufficient Balance ");
        }
        
    }

}
