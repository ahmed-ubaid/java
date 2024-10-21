import java.util.Scanner;

public class sumOfEveryDigit {
    public static int sumDigits(int n){
        if(n<0){
            return -1;
        }
        int sum=0;

        while(n>0){
            sum+=n%10;
            n=n/10;
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        boolean h=true;

        while(h){
            System.out.println("Enter 1 to play again: ");
            int k=sc.nextInt();

            h= (k==1);

            System.out.println("Enter the number");
            int num= sc.nextInt();
            System.out.println(sumDigits(num));
        }

    }

}
