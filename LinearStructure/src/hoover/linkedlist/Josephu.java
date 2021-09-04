package hoover.linkedlist;

public class Josephu extends CircleSingleLinkedList{
    /**
     *
     * @param startNo 开始节点编号
     * @param countNum 数到countNum 出圈
     * @param nums  玩游戏的人数
     */
    public void countNode(int startNo, int countNum, int nums){
        // 创建循环单向列表，包含num个节点
        CircleSingleLinkedList list = new CircleSingleLinkedList();
        list.addNode(nums);
        BoyNode cur = list.first;
        while (true){
            if (cur.next == list.first){
                break;
            }
            cur = cur.next;
        }
        // 同时移动cur first 到startNo
        for (int i = 1; i <= startNo-1; i++){
            cur = cur.next;
            list.first = list.first.next;
        }
        while (true){
            if (cur == list.first){
                break;
            }
            // 数countNum个数后开始出圈
            for (int i = 1; i <= countNum -1 ; i++){
                cur = cur.next;
                list.first = list.first.next;
            }
            // 把first的元素出圈
            System.out.println(list.first);
            list.first = list.first.next;
            cur.next = list.first;

        }
        System.out.println(cur);
    }
}
