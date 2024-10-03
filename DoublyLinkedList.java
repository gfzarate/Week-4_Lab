class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    private DoublyNode head;

    // Add a new node
    public void add(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Delete a node
    public void delete(int key) {
        DoublyNode current = head;

        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) return; // Key not found

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next; // Key was at head
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // Traverse through linked list
    public void traverse() {
        DoublyNode current = head;
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
