package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/24 21:21
 */
public class 链表中环的入口结点 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow=pHead;
        ListNode fast=pHead;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=pHead;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
