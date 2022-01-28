package Questions;

public class Q_92_LinkedList_rev_II {
    public static class ListNode {
        int data;
        ListNode next;
      }
    
      public static class LinkedList {
        ListNode head;
        ListNode tail;
        int size;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode slow = head;
        ListNode curr =head;
        ListNode curr2 = head;
        ListNode curr3 = head;
        ListNode fast = head;
        ListNode tail1 = null;
        while(curr!=null){
            curr = curr.next;
            tail1 = curr;
        }
        for(int i = 0 ; i<left;i++){
            slow = slow.next;
        }
        for(int i = 0; i < right ; i++){
            fast = fast.next;
        }
        curr2.next = rev(slow,fast);
        ListNode tail2 = null;
        while(curr3!=null){
            curr3 = curr3.next;
            tail2=curr3;
        }
        tail2.next = tail1;
        return curr2;
        
        
        
    }
    public ListNode rev(ListNode head, ListNode tail){
        ListNode curr = head;
        ListNode prev = null;
        while(curr !=tail){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = head;
            curr = temp;
        }
     return prev;
    }
}
}