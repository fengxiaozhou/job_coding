public class reorder_list {
    /**
     * 寻找中间节点  将后边的链表反转  双联表合并
     * @param
     */
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        reorderList(head);
    }
    public static void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode nextMid=slow.next;
        slow.next=null;
        ListNode temp=null;
        ListNode pre=null;
        while(nextMid.next!=null){
            temp=nextMid.next;
            nextMid.next=pre;
            pre=nextMid;
            nextMid=temp;
        }
        nextMid.next=pre;
        ListNode res=head;
        while(nextMid!=null&&head!=null){
            temp=head.next;
            head.next=nextMid;
            head=temp;
            temp=nextMid.next;
            nextMid.next=head;
            nextMid=temp;
        }

    }

}
