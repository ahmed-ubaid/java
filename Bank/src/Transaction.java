import java.util.Scanner;

public class Transaction {
    Scanner sc=new Scanner(System.in);
    static long number=0;
    private double amount;
    private String toAccount;
    private String fromAccount;
    private String transactionNumber;
    private boolean isSuccess=false;
    public Transaction(double a,String tA,String fA){
        this.setAmount(a);
        this.setToAccount(tA);
        this.setFromAccount(fA);
        this.setTransactionNumber();
    }
    public void getDetails(){
        System.out.println("\nTransaction number:"+this.getTransactionNumber());
        System.out.println("Transaction status:"+(isSuccess?"Complete":"Fail"));
        System.out.println("Amount:"+this.getAmount());
        System.out.println("From account:"+this.getFromAccount());
        System.out.println("To sccount:"+this.getToAccount());
    }
    public void setAmount(double a){
        this.amount=a;
    }
    public double getAmount(){
        return this.amount;
    }
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }
    public String getToAccount(){
        return this.toAccount;
    }
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }
    public String getFromAccount(){
        return this.fromAccount;
    }
    public void setTransactionNumber() {
        this.transactionNumber = ""+(Transaction.number++);
    }
    public String getTransactionNumber(){
        return this.transactionNumber;
    }
    public void setIsSuccess(){
        this.isSuccess=true;
    }
}
