import java.util.Scanner;

public class Linklist {
    node head;
    int size;
    Scanner scanner = new Scanner(System.in);
    public Linklist(int s){
        this.size=s;
        for(int i=0;i<s;i++){
            System.out.print("Enter element["+i+"]: ");
            int number = scanner.nextInt();
            node newnode=new node(number);

            if(head==null){
                this.head=newnode;
            }else{
                node current=this.head;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newnode;
            }
        }
    }

    public Linklist(){
        this.head=null;
    }

    public Boolean checkEmpty(){
        if(this.head==null){
            return true;
        }else{
            return false;
        }
    }

    public void printlist(){
        System.out.println("\n");
        if(this.head==null){
            System.out.println("Empty list");
        }
        node current=head;
        int i=0;
        while(current!=null){
            System.out.println("element["+i+"]:"+current.value);
            i++;
            current=current.next;
            if(i==this.size){
                break;
            }
        }
    }

    public void insertAtEnd(int val){
        node newnode=new node(val);
        if(this.head==null){
            this.head=newnode;
        }else{
            node current=this.head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
            this.size+=1;
        }
    }

    public void insertAtFront(int val){
        node newnode=new node(val);

        if(this.head==null){
            this.head=newnode;
        }else{
            newnode.next=this.head;
            this.head=newnode;
            this.size+=1;

        }
    }

    public void insertAt(int pos, int val){
        node newnode=new node(val);
        if(this.head==null){
            this.head=newnode;
        }else{
            node current=this.head;
            System.out.println(current.value);
            for(int i=1;i<pos-1;i++) {
                current = current.next;
                System.out.println(current.value);
            }
            newnode.next=current.next;
            current.next=newnode;
            this.size+=1;

        }
    }

    public void removeFront(){
        if(checkEmpty()){
            System.out.println("Empty list");
        }else{
            this.head=this.head.next;
            this.size-=1;
        }
    }

    public void removeEnd(){
        if(checkEmpty()){
            System.out.println("Empty list");
        }else{
            node current= this.head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
            this.size-=1;

        }
    }

    public void sortlink(){
        node current=this.head;

        for(int i=1;i<this.size;i++){
            node nextCurr=current.next;
            for(int j=i;j<this.size;j++){
                if(current.value > nextCurr.value){
                    int temp=current.value;
                    current.value=nextCurr.value;
                    nextCurr.value=temp;
                }
              nextCurr=nextCurr.next;
            }
            current=current.next;
        }
    }
}
