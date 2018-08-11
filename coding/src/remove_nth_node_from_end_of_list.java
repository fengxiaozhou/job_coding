public class remove_nth_node_from_end_of_list {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        ListNode res=removeNthFromEnd(a,1);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null&&n==1) return null;
        ListNode  pre=new ListNode(0);
        pre.next=head;
        ListNode res=head;
        ListNode del=head;
        while((n-1)!=0){
            del=del.next;
            n--;
        }
        if(del.next==null)  //删除的是头结点
            return res.next;

        while(del.next!=null){
            pre=pre.next;
            head=head.next;
            del=del.next;
        }
        if(head.next==null){
            pre.next=null;
        }else{
            pre.next=pre.next.next;
        }
        return res;
    }
}
