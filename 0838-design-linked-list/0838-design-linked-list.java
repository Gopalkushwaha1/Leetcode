class MyLinkedList {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node head;
    public Node next;
    public int size = 0;

    public MyLinkedList() {
        head = null;
        next = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;  // Check index bounds
        Node temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    public void addAtTail(int val) {
        Node temp = new Node(val);
        if (size == 0) {
            head = temp;
        } else {
            Node temp2 = head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;  // Invalid index
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = new Node(val);
        Node temp2 = head;

        for (int i = 0; i < index - 1; i++) {
            temp2 = temp2.next;
        }

        temp.next = temp2.next;
        temp2.next = temp;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;  // Invalid index
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
}
