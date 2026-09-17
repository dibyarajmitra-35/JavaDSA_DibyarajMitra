public class LinkedList {

    // Creates a LinkedList from an array
    public static Node createList(Object[] arr) {

        Node head = new Node(arr[0]);
        Node n = head;

        for (int i = 1; i < arr.length; i++) {
            Node newN = new Node(arr[i]);
            n.next = newN;
            n = n.next;
        }

        return head;
    }

    // Prints the LinkedList
    public static void printLL(Node head) {

        if (head == null) {
            System.out.println();
            return;
        }

        Node n = head;

        while (n != null) {

            if (n.next != null) {
                System.out.print(n.elem + " -> ");
            } else {
                System.out.println(n.elem);
            }

            n = n.next;
        }
    }
}