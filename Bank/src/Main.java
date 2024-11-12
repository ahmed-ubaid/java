//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account ubaid=new Account();
        ubaid.getDetails();
        ubaid.getMoney(12000);
        ubaid.sendMoney(200);
        ubaid.getDetails();
        ubaid.getTranscations();
    }
}