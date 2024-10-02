import java.util.Scanner;

public class DynamicStack {
    node top=null;
    int size=0;
    Scanner scanner = new Scanner(System.in);
    public DynamicStack(int s){
        this.size=s;
        for(int i=0;i<this.size;i++){
            System.out.print("element["+i+"]:");
            int num= scanner.nextByte();
            node newnode=new node(num);
            if(isEmpty()){
                this.top=newnode;
            }else{
                newnode.prev=this.top;
                this.top.next=newnode;
                this.top=newnode;
            }
        }
    }
    public boolean isEmpty(){
        return this.top==null;
    }
    public void printList(){
        System.out.println("\n");
        node current=this.top;
        while(current!=null){
            System.out.print(current.value+"->");
            current=current.prev;
        }
    }
    public void push(int val){
        node newnode=new node(val);
        newnode.prev=this.top;
        this.top.next=newnode;
        this.top=newnode;
        this.size+=1;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("STACK UNDERFLOW");
            return -1;
        }else{
            int val=this.top.value;
            this.top=this.top.prev;
            this.top.next=null;
            this.size-=1;
            return val;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("STACK UNDERFLOW");
            return -1;
        }else{
            return this.top.value;
        }
    }
}
