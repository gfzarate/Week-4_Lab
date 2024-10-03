class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private CircularNode last;

    // Add a new node
    public void add(int data) {
        CircularNode newNode = new CircularNode(data);
        if (last == null) {
            last = newNode;
            last.next = last; // Point to itself
        } else {
            newNode.next = last.next; // New node points to head
            last.next = newNode; // Last node points to new node
            last = newNode; // Update last to new node
        }
    }

    // Delete a node
    public void delete(int key) {
        if (last == null) return; // Empty list

        CircularNode current = last.next;
        CircularNode prev = last;

        do {
            if (current.data == key) {
                if (current == last) {
                    if (current.next == current) { // Only one node
                        last = null;
                    } else {
                        prev.next = current.next; // Bypass current
                        last = prev; // Update last if needed
                    }
                } else {
                    prev.next = current.next; // Bypass current
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);
    }

    // Traverse through linked list
    public void traverse() {
        if (last == null) return; // Empty list

        CircularNode current = last.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != last.next);
        System.out.println();
    }

    // Display the nodes
    public void display() {
        traverse();
    }
}
