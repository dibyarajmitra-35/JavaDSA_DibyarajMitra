public class CheckSimilar
{
public static String checkSimilar(Node building1, Node building2) {

    Node tp1 = building1;
    Node tp2 = building2;

    while (tp1 != null && tp2 != null) {

        if (!tp1.elem.equals(tp2.elem)) {
            return "Not Similar";
        }

        tp1 = tp1.next;
        tp2 = tp2.next;
    }

    if (tp1 == null && tp2 == null) {
        return "Similar";
    }

    return "Not Similar";
}


public static void main(String[] args){
        //DO NOT TOUCH THE DRIVER CODE BELOW
        System.out.println("==============Test Case 1=============");
        String[] b1 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_1 = LinkedList.createList(b1);
        String[] b2 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_2 = LinkedList.createList(b2);
        System.out.print("Building 1: ");
        LinkedList.printLL(building_1);
        System.out.print("Building 2: ");
        LinkedList.printLL(building_2);
        String returnedValue = checkSimilar(building_1, building_2);
        System.out.println("Expected Output: Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Similar"


        System.out.println("==============Test Case 2=============");
        String[] b3 = {"Red", "Green", "Yellow", "Red", "Yellow", "Green"};
        Node building_3 = LinkedList.createList(b3);
        String[] b4 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_4 = LinkedList.createList(b4);
        System.out.print("Building 3: ");
        LinkedList.printLL(building_3);
        System.out.print("Building 4: ");
        LinkedList.printLL(building_4);
        returnedValue = checkSimilar(building_3, building_4);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"

        System.out.println("==============Test Case 3=============");
        String[] b5 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_5 = LinkedList.createList(b5);
        String[] b6 = {"Red", "Green", "Yellow", "Red", "Blue", "Green", "Blue"};
        Node building_6 = LinkedList.createList(b6);
        System.out.print("Building 5: ");
        LinkedList.printLL(building_5);
        System.out.print("Building 6: ");
        LinkedList.printLL(building_6);
        returnedValue = checkSimilar(building_5, building_6);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"

        System.out.println("==============Test Case 4=============");
        String[] b7 = {"Red", "Green", "Yellow", "Red", "Blue", "Green", "Blue"};
        Node building_7 = LinkedList.createList(b7);
        String[] b8 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_8 = LinkedList.createList(b8);
        System.out.print("Building 7: ");
        LinkedList.printLL(building_7);
        System.out.print("Building 7: ");
        LinkedList.printLL(building_8);
        returnedValue = checkSimilar(building_7, building_8);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"
    }

}