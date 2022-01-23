package Questions;

public class Q_21_MeregeTwoSortedLIst {
    public static class ListNode {
        int val;
        ListNode next;
      }
      public static ListNode Mereger(ListNode l1, ListNode l2){
        ListNode temp = new ListNode();
        ListNode head = temp;// never declare it herer head = temp.next; and return head becz change in heap and temp will be null,,
        while(l1 !=null && l2 !=null){
          if(l1.val>l2.val){
            temp.next = l2;
            l2 = l2.next;
          }else{
            temp.next = l1;
            l1 = l1.next;
          }
          temp = temp.next; /// To avoid overwriting 
        }
        if(l1 != null){
          temp.next = l1;
          temp.next = l2;
        }
        return head.next;
      }
}
