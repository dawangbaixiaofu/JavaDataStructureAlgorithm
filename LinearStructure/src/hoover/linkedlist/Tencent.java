package hoover.linkedlist;

public class Tencent extends SingleLinkedList{
    // 实现单链表的翻转 [破坏原链表的结构]
    public void reverseList(){
        // if the linked list is null or only has one node then do nothing
        if (head.next == null || head.next.next == null){
            return;
        }
        // create two temporary HeroNode cur and nex
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0,"","");
        while (cur!=null){
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;

    }
}
