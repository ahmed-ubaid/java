public class Stack {
    static final int max_size=100;
    int[] stack=new int[Stack.max_size];
    int top=-1;
    int size=0;


    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean ifFull(){
        return this.top==Stack.max_size;
    }
    public void push(int val){
        if(ifFull()){
            System.out.println("STACK OVERFLOW");
            return;
        }else{
            this.top++;
            this.stack[this.top]=val;
            this.size++;
        }
    }
    public int pop(int val){
        if(this.isEmpty()){
            System.out.println("STACK OVERFLOW");
            return -1;
        }else{
            this.top--;
            this.size--;
            return this.stack[this.top+1];
        }
    }
    public int peek(){
        if(this.isEmpty()){
            System.out.println("STACK OVERFLOW");
            return -1;
        }else{
            return this.stack[this.top];
        }
    }
    public void printStack(){
        System.out.println("\n");
        for(int i=0;i<size;i++){
            System.out.println("Element["+i+"]:"+this.stack[i]);
        }
    }

}
