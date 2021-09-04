package hoover.linkedlistdemo;

import hoover.linkedlist.HeroNode;
import hoover.linkedlist.Sina;

public class SinaDemo {
    public static void main(String[] args) {
        // create some nodes
        HeroNode hero1 = new HeroNode(1,"songjiang","jishiyu");
        HeroNode hero2 = new HeroNode(2,"lujunyi","yuqilin");
        HeroNode hero3 = new HeroNode(3,"wuyong","zhiduoxing");
        HeroNode hero4 = new HeroNode(4,"linchong","baozitou");
        // create a single linked list
        Sina list = new Sina();

        // add nodes by order
        list.addByOrder(hero1);
        list.addByOrder(hero4);
        list.addByOrder(hero2);
        list.addByOrder(hero3);
        // show list
        list.list();
        // delete no=2
        list.del(4);
        System.out.println("删除节点后再次显示");
        list.list();
        int valid_nodes = list.getLength();
        System.out.printf("有效节点个数：%d\n",valid_nodes);
        // find the last 1 node
        HeroNode targetNode = list.findLastIndexNode(1);
        System.out.println(targetNode);
        HeroNode targetNode2 = list.findLastIndexNode(2);
        System.out.println(targetNode2);
    }
}
