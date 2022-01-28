package Questions;
// worked on leetcode
public class Q_206_LinkedList_reverse {
    public static class ListNode {
        int data;
        ListNode next;
      }
    
      public static class LinkedList {
        ListNode head;
        ListNode tail;
        int size;
    public static ListNode reveseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr !=null){
            ListNode temp = head.next;
            prev = curr;
            prev.next = temp;
            head = temp;
        }
        return prev;
    }
    
}
}