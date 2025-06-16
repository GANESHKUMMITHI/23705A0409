class Queue{
    int[] Queue;
    int size;
    int front;
    int rear;
     Queue(int size){
        this.size=size;
        this.Queue=new int[size];
        this.front=0;
        this.rear=-1;
    }
    boolean isFull(){
        if(rear==size-1){
            System.out.println("stack is full");
            return true;
        }else{
            return false;
        }
    }
    boolean isEmpty(){
        if(rear==-1){
            System.out.println("stack is empty");
            return true;
        }
        else{
            return false;
        }
    }void push(int val){
        if(isFull()){
            return;
        }
        rear=rear+1;
        Queue[rear]=val;
        }
    }
    public class Main{
        public static void main(String[]args){
            Queue 
            System.out.println(" ");
        }
    }