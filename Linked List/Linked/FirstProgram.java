public class FirstProgram {
    Node head; // head of the list

    // Linked list node
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the front of the list
    public void insertAtFront(int newData) {
        // Allocate the new node and put in the data
        Node newNode = new Node(newData);

        // Make next of new node as head
        newNode.next = head;

        // Move the head to point to the new node
        head = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        FirstProgram llist = new FirstProgram();

        llist.insertAtFront(6);
        llist.insertAtFront(7);
        llist.insertAtFront(1);
        llist.insertAtFront(4);

        System.out.println("Created Linked list is:");
        llist.printList();
    }
}
