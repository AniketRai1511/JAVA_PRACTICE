package linked_list;

public class test2 {
    public static class DoublyLinkedList{
        int data;
        DoublyLinkedList next;
        DoublyLinkedList pre;
        DoublyLinkedList(int data){
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }
    public static DoublyLinkedList insertAtHead(DoublyLinkedList head,int data){
        DoublyLinkedList temp=new DoublyLinkedList(data);
        temp.next=head;
        head.pre=temp;
        head=temp;
        return head;
    }
    public static void print(DoublyLinkedList head){
        DoublyLinkedList temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList head=new DoublyLinkedList(10);
        print(head);
        head=insertAtHead(head,20);
        print(head);
        head=insertAtHead(head,30);
        print(head);
    }
}
