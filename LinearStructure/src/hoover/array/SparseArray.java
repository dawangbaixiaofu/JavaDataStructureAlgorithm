//二维数组和稀疏数组相互转化

package hoover.array;

public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始的二维数组 11*11
        int chessArray[][] = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
//        输出原始数组
        for(int[] row:chessArray){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
//        将二维数组转化为稀疏数组
//        1.遍历二维数组，得到所有的非零元素
//        2.创建对应的稀疏数组
//        3.将二维数组的有效数据赋值到稀疏数组

    }
}
