public class IDGenerator{

    public static Node idGenerator(Node head1, Node head2, Node head3) {
        Node newHead = null;
        Node connectionPoint = null;

        Node curr1 = head1;
        while (curr1 != null) {
            Node newNode = new Node(curr1.elem);

            if (newHead == null) {
                newHead = newNode;
                connectionPoint = newNode;
            } else {
                newNode.next = newHead;
                newHead = newNode;
            }

            curr1 = curr1.next;
        }

        Node curr2 = head2;
        Node curr3 = head3;
        Node currentTail = connectionPoint;

        while (curr2 != null && curr3 != null) {
            int value2 = (int) curr2.elem;
            int value3 = (int) curr3.elem;
            int sum = (value2 + value3) % 10;

            Node newNode = new Node(sum);

            if (currentTail != null) {
                currentTail.next = newNode;
                currentTail = newNode;
            }

            curr2 = curr2.next;
            curr3 = curr3.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1);

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2);

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3);

        Node result = idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result);

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4);

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5);

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6);

        Node result2 = idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2);
    }
}

