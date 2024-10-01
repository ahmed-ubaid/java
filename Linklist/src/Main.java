//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        DoublyList m=new DoublyList(5);
        m.printList();

        System.out.println("\n");
        m.addAt(2,9);
        m.printList();

        m.remove(2);
        m.printList();

    }

}