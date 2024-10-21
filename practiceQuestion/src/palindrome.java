import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean isPalin=true;

        for(int i = 0, j = str.length() - 1; i < j ; i++, j--){
            if(str.charAt(i)!=str.charAt(j)){
                isPalin=false;
                break;
            }
        }
        System.out.println(str+" is palindrom "+isPalin);
    }
}
