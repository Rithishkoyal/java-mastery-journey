package Day_04;

public class BankAccount {
 private String accountHolder;
 private long accountNumber;
 private double balance;

public void setAccountHolder(String accountHolder){
    if(accountHolder==null || accountHolder.isBlank()){
        System.out.println("Account holder name is not empty");

    }
    else{
        this.accountHolder = accountHolder;
    }
}

public void setAccountNumber(long accountNumber){
    if(accountNumber>0){
        this.accountNumber = accountNumber;
    }else{
        System.out.println("Account number is should not be negative");

    }
}

public void setBalance(double balance){
    if(balance>=0){
        this.balance = balance;
    }else{
        System.out.println("Balance cannot be negative");
    }
}

public String getAccountHolder(){
    return accountHolder;
}
public long getAccountNumber(){
    return accountNumber;
}

public double getBalance(){
    return balance;
}

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountHolder("Rithish Koyalkar");
        b.setAccountNumber(123456);
        b.setBalance(200000);
        System.out.println("Account Holder : "+b.getAccountHolder());
        System.out.println("Account Number : "+b.getAccountNumber());
        System.out.println("Account Balance : "+b.getBalance());
        b.setBalance(-20000);
        b.setAccountNumber(-8888888);
    }
}
