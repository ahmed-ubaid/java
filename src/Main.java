import java.util.Scanner;

public class Main {
    public static boolean ValidStrig(String S){
        //this function will see if the strings constain valid paranethesis
        if(S.charAt(0)==')' || S.charAt(S.length()-1)=='('){
            return false;
        }
        Stack stack=new Stack();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                stack.push(S.charAt(i));
            }else if(S.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of tries:");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter string-"+(t+1)+":");
            String st=sc.next();
            if(ValidStrig(st)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }
}
