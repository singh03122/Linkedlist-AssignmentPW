public class Linkedlist1 {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Inserting an element in linkedlist
    public void Inserting(int newdata) {
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

    public Boolean Search(Node head, int x) {
        Node element = head;
        while (element != null) {
            if (element.data == x) {
                return true;
            }
            element = element.next;
        }
        return false;
    }

    // printing linkedlist

    public void Print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // Main function
    public static void main(String[] args) {
        Linkedlist1 lls = new Linkedlist1();

        // Inserting an elements in linkedlist

        lls.Inserting(14);
        lls.Inserting(21);
        lls.Inserting(11);
        lls.Inserting(30);
        lls.Inserting(10);

        // printing node of the linkedlist
        lls.Print();
        System.out.println();
        // Calling searching function to search the element x is present or not in the
        // linkedlist

        if (lls.Search(lls.head, 14)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}