class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;

    // Add a new node
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete a node
    public void delete(int key) {
        Node current = head, prev = null;

        if (current != null && current.data == key) {
            head = current.next; // Changed head
            return;
        }

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) return; // Key not found

        prev.next = current.next; // Unlink the node
    }

    // Traverse through linked list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the nodes
    public void display() {
        traverse();
    }
}
