public class Linkedlist5 {
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

    public void reverse() {
        // Node newdata = new Node(0);
        Node current = head;
        Node prev = null;
        Node nextptr = null;

        while (current != null) {
            nextptr = current.next;
            current.next = prev;
            prev = current;
            current = nextptr;
        }
        head = prev;
        return;
    }
    // printing linkedlist

    public Node addTwoNumber(Node ll1, Node ll2) {
        Node result = new Node(0);
        Node ptr = result;

        int carry = 0;

        while (ll1 != null || ll2 != null) {
            int sum = 0 + carry;

            if (ll1 != null) {
                sum += ll1.data;
                ll1 = ll1.next;
            }
            if (ll2 != null) {
                sum += ll2.data;
                ll2 = ll2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new Node(sum);
            ptr = ptr.next;
        }
        if (carry == 1) {
            ptr.next = new Node(1);

        }
        return result.next;
    }

    public void Print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // Main function
    public static void main(String[] args) {
        Linkedlist5 lls1 = new Linkedlist5();
        Linkedlist5 lls2 = new Linkedlist5();
        Linkedlist5 lls3 = new Linkedlist5();

        // Inserting an elements in linkedlist
        lls1.Inserting(5);
        lls1.Inserting(6);
        lls1.Inserting(3);

        // printing node of the linkedlist
        lls1.Print();
        lls1.reverse();
        System.out.println();

        lls2.Inserting(8);
        lls2.Inserting(4);
        lls2.Inserting(2);

        // printing node of the linkedlist
        lls2.Print();
        lls2.reverse();

        // Calling add function
        System.out.println();
        lls3.head = lls3.addTwoNumber(lls1.head, lls2.head);
        lls3.reverse();
        System.out.println("The sum of the two Linked list is .................");
        lls3.Print();
    }
}
