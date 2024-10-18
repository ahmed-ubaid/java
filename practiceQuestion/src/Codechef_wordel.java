import java.util.Scanner;

public class Codechef_wordel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String n=sc.next();

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==n.charAt(i)){
                    System.out.print('G');
                }else{
                    System.out.print('B');
                }
            }
            System.out.print('\n');
        }
    }
}
