/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}




class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
      ListNode dummy = new ListNode();
      ListNode curr = dummy;

      int carry = 0;

      ListNode p1 = l1;
      ListNode p2 = l2;

      while(p1 != null || p2 != null || carry != 0)
      {
        int x = (p1 != null) ? p1.val : 0;
        int y = (p2 != null) ? p2.val : 0;

        int sum = x + y+ carry;

        carry =  sum / 10;
        int digit = sum % 10;

        curr.next = new ListNode(digit);
        curr = curr.next;

        if(p1 != null)
        {
            p1 = p1.next;
        }
        if(p2 != null)
        {
            p2 =p2.next;
        }

      }   
        return dummy.next;

    }
}



public class AddTwoNumbers {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2,
                new ListNode(4,
                new ListNode(3)));

        ListNode l2 = new ListNode(5,
                new ListNode(6,
                new ListNode(4)));

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val);

            if (result.next != null) {
                System.out.print(" -> ");
            }

            result = result.next;
        }
    }
}