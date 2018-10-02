package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/24 20:54
 */
public class 删除链表中重复的结点 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        if(pHead.val==pHead.next.val){
            ListNode pNode=pHead.next;
            while(pNode!=null&&pNode.val==pHead.val){
                pNode=pNode.next;
            }
            return deleteDuplication(pNode);
        }else {
            pHead.next=deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
