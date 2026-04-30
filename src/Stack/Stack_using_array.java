package Stack;

public class Stack_using_array {

  public static class stack{
   static int [] arr;
   static int top;
   static int capacity;
    stack(int size){
        this.capacity=size;
        this.arr=new int[capacity];
        this.top=-1;
    }
    public static   void push(int data){
        if(isFull()){
            System.out.println("stack is full");
        }
        else {
            top++;
            arr[top]=data;
        }
    }
    public static void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else {
            top=top-1;
        }
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return arr[top];
    }
    public static int size(){
        return top+1;
    }
    public static boolean isFull(){
        return top==capacity-1;
    }
    public static boolean isEmpty(){
        return top==-1;
    }
    public static void print(){
        for(int i=0;i<top+1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    };

    public static void main(String[] args) {
        stack sta=new stack(5);
        stack.push(10);
        stack.print();
        stack.push(11);
        stack.pop();
        stack.push(12);
        System.out.println( stack.peek());
        stack.push(13);
        stack.print();
        stack.pop();
        stack.push(14);
        stack.print();
        System.out.println(stack.size());
     //   stack.push(16);
    }
}
