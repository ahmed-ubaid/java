import java.util.Scanner;

public class DoublyList{
    DoublyNode head;
    DoublyNode tail;
    int size;
    Scanner scanner = new Scanner(System.in);

    public DoublyList(int s){
            this.size=s;
            for(int i=0;i<this.size;i++){
                System.out.print("element["+i+"]:");
                int num= scanner.nextInt();
                DoublyNode newnode=new DoublyNode(num);

                if(this.head==null){
                    this.head=newnode;
                    this.tail=newnode;
                    this.head.next=this.tail;
                    this.tail.prev=this.head;

                }else{
                    this.tail.next=newnode;
                    newnode.prev=this.tail;
                    this.tail=newnode;
                }
            }
    }
    public void checkifEmpty(DoublyNode n){
        this.head=n;
        this.tail=n;
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    public void printList(){
        System.out.println("\n");
        if(this.head==null){
            System.out.println("List empty");
        }else{
            DoublyNode current=this.head;
            int i=0;
            while(current!=null){
                System.out.println("element["+i+"]:"+current.value);
                current=current.next;
                i++;
            }
        }
    }
    public void addEnd(int val){
        DoublyNode newnode=new DoublyNode(val);
        if(this.head==null){
            checkifEmpty(newnode);
        }else{
            newnode.prev=this.tail;
            this.tail.next=newnode;
            this.tail=newnode;
        }
        this.size+=1;
    }
    public void addFront(int val){
        DoublyNode newnode=new DoublyNode(val);
        if(this.head==null){
            checkifEmpty(newnode);
        }else{
            newnode.next=this.head;
            this.head.prev=newnode;
            this.head=newnode;
        }
        this.size+=1;

    }
    public void addAt(int pos,int val){
        DoublyNode newnode=new DoublyNode(val);
        if(this.head==null){
            checkifEmpty(newnode);
        }else if(pos==0){
            newnode.next=this.head;
            this.head.prev=newnode;
            this.head=newnode;
        }else{
            DoublyNode current=this.head;
            for(int i=0;i<pos;i++){
                current=current.next;
            }
            newnode.next=current;
            newnode.prev=current.prev;
            current.prev.next=newnode;
            current.prev=newnode;
        }
        this.size+=1;

    }
    public void removeFront(){
        if(this.head==null){
            System.out.println("empty list");
            return;
        }else if(this.size==1){
            this.head=null;
            this.tail=null;
            this.size-=1;
        }else{
            this.head=this.head.next;
            this.head.prev=null;
            this.size-=1;
        }
    }
    public void removeEnd(){
        if(this.head==null){
            System.out.println("empty list");
            return;
        }else if(this.size==1){
            this.head=null;
            this.tail=null;
            this.size-=1;
        }else{
            this.tail=this.tail.prev;
            this.tail.next=null;
            this.size-=1;
        }
    }
    public void remove(int pos){
        DoublyNode newnode=this.head;
        if(pos==0){
            removeFront();
        }else if(pos==this.size){
            removeEnd();
        }else{
            DoublyNode current=this.head;
            for(int i=0;i<pos;i++){
                current=current.next;
            }
            current.prev.next=current.next;
            current.next.prev=current.prev;
            this.size-=1;
        }
    }
}
