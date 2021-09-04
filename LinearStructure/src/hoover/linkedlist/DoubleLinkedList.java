package hoover.linkedlist;

import org.jetbrains.annotations.NotNull;

public class DoubleLinkedList {
    // create a head node
    HeroNode2 head = new HeroNode2(0,"","");
    // add node into double linked list
    public void add(HeroNode2 heroNode){
        HeroNode2 cur = head;
        while (true){
            if (cur.next == null){
                break;
            }
            cur = cur.next;
        }
        cur.next = heroNode;
        heroNode.pre = cur;

    }
    // add double linked list by no order
    public void addByOrder(HeroNode2 heroNode){
        HeroNode2 cur = this.head;
        boolean flag = false;
        while (true){
            if (cur.next == null){
                cur.next = heroNode;
                heroNode.pre = cur;
                break;
            }
            if (cur.next.no > heroNode.no){
                heroNode.next = cur.next;
                cur.next.pre = heroNode;
                cur.next = heroNode;
                heroNode.pre = cur;
                break;
            }
            if (cur.next.no == heroNode.no){
                flag = true;
                System.out.printf("插入的编号%d 已经存在，不能插入\n", heroNode.no);
                break;
            }
            cur = cur.next;
        }


    }
    // update node by given no
    public void update(HeroNode2 heroNode){
        if (head.next == null){
            System.out.println("这是一个空双向链表，不能更新");
            return;
        }
        HeroNode2 cur = head.next;
        boolean flag = false;
        while (true){
            if (cur == null){
                break;
            }
            if (cur.no == heroNode.no){
                flag = true;
                cur.no = heroNode.no;
                cur.name = heroNode.name;
                cur.nickName = heroNode.nickName;
                break;
            }
            cur = cur.next;
        }
        if (!flag){
            System.out.printf("双向链表中没有编号为%d的节点，不能更新\n", heroNode.no);
        }

    }
    // delete given node
    public void del(int no){
        if (head.next == null){
            System.out.println("这是一个空的双向链表，不能删除");
            return;
        }
        HeroNode2 cur = head.next;
        boolean flag = false;
        while (true){
            if (cur == null){
                break;
            }
            if (cur.no == no){
                flag = true;
                cur.pre.next = cur.next;
                if (cur.next != null){
                    cur.next.pre = cur.pre;
                }
                break;
            }
            cur = cur.next;
        }
        if (!flag){
            System.out.printf("在双向链表中没有找到编号为%d的节点\n", no);
        }


    }
    // show the list
    public void list(){
        if (head.next == null){
            System.out.println("这是一个空的双向链表");
        }
        HeroNode2 cur = head.next;
        while(true){
            if (cur == null){
                break;
            }
            System.out.println(cur);
            cur = cur.next;
        }
    }

}
