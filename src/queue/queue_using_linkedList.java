package queue;

public class queue_using_linkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Queue{
        Node start;
        Node end;
        int size;
        Queue(){
            this.start=null;
            this.end=null;
            this.size=0;
        }
        void push(int data){
            Node temp=new Node(data);
            if(start==null && end==null){
                start=temp;
                end=temp;
                size++;
            }
            else{
                end.next=temp;
                end=temp;
                size++;
            }
        }
        void pop(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            else{
                start=start.next;
                size--;
            }
        }
        int peek(){
            return start.data;
        }
        boolean isEmpty(){
            return start==null;
        }
        int getSize(){
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.push(10);
        q1.push(20);
        q1.push(30);
        System.out.println(q1.peek());
       q1.pop();
        System.out.println(q1.peek());
        System.out.println(q1.getSize());
    }
}
