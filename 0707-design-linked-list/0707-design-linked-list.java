class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class MyLinkedList {
    private Node head; 

    public MyLinkedList() {
        head = null;
    }

    
    public int get(int index) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (count == index)
                return temp.data;
            temp = temp.next;
            count++;
        }
        return -1;
    }

   
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        int count = 0;
        Node temp = head;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null)
            return; 

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    
    public void deleteAtIndex(int index) {
        if (head == null)
            return;

        if (index == 0) {
            Node temp = head;
            head = head.next;
            return;
        }

        int count = 0;
        Node temp = head;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null)
            return; 

        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */