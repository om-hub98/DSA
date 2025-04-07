package LinkedList.SinglyLinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedListImpl listImpl = new LinkedListImpl();
        listImpl.insert(1);
        listImpl.insert(2);
        listImpl.display();
        listImpl.insert(3);
        listImpl.insert(4);
        listImpl.insert(5);
        listImpl.insert(6);

        listImpl.display();
    }
}
