package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/8 18:57
 */
public class 反转链表 {
    public static void main(String[] args) {

    }
    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode temp=null;
        while (head!=null){
            temp=head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        return pre;
    }
}
