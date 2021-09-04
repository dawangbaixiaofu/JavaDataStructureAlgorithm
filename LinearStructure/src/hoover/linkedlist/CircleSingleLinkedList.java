package hoover.linkedlist;

public class CircleSingleLinkedList {
    public BoyNode first = null;
    // create a circle linked list which contains num nodes
    public void addNode(int num){
        BoyNode cur = null;
        for(int i = 1; i <= num; i++){
            BoyNode node = new BoyNode(i);
            if (i == 1){
                first = node;
                first.next = first;
                cur = first;
            }
            else {
                cur.next = node;
                node.next = first;
                cur = node;
            }

        }
    }
    // show all nodes
    public void show(){
        if (first == null){
            System.out.println("这是一个空的循环单链表");
            return;
        }
        BoyNode cur = first;
        while (true){
            if (cur.next == first){
                System.out.println(cur);
                break;
            }
            System.out.println(cur);
            cur = cur.next;
        }

    }

}
