public class swap_nodes_in_pairs {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);
        a.next.next.next=new ListNode(4);
        ListNode res=swapPairs(a);
        System.out.print("123");
    }
    public static ListNode swapPairs(ListNode head) {
       if(head==null||head.next==null){
           return head;
       }
       ListNode start=new ListNode(0);
       start.next=head;
       for(ListNode cur=start;cur.next!=null&&cur.next.next!=null;cur=cur.next.next){
           cur.next=swap(cur.next,cur.next.next);
       }
       return start.next;
    }

    private static ListNode swap(ListNode node1,ListNode node2){
        node1.next=node2.next;
        node2.next=node1;
        return node2;
    }
}
