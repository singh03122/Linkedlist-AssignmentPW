public class Linkedlist4 {
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

    public void Print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public boolean isPalindrome() {
        // Step 1: Create a copy of the original list
        Node originalList = copyList(head);

        // Step 2: Reverse the original list
        reverse();

        // Step 3: Compare the original list with the reversed list
        return compareLists(originalList, head);
    }

    // Helper method to create a copy of the linked list
    private Node copyList(Node head) {
        if (head == null)
            return null;

        Node newHead = new Node(head.data);
        Node temp = head.next;
        Node newTemp = newHead;

        while (temp != null) {
            newTemp.next = new Node(temp.data);
            newTemp = newTemp.next;
            temp = temp.next;
        }
        return newHead;
    }

    // Helper method to compare two linked lists
    private boolean compareLists(Node list1, Node list2) {
        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return (list1 == null && list2 == null);
    }

    public static void main(String[] args) {
        System.out.println("Program to Remove Duplicates elements from the Linkedlist...................");
        Linkedlist4 lls = new Linkedlist4();
        lls.Inserting(1);
        lls.Inserting(2);
        lls.Inserting(2);
        lls.Inserting(1);

        // printing the node
        // System.out.println("Linkelist before removeing the duplicates elements");
        lls.Print();

        // checking the give linkedlist elements is palindrome or not!
        System.out.println();
        System.out.println("Linkedlist after reverse of all nodes.......... ");
        lls.reverse();
        lls.Print();
        System.out.println();

        if (lls.isPalindrome()) {
            System.out.println("The LinkedList is a palindrome.");
        } else {
            System.out.println("The LinkedList is not a palindrome.");
        }
    }
}