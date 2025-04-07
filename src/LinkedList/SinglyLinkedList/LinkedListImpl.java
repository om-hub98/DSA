package LinkedList.SinglyLinkedList;

public class LinkedListImpl {

    Node head = null;
    Node tail = null;

    public void insert(int data){
        Node node = new Node(data);
        if(head==null){
            head=tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
     public void display(){
        Node current = head;
        if(head==null){
            System.out.println("List is Empty!!!");
            return;
        }
         System.out.println("Data from the linked list ::: ");
        while(current!=null){
            System.out.print(current.value+"->");
            current=current.next;
        }
         System.out.println();
     }
}
