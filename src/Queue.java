public class Queue {
    static final int max_size=100;
    int[] queue=new int[Queue.max_size];
    int size=0;
    int front=-1;
    int tail=-1;
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return tail==Queue.max_size;
    }
    public void enqueue(int val){
        if(isFull()){
            System.out.println("QUEUE OVERLOAD");
            return;
        }else{
            if(front==-1 && tail==-1){
                this.front=0;
                this.tail=0;
                this.queue[front]=val;
            }else{
                this.tail+=1;
                this.queue[this.tail]=val;
            }
            this.size++;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("EMPTY QUEUE");
            return;
        }else{
            if(this.tail==0){
                this.size-=1;
            }else{
                for(int i=0;i<this.size;i++){
                    this.queue[i]=this.queue[i+1];
                }
                this.size-=1;
            }
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty list");
            return -1;
        }else{
            return this.queue[this.front];

        }
    }
    public void printList(){
        if(isEmpty()){
            System.out.println("EMPTY QUEUE");
            return;
        }else{
            System.out.println("\n");
            for(int i=0;i<this.size;i++){
                System.out.println("element["+i+"]:"+this.queue[i]);
            }
        }
    }
}
