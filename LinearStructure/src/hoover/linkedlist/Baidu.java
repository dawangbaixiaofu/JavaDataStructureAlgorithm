package hoover.linkedlist;

import java.util.Stack;

public class Baidu extends SingleLinkedList{
    // 从尾到头打印单链表[不能破坏原链表的结构]

    public void reversePrint(){
        // use stack structure
        Stack<HeroNode> stack = new Stack<HeroNode>();
        if (head.next == null){
            return;
        }
        HeroNode cur = head.next;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        // print nodes in stack
        while (stack.size()>0){
            System.out.println(stack.pop());
        }

    }


}
