package Questions;

public class Q_83_Remove_Duplicates_from_sorted_List {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
        
       class Solution {
           public ListNode deleteDuplicates(ListNode head) {
               if(head == null || head.next == null){
                   return head;
               }
             ListNode  helper = head;
             int val =0;
               while(helper != null && helper.next !=null){
                val = helper.val;
                if(val == helper.next.val){
                    helper.next = helper.next.next;
                }else{
                    helper = helper.next;
                }
               }
               return head;
  
           }
       }
    
}
