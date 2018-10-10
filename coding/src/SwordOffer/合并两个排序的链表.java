package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/8 19:04
 */
public class 合并两个排序的链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
       ListNode res=new ListNode(0);
       ListNode pre=res;
       while(list1!=null&&list2!=null){
           if(list1.val<list2.val){
               res.next=new ListNode(list1.val);
               list1=list1.next;
               res=res.next;
           }else{
               res.next=new ListNode(list2.val);
               list2=list2.next;
               res=res.next;
           }
       }
       if(list1==null){
           res.next=list2;
       }
       if(list2==null){
           res.next=list1;
       }
       return pre.next;
    }
}
