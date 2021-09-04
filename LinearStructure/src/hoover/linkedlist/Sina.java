package hoover.linkedlist;

public class Sina extends SingleLinkedList{
    // 获取有效节点个数
    public int getLength(){
        if(head.next == null){
            return 0;
        }
        int length = 0; // 记录有效节点个数
        HeroNode cur = head.next;
        while (cur!=null){
            length++;
            cur = cur.next;
        }
        return length;
    }
    // 查找单链表中倒数第k个节点
    public HeroNode findLastIndexNode(int index){
        if (head.next == null){
            return null;
        }
        int size = getLength();
        if(index <= 0 || index > size){
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size-index; i++){
            cur = cur.next;
        }
        return cur;

    }

}
