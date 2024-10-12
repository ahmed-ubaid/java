import java.util.Scanner;

class Codechef_necklace_problem
{
    public static class Queue{
        static public int max_size=100;

        public int[] queue=new int[max_size];

        int front=-1;
        int tail=-1;

        public void Enqueue(int val){
            if(this.tail==max_size-1){
                System.out.println("Overload");
                return;
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
                return;
            }else{
                for(int i=0;i<=this.tail;i++){
                    System.out.print(this.queue[i]+" ");
                }
            }
        }

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Queue que=new Queue();
            int size=sc.nextInt();
            int move=sc.nextInt();

            for(int i=0;i<size;i++){
                int num=sc.nextInt();
                que.Enqueue(num);
            }

            for(int i=0;i<move;i++){
                int num=que.Dequeue();
                que.Enqueue(num);
            }
            que.printList();
            System.out.print("\n");
        }
    }
}