package hoover.linkedlistdemo;

import hoover.linkedlist.DoubleLinkedList;
import hoover.linkedlist.HeroNode2;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        // create some nodes
        HeroNode2 hero1 = new HeroNode2(1,"songjiang","jishiyu");
        HeroNode2 hero2 = new HeroNode2(2,"lujunyi","yuqilin");
        HeroNode2 hero3 = new HeroNode2(3,"wuyong","zhiduoxing");
        HeroNode2 hero4 = new HeroNode2(4,"linchong","baozitou");
        // create a double linked list
        DoubleLinkedList list = new DoubleLinkedList();

        // add nodes by order
        list.addByOrder(hero1);
        list.addByOrder(hero4);
        list.addByOrder(hero2);
        list.addByOrder(hero3);
        // show list
        list.list();
        // update no 2 node
        System.out.println("修改双向链表节点，并展示");
        HeroNode2 heroNode = new HeroNode2(2,"Mr.Lu","yuqilin");
        list.update(heroNode);
        // show list
        list.list();
        // delete no=2
        System.out.println("删除双向链表节点，并展示");
        list.del(2);
        System.out.println("删除节点后再次显示");
        list.list();
    }
}
