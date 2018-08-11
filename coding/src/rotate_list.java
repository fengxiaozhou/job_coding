
public class rotate_list {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);
        a.next.next.next=new ListNode(4);
        rotateRight(a,3);
        System.out.print("123");
    }
    public static ListNode rotateRight(ListNode head, int n) {
        if (n == 0 || head == null || head.next == null)
            return head;
        ListNode fast=head;
        ListNode rotateNode;
        for(int i=0;i<n;i++){
            head=head.next;
        }
        rotateNode=head.next;
        ListNode res=rotateNode;
        head.next=null;
        while(rotateNode.next!=null){
            rotateNode=rotateNode.next;
        }
        rotateNode.next=fast;
        return res;
    }
}
