//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        DynamicStack m=new DynamicStack(5);
//        m.printList();
//
//        System.out.println("\n"+m.pop());
//        m.printList();
//
//        m.push(8);
//        m.printList();
//
//        System.out.println("\n"+m.peek());

        DynamicQueue j=new DynamicQueue(5);
        j.printList();
        j.dequeue();
        j.printList();
        j.enqueue(9);
        j.printList();
    }
}