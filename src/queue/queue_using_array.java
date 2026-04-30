package queue;

public class queue_using_array {
    static class queue{
        static private int [] arr;
        static private int capacity;
        static private int currSize;
        static private int start;
        static private int end;
        queue(int size){
            this.capacity=size;
            this.arr =new int[capacity];
            this.start=-1;
            this.end=-1;
            this.currSize=0;
        }
        public static void push(int data){
            currSize++;
            if(isfull()){
                System.out.println("queue is full");
            }
            else{
                if(start==-1 && end==-1 && currSize<capacity){
                    start++;
                    end++;
                    arr[end]=data;
                    System.out.println(data+" pushed");
                } else if (currSize<capacity && end==capacity-1) {
                    end=0;
                    arr[end]=data;
                    System.out.println(data+" pushed");
                }
                else {
                    if(currSize<capacity){
                        end++;
                        arr[end]=data;
                        System.out.println(data+" pushed");
                    }
                }
            }
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            else {
                return arr[start];
            }
        }

        public static void pop(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            else {
                currSize=currSize-1;
                if(currSize==0){
                    start=-1;
                    end=-1;
                } else if (start==capacity-1) {
                    start=0;
                }
                else {
                    start++;
                }
            }
        }

        public static boolean isfull(){
            return currSize==capacity;
        }
        public static boolean isEmpty(){
            return start==-1;
        }

        public static int size(){
            return currSize;
        }

        public static void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty, nothing to print.");
                return;
            }

            System.out.print("Queue elements: ");
            int count = 0;       // Track how many elements we've printed
            int index = start;   // Start printing from the front of the queue

            while (count < currSize) {
                System.out.print(arr[index] + " ");

                // Move to the next index circularly using the modulo operator
                index = (index + 1) % capacity;

                count++; // Increment the number of elements printed
            }
            System.out.println(); // Move to the next line after printing
        }

    }

    public static void main(String[] args) {
        queue q1= new queue(5);
        q1.push(10);
        q1.push(20);
        q1.push(30);
        q1.printQueue();
        //int ele=q1.peek();
        System.out.println(q1.peek());
        q1.pop();
        System.out.println(q1.peek());
        q1.pop();
        q1.printQueue();
        System.out.println(q1.peek());
        System.out.println(q1.size());
        q1.push(40);
        q1.push(50);
        q1.push(60);
        q1.printQueue();
        System.out.println(q1.size());
        q1.pop();q1.pop();q1.pop();
        q1.printQueue();
        System.out.println(q1.peek());
        System.out.println(q1.size());

    }
}
