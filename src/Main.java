public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
  //DoublyLinkedList list = new DoublyLinkedList();
    // CircularLinkedList list = new CircularLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println("List after adding nodes:");
    list.display();
    list.delete(2);
    System.out.println("List after deleting node 2:");
    list.display();
}
