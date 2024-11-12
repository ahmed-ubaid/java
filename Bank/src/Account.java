import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
    Scanner sc=new Scanner(System.in);
    private String accountName;
    private double balance=0;
    private String customerEmail;
    private Long customerNumber;
    private String accountNumber;
    private HashMap<String,Transaction> transactions=new HashMap<>();
    public Account(){
        System.out.println("Creating a new account");
        System.out.println("Enter the name of the account holder");
        setAccountName(sc.next());
        System.out.println("Enter the email address");
        setCustomerEmail(sc.next());
        System.out.println("Enter the phone number");
        while(true){
            try{
                long num=sc.nextLong();
                if(num<1000000000 ||num>=10000000000L){
                    System.out.println("Invalid entry");
                    System.out.print("Enter again:");
                }else{
                    setCustomerNumber(num);
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid entry");
                System.out.print("Enter again:");
                sc.nextLine();
            }
        }
        this.setAccountNumber();
    }
    public void getDetails(){
        System.out.println("\nAccount details");
        System.out.println("Account owner:"+this.getAccountName());
        System.out.println("Total balance:"+this.getBalance());
        System.out.println("Account number:"+this.getAccountNumber());
        System.out.println("Customer email:"+this.getCustomerEmail());
        System.out.println("Customer number:"+this.getCustomerNumber());
    }
    public void setAccountName(String str){
        this.accountName=str;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public void setCustomerEmail(String email){
        this.customerEmail=email;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public void setCustomerNumber(long num){
        this.customerNumber=num;
    }
    public long getCustomerNumber(){
        return this.customerNumber;
    }
    public void setAccountNumber(){
        this.accountNumber=this.accountName+this.customerNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void sendMoney(double num){
        if(this.balance<num){
            System.out.println("\nTransaction failed:not enough balance ");
        }else{
            System.out.print("\nEnter the account name of the receiver:");
            String tA=sc.next();
            Transaction t=new Transaction(num,tA,this.getAccountName());
            t.setIsSuccess();
            transactions.put(t.getTransactionNumber(), t);
            this.balance=this.balance-num;
            System.out.println("\n"+num+" amount deducted");
            System.out.println("current Balance:"+this.getBalance());
        }
    }
    public void getMoney(double num){
        System.out.print("\nEnter the account name of the sender:");
        String fA=sc.next();
        Transaction t=new Transaction(num,this.getAccountName(),fA);
        transactions.put(t.getTransactionNumber(), t);
        this.balance=this.balance+num;
        System.out.println("\n"+num+" amount received");
        System.out.println("current balance:"+this.getBalance());
    }
    public double getBalance(){
        return this.balance;
    }
    public void getTranscations(){
        System.out.print("\n");
        for (String key : transactions.keySet()) {
            transactions.get(key).getDetails();
        }
    }

}
