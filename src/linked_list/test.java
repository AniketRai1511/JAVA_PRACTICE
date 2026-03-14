package linked_list;

public class test {
    public static class linkedList{
         int data;
         linkedList next;

        linkedList(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static linkedList insetAtHead(linkedList head,int data){
        if(head==null){
            linkedList temp=new linkedList(data);
            head=temp;
            return head;
        }
        linkedList temp=new linkedList(data);
        temp.next=head;
        return temp;
    }
    public static linkedList insertAtTail(linkedList tail,int data){
        linkedList temp=new linkedList(data);
        tail.next=temp;
        return temp;
    }
    public static linkedList insertAtPosition(linkedList tail,linkedList head,int position,int data){
        if(position==1){
           return insetAtHead(head,data);
        }
        linkedList temp=head;
        int count=1;
        while(count<position-1 || temp!=null){
            temp=temp.next;
            count++;
        }
        if(temp.next==null){
             tail=insertAtTail(tail,data);
             return head;
        }
        linkedList nodeToInsert=new linkedList(data);
        nodeToInsert.next=temp.next;
        temp.next=nodeToInsert;
        return head;
    }
    public static void print(linkedList head){
        linkedList temp= head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static linkedList removeHead( linkedList head){
        linkedList temp=head;
        head=temp.next;
        return head;
    }
    public static linkedList removeTail(linkedList head,linkedList tail){
        if(head==null) return null;
        linkedList temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        return tail;
    }

    public static linkedList reverse(linkedList head){
        if(head.next==null){
            return head;
        }
        linkedList temp=head;
        linkedList prev=null;
        linkedList nextNode;
        while(temp!=null){
            nextNode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        linkedList head=null;
        head=insetAtHead(head,1);
        print(head);
        linkedList tail=head;
        head=insetAtHead(head,2);
        head=insetAtHead(head,3);
        head=insetAtHead(head,4);
        head=insetAtHead(head,5);
        head=insetAtHead(head,6);
        print(head);
        head=reverse(head);
//        tail=insertAtTail(tail,40);
          print(head);
//       head=insertAtPosition(tail,head,4,70);
//       print(head);
//        head=removeHead(head);
//        print(head);
//        System.out.println(head.data);
//        tail=removeTail(head,tail);
//        print(head);
//        System.out.print(tail.data);
    }
}
