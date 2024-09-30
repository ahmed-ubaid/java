public class CircleList extends Linklist{

    node tail;

    public CircleList(){
        this.head=null;
        this.tail=null;
    }

    public CircleList(int s){
        this.size=s;
        for(int i=0;i<s;i++){
            System.out.print("element["+i+"]:");
            int number=scanner.nextInt();
            node newnode=new node(number);
            if(this.head==null){
                ifEmpty(newnode);
            }else{
                newnode.next=this.head;
                this.tail.next=newnode;
                this.tail=newnode;
            }
        }
    }

    public void ifEmpty(node n){
        this.head=n;
        this.tail=n;
        this.tail.next=this.head;
    }

    public void insertAtend(int val){
        System.out.println("this is inside circle list");
        node newnode=new node(val);
        if(checkEmpty()){
            ifEmpty(newnode);
        }else{
                newnode.next=this.head;
                this.tail.next=newnode;
                this.tail=newnode;
        }
        this.size+=1;
    }

    public void insertAtFront(int val){
        node newnode=new node(val);
        if(checkEmpty()){
            ifEmpty(newnode);
        }else{
            newnode.next=this.head;
            this.head=newnode;
            this.tail.next=newnode;
        }
        this.size+=1;
    }

    public void removeFront(){
        if(checkEmpty()){
            System.out.println("Empty list");
        }else if(this.size==1){
            this.head=null;
            this.tail=null;
        }else{
            this.head=this.head.next;
            this.tail.next=this.head;
        }
        this.size-=1;
    }

    public void removeEnd(){
        if(checkEmpty()){
            System.out.println("Empty list");
        }else if(this.size==1){
            this.head=null;
            this.tail=null;
        }else{
            node current=this.head;
            for(int i=1;i<size-1;i++){
                current=current.next;
            }
            current.next=this.head;
            this.tail=current;
        }
        this.size-=1;
    }

    public void removeAt(int pos){
        if(checkEmpty()){
            System.out.println("Empty list");
        }else{
            node current=this.head;
        }
    }
}
