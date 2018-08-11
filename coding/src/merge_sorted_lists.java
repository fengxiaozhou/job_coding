public class merge_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        if(l1==null)  return l2;
        if(l2==null)  return l1;
        ListNode res=new ListNode(0);
        ListNode pre=res;
        while(l1!=null&&l2!=null){
            if(l1.val>=l2.val){
                res.next=l2;
                l2=l2.next;
            }else {
                res.next=l1;
                l1=l1.next;
            }
            res=res.next;
       }
       if(l1!=null&&l2==null){
            res.next=l1;
       }
        if(l1==null&&l2!=null){
            res.next=l2;
        }

        return pre.next;
    }
}
