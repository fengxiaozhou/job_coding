import java.util.ArrayList;
import java.util.Stack;

public class reverse_nodes_in_k_group {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);
        a.next.next.next=new ListNode(4);
        a.next.next.next.next=new ListNode(5);
        ListNode res=reverseKGroup2(a,3);
        System.out.println(res);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode res=new ListNode(0);
        ListNode temp=res;
        Stack<Integer> s=new Stack<Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(head!=null){
            s.push(head.val);
            head=head.next;
            if(s.size()==k){
                while (!s.isEmpty()){
                    temp.next=new ListNode(s.pop());
                    temp=temp.next;
                }
            }
        }
        if(s.isEmpty()) {
            ;
        }else{
            while (!s.isEmpty()){
                a.add(s.pop());
            }
            for(int i=a.size()-1;i>=0;i--){
                temp.next=new ListNode(a.get(i));
                temp=temp.next;
            }
        }
        return res.next;
    }

    /**
     * 很棒的方法！！
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseKGroup2(ListNode head, int k) {
        if(head == null || head.next == null || k < 2) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head, temp;
        int len = 0;
        while (head != null) {
            len ++ ;
            head = head.next;
        }
        for (int i = 0; i < len / k; i ++ ) {
            for (int j = 1; j < k; j ++ ) {
                temp = cur.next;
                cur.next = temp.next;
                temp.next = pre.next;
                pre.next = temp;
            }
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
