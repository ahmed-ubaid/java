//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack list=new Stack();
        for(int i=0;i<4;i++){
         list.push(i);
        }
        list.printStack();
        System.out.println("\nlist[top]"+list.stack[list.top]);
        System.out.println("\nlist size"+list.size);

    }
}