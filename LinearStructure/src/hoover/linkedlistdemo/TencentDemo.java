package hoover.linkedlistdemo;

import hoover.linkedlist.HeroNode;
import hoover.linkedlist.Tencent;

public class TencentDemo {
    public static void main(String[] args) {
        // create some nodes
        HeroNode hero1 = new HeroNode(1,"songjiang","jishiyu");
        HeroNode hero2 = new HeroNode(2,"lujunyi","yuqilin");
        HeroNode hero3 = new HeroNode(3,"wuyong","zhiduoxing");
        HeroNode hero4 = new HeroNode(4,"linchong","baozitou");
        // create a single linked list
        Tencent list = new Tencent();

        // add nodes by order
        list.addByOrder(hero1);
        list.addByOrder(hero4);
        list.addByOrder(hero2);
        list.addByOrder(hero3);
        // show list
        list.list();
        // 翻转单链表
        System.out.println("翻转单链表，并输出");
        list.reverseList();
        list.list();
    }
}
