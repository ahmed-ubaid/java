import java.util.Scanner;

public class Codechef_different_consecutive_characters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
