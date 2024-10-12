import java.util.Scanner;

public class DynamicQueue {
    node front=null;
    node tail=null;
    Scanner scanner = new Scanner(System.in);

    int size=0;
    public DynamicQueue(int s){
        this.size=s;
        for(int i=0;i<this.size;i++){
            System.out.print("element["+i+"]:");
            int num=scanner.nextInt();

            node newnode=new node(num);
            if(this.front==null){
                this.front=newnode;
                this.tail=newnode;
                this.tail.prev=this.front;
            }else{
                newnode.prev=this.tail;
                this.tail.next=newnode;
                this.tail=newnode;
            }
        }
    }
    public int peek(){
        return this.front.value;
    }
    public boolean isEmpty(){
        return this.front==null;
    }
    public void printList(){
        System.out.println("\n");
        if(isEmpty()){
            System.out.println("Empty queue");
        }else{
            node current=this.front;
            for(int i=0;i<this.size;i++){
                System.out.println("element["+i+"]:"+current.value);
                current=current.next;
            }
        }

    }
    public void enqueue(int val){
        node newnode=new node(val);
        if(this.front==null){
            this.front=newnode;
            this.tail=newnode;
            this.tail.prev=this.front;
        }else{
            newnode.prev=this.tail;
            this.tail.next=newnode;
            this.tail=newnode;
            this.size+=1;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return;
        }else{
            this.front=this.front.next;
            this.size-=1;
        }
    }

}
