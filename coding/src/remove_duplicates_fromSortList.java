import java.util.*;

public class remove_duplicates_fromSortList {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(1);
//        a.next.next=new ListNode(2);
//        a.next.next.next=new ListNode(3);
//        a.next.next.next.next=new ListNode(3);
//        a.next.next.next.next.next=new ListNode(4);
//        a.next.next.next.next.next.next=new ListNode(4);

        ListNode res=deleteDuplicatess(a);
    }

    /**
     * 把重复的全部删掉
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        LinkedHashMap<Integer,Integer> l=new LinkedHashMap<Integer,Integer>();
        while (head!=null){
            if(l.containsKey(head.val)){
               l.put(head.val,l.get(head.val)+1);
            }else{
                l.put(head.val,1);
            }
            head=head.next;
        }
        ListNode res=new ListNode(0);
        ListNode temp=res;
        for (Map.Entry<Integer,Integer> entry:l.entrySet()) {
            System.out.print(entry.getKey());
            if(entry.getValue()==1){
                temp.next=new ListNode(entry.getKey());
                temp=temp.next;
            }
        }
        return res.next;

    }
    /**
     * 重复的只保留一个
     */
     public static ListNode deleteDuplicatess(ListNode head){
         if(head==null) return null;
         ListNode res=new ListNode(head.val);
         ListNode temp=res;
         ListNode pre=head;
         ListNode last=pre.next;
         while (last!=null){
             if (pre.val!=last.val){
                 res.next=new ListNode(last.val);
                 res=res.next;
             }
             pre=pre.next;
             last=last.next;
         }
         return temp;
     }
}
