package hoover.linkedlist;

public class SingleLinkedList {
//    create a head node
    public HeroNode head = new HeroNode(0,"","");
//    add a node to linkedList's tail
    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }
//    add a node to given location in a linkedList
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = this.head;
        boolean flag = false; // if added heroNode exists, then putout some tips
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no > heroNode.no){
                break;
            }
            else if(temp.next.no == heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;

        }
        if(flag){
            System.out.printf("准备插入的节点编号 %d 已经存在，不能加入", heroNode.no);
        }
        else{
//            add hearNode to given location in linkedList
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }
    public void update(HeroNode heroNode){
        // 指针位置 和当前判断节点一个位置
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = this.head.next;
        boolean flag = false; // find the updated node
        while (true){
            if (temp == null){
                break;
            }
            if (temp.no == heroNode.no){
                flag = true;
                temp.name = heroNode.name;
                temp.nickName = heroNode.nickName;
                break;
            }
            temp = temp.next;
        }
        if (!flag){
            System.out.printf("没有找到编号为 %d 的节点，不能修改！", heroNode.no);
        }
    }
    public void del(int no){
        // 指针位置，慢判断节点一个位置
        if (head.next == null){
            System.out.printf("这是一个空链表");
            return;
        }
        HeroNode temp = this.head;
        boolean flag = false;
        while (true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no == no){
                flag = true;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        if(!flag){
            System.out.printf("要删除的节点号 %d，没有找到，不能删除\n", no);
        }
    }
    // show the linked list
    public void list(){
        if(head.next == null){
            System.out.printf("这是一个空链表");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}


