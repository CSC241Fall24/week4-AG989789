// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;         
        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        
        ListNode l2Current = l2;
        while (l2Current != null) {
            ListNode newNode = new ListNode(l2Current.val);
            current.next = newNode;
            current = newNode;
            l2Current = l2Current.next;
        }

        return l1;
    }
}
