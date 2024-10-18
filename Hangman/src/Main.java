import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String[] dict={"animal","plant","planet","laptop"};

        boolean playing=true;

        while(playing){
            int life=5;
            System.out.println("Press a to play");
            System.out.println("Press b to play");
            System.out.print("Enter your choice: ");
            String h=sc.next();

            while(!h.equals("a") && !h.equals("b")){
                System.out.println("Invalid choice please enter a valid choice: ");
                h=sc.next();
            }

            playing=h.equals("a");
            if(!playing){
                break;
            }

            int r=random.nextInt(dict.length);
            String selected=dict[r];
            char[] word=new char[selected.length()];
            Arrays.fill(word,'_');
            //System.out.println("your letter: "+selected);
            System.out.println(word);

            while(life!=0){
                System.out.println("Enter your guess: ");
                String guess=sc.next();
                char guesChar=guess.charAt(0);
                char[] guessArr=new char[5];

                if(selected.indexOf(guesChar)==-1){
                    System.out.println("Wrong guess");
                    life--;
                }else{
                    
                    for(int i=0;i<selected.length();i++){
                        if(selected.charAt(i)==guesChar)
                            word[i]=guesChar;
                    }

                    boolean isfull=true;
                    for (char c : word) {
                        if (c == '_') {
                            isfull = false;
                        }
                    }

                    System.out.println(word);

                    if(isfull){
                        break;
                    }
                }
            }

        }
        System.out.println("OUT");

    }
}