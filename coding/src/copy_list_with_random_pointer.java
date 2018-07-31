import java.util.HashMap;
import java.util.Map;

public class copy_list_with_random_pointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null){
            return head;
        }
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode oldp = head.next;
        RandomListNode newp=newHead;
        Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        map.put(newp,head);
        //对旧的链表进行复制
        while(oldp!=null){
            RandomListNode newtemp=new RandomListNode(oldp.label);
            map.put(newtemp,oldp);
            newp.next=newtemp;
            newp=newp.next;
            oldp=oldp.next;
        }
        //对旧链表的random指针进行复制
        oldp=head;
        newp=newHead;
        while(newp!=null){
            newp.random = map.get(newp).random;
            newp=newp.next;
            oldp=oldp.next;
        }
        return newHead;
    }
}
