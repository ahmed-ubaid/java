import java.util.*;

public class codechef_stone_pile {

    public static class Queue{
        static public int max_size=100000;

        public int[] queue=new int[max_size];

        int front=-1;
        int tail=-1;

        public void Enqueue(int val){
            if(this.tail==max_size-1){
                System.out.println("Overload");
            }else{
                if(front==-1){
                    this.front=0;
                    this.tail=0;
                    this.queue[this.tail]=val;
                }else{
                    this.tail+=1;
                    this.queue[this.tail]=val;
                }
            }
        }

        public int Dequeue(){
            if(this.tail==-1){
                System.out.println("Empty");
                return -1;
            }else{
                int ret=this.queue[this.front];
                if(this.tail==0){
                    this.tail=-1;
                    this.front=-1;
                }else{
                    for(int i=0;i<=this.tail;i++){
                        this.queue[this.front+i]=this.queue[this.front+(i+1)];
                    }
                    this.tail-=1;
                }
                return ret;
            }
        }

        public void printList(){
            if(this.tail==-1){
                System.out.println("Empty");
            }else{
                for(int i=0;i<=this.tail;i++){
                    System.out.print(this.queue[i]+" ");
                }
            }
        }

    }
    static public Scanner sc=new Scanner(System.in);
    public static void move1(Queue q){
        q.Enqueue(q.Dequeue());
    }
    public static void move2(Queue q){
        q.Dequeue();
    }

    public static void main (String[] args) throws java.lang.Exception{
        System.out.println("Enter number of testcases: ");
        int t=sc.nextInt();

        while(t-->0){
            Queue k=new Queue();
            System.out.println("Enter size of the queue");
            int size=sc.nextInt();
            int turn=-1;

            for(int i=0;i<size;i++){
                k.Enqueue(i);
            }

            k.printList();

            if(k.tail==-1){
                System.out.println("empty list");
            }else{
                int i=0;
                while(k.tail!=0){
                    if(k.tail>0){
                        move1(k);
                        move2(k);
                        turn=0;
                        System.out.println("\nfor turn "+i+"after aman list is");
                        k.printList();
                    }if(k.tail>0){
                        move1(k);
                        move1(k);
                        move2(k);
                        turn=1;
                        System.out.println("for turn "+i+"after akshat list is");
                        k.printList();
                    }
                    i++;
                }
            }

            System.out.println("last:"+k.queue[k.tail]+" person:"+ (turn==0?"aman":"akshat"));
        }

    }
}
