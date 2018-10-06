package SwordOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Fz
 * @date 2018/10/6 14:24
 */
public class 从尾到头打印链表 {
    static ArrayList<Integer> res=new ArrayList<>();

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        System.out.println(printListFromTailToHead(listNode).toString());
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null){
            return res;
        }
        printListFromTailToHead(listNode.next);
        res.add(listNode.val);
        return res;
    }
}
