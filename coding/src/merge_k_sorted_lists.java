import java.util.ArrayList;
import java.util.Stack;

public class merge_k_sorted_lists {

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists.size()==0) return null;
        if(lists.size()==1) return lists.get(0);
        Stack<ListNode> s=new Stack<>();
        for(int i=0;i<lists.size();i++){
            s.push(lists.get(i));
            if(s.size()==2){
                ListNode l1=s.pop();
                ListNode l2=s.pop();
                s.push(mergeTwoLists(l1,l2));
            }
        }
        return s.pop();
    }
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
