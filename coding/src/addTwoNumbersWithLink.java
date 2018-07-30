/**
 * @author fengzhou
 * @data 2018/07/02
 */
public class addTwoNumbersWithLink {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(5);
        l1.next.next.next=new ListNode(9);

        ListNode l2=new ListNode(4);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(3);
        l2.next.next.next=new ListNode(7);

        ListNode a=addTwoNumbers(l1,l2);
        while(a!=null){
            System.out.print(a.val);
            a=a.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        int count = 0;
        while(l1 != null && l2 != null){
            head.next = new ListNode((l1.val+l2.val+count)%10);
            head = head.next;
            count = (l1.val+l2.val+count)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            head.next = new ListNode((l1.val+count)%10);
            head = head.next;
            count = (l1.val+count)/10;
            l1 = l1.next;
        }
        while(l2 != null){
            head.next = new ListNode((l2.val+count)%10);
            head = head.next;
            count = (l2.val+count)/10;
            l2 = l2.next;
        }
        if(count == 1){
            head.next = new ListNode(1);
            head = head.next;
        }
        return temp.next;
    }
}

