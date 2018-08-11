public class partition_list {
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        if(head.next==null){
            return head;
        }
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode(0);
        ListNode c1=l1;
        ListNode c2=l2;
        while(head!=null){
            if(head.val<x){
                c1.next=new ListNode(head.val);
                c1=c1.next;
            }else{
                c2.next=new ListNode(head.val);
                c2=c2.next;
            }
            head=head.next;
        }
        c1.next=l2.next;
        c2.next=null;
        return l1.next;
    }
}
