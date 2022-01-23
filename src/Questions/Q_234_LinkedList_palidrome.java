package Questions;
// worked on leetcode
public class Q_234_LinkedList_palidrome {
    public static class ListNode {
        int data;
        ListNode next;
      }
    
      public static class LinkedList {
        ListNode head;
        ListNode tail;
        int size;
    public static boolean check(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = rev(slow); 
        fast =head;
        while (slow != null){
            if(slow.data != fast.data){
                return false;
            }
            slow =slow.next;
           fast= fast.next;
        }   return true;
        }
        public static ListNode rev(ListNode head){
           ListNode prev= null;
           while(head != null){
               ListNode temp = head.next;
               head.next = prev;
               prev = head;
               head = temp;
           }
            return prev;

        }
}
    
}