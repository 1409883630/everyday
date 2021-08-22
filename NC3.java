//NC3 链表中环的入口结点
//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，返回null
//输入描述：输入分为2段，第一段是入环前的链表部分，
//第二段是链表环的部分，后台将这2个会组装成一个有环或者无环单链表
//返回值描述：返回链表的环的入口结点即可。而我们后台程序会打印这个节点
import java.util.*;
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        // 使用set来记录出现的结点
        HashSet<ListNode> set = new HashSet<>();
        while(pHead != null){
           // 当set中包含结点，说明第一次出现重复的结点，即环的入口结点
            if(set.contains(pHead)){
                return pHead;
            }
            // set中加入未重复的结点
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
}