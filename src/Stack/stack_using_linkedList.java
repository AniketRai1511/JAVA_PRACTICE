package Stack;

public class stack_using_linkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class stack{
        Node top=null;
        int size=0;
        void push(int data){
            Node temp=new Node(data);
            temp.next=top;
            top=temp;
            size++;
            System.out.println(data + " pushed in stack");
        }
        void pop(){
         if(isEmpty()){
             System.out.println("stack is empty");
         }
         else{
             System.out.println(top.data + " is removed from stack");
             top=top.next;
             size--;
         }
        }
        int peek(){
            if(isEmpty()){
                System.out.print("stack is empty ");
                return -1;
            }
            else{
                System.out.print("peek element is ");
                return top.data;
            }
        }
        int getSize(){
            System.out.printf("size of stack is ");
            return size;
        }
        boolean isEmpty(){
            return top==null;
        }
    }

    public static void main(String[] args) {
        stack st1=new stack();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        System.out.println(st1.peek());
        st1.pop();
        System.out.println(st1.peek());
        System.out.println(st1.getSize());
    }
}
