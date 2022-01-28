package Questions;

public class Q_203_Remove_Linked_List_Elements {
    public class ListNode {
              int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
         public ListNode removeElements(ListNode head , int val){
             ListNode helper = new ListNode();
             helper.next = head;
             ListNode p = helper;
             while(p.next !=null){
                 if(p.val==val){
                     p.next = p.next.next;
                 }
                 else{
                     p.next = p.next;
                 }
             }
             return helper.next;
         }
    
         public ListNode removeElements1(ListNode head , int val){
           ListNode helper = head;
            //  ListNode p = helper;
             while(helper.next !=null){
                 if(helper.val==val){
                     helper.next = helper.next.next;
                 }
                 else{
                     helper.next = helper.next;
                 }
             }
             return head;
         }
    
         
}
