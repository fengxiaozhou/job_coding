public class convert_sorted_list_to_BST {
    public static void main(String[] args) {
        ListNode a=new ListNode(3);
        a.next=new ListNode(5);
        a.next.next=new ListNode(8);
//        a.next.next.next=new ListNode(2);
        TreeNode res=sortedListToBST(a);
    }
    public static TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode premid=null;
        ListNode mid=head;
        ListNode end=head;
        while(end!=null&&end.next!=null){  //永远选择中间靠后的那一个   所以快指针要在偶数个总量时  倒数第2时再往后一次
            premid=mid;
            mid=mid.next;
            end=end.next.next;
        }
        TreeNode root=new TreeNode(mid.val);
        premid.next=null;
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(mid.next);

        return root;
    }
}
