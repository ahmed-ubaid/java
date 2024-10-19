import java.util.Scanner;

public class checkPrimeNumber {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to check: ");
        int n=sc.nextInt();
        int num=0;
        boolean flag;
        for(int i=1;i<=n;i++){
            flag=true;
            if(i==1){
                continue;
            }
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                num+=1;
                System.out.println(i+" is prime");
            }
        }
        System.out.println(num+"number of number are prime");
    }
}