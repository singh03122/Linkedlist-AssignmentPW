public class Linkedlist3 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void Inserting(int newdata) {
        Node newnode = new Node(newdata);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(newdata);
        return;
    }

    public Node removeDuplicates(Node head) {
        if (head == null)
            return null;

        Node prev_node = head;
        Node temp = prev_node.next;

        while (temp != null) {
            if (temp.data == prev_node.data) {
                // Skip the duplicate node
                prev_node.next = temp.next;
            } else {
                // Move the prev_node forward if no duplicate
                prev_node = temp;
            }
            // Move temp to the next node
            temp = temp.next;
        }
        // return prev_node; // both pre_node and head node will work same...............
        return head;
    }

    public void Print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Program to Remove Duplicates elements from the Linkedlist...................");
        Linkedlist3 lls = new Linkedlist3();
        lls.Inserting(1);
        lls.Inserting(1);
        lls.Inserting(2);
        lls.Inserting(2);
        lls.Inserting(3);
        lls.Inserting(4);
        lls.Inserting(4);
        lls.Inserting(5);

        // printing the node
        System.out.println("Linkelist before removeing the duplicates elements");
        lls.Print();
        System.out.println();
        lls.removeDuplicates(lls.head);
        System.out.println("Linkedlist after removing the duplicates elements ");
        lls.Print();
    }
}
