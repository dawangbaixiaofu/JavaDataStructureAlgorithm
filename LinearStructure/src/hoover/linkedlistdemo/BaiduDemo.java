package hoover.linkedlistdemo;

import hoover.linkedlist.Baidu;
import hoover.linkedlist.HeroNode;

public class BaiduDemo {
    public static void main(String[] args) {
        // create some nodes
        HeroNode hero1 = new HeroNode(1,"songjiang","jishiyu");
        HeroNode hero2 = new HeroNode(2,"lujunyi","yuqilin");
        HeroNode hero3 = new HeroNode(3,"wuyong","zhiduoxing");
        HeroNode hero4 = new HeroNode(4,"linchong","baozitou");
        // create a single linked list
        Baidu list = new Baidu();

        // add nodes by order
        list.addByOrder(hero1);
        list.addByOrder(hero4);
        list.addByOrder(hero2);
        list.addByOrder(hero3);
        // show list
        list.list();
        // print reverse the elements in linked list
        System.out.println("不破坏原来的链表，并逆序输出");
        list.reversePrint();
    }

}
