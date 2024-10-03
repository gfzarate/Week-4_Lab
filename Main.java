public class Main {
    public static void main(String[] args) {
        // Singly Linked List
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        System.out.println("Singly Linked List:");
        sll.display();
        sll.delete(2);
        sll.display();

        // Doubly Linked List
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        System.out.println("Doubly Linked List:");
        dll.display();
        dll.delete(2);
        dll.display();

        // Circular Linked List
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        System.out.println("Circular Linked List:");
        cll.display();
        cll.delete(2);
        cll.display();
    }
}
