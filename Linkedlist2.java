public class Linkedlist2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void insert(int newdata) {
        Node newnode = new Node(newdata);

        if (head == null) {
            head = new Node(newdata);
            return;
        }

        newnode.next = null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return;
    }

    public void InsertAtAnyPoint(Node pre_node, int newdata) {
        if (pre_node == null) {
            System.out.println("The previous node can not contain the null values ");
            return;
        }

        Node newnode = new Node(newdata);
        newnode.next = pre_node.next;
        pre_node.next = newnode;
    }

    public void Print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist2 lls = new Linkedlist2();

        lls.insert(1);
        lls.insert(2);
        lls.insert(4);
        lls.insert(5);
        lls.insert(6);
        // calling print function

        lls.Print();

        System.out.println();
        lls.InsertAtAnyPoint(lls.head.next, 3);
        // calling printfunction
        lls.Print();

    }

}
