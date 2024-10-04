class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add a new node
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Delete a node
    public void delete(int data) {
        if (head == null) return;
        if (head.data == data && head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        Node prev = null;
        do {
            if (temp.data == data) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Traverse the list
    public void traverse() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Display the nodes
    public void display() {
        traverse();
    }


}
