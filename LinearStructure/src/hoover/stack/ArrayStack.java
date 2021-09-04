package hoover.stack;

public class ArrayStack {
    public int maxSize;
    int top = -1;
    public int[] stack;

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }
    public boolean isFull(){
        return top == this.maxSize - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("栈已经满了，不能加入新的元素");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("栈为空，不能抛出");
            throw new RuntimeException();
        }
        int value =  stack[top];
        top--;
        return value;

    }
    public void show(){
        if (isEmpty()){
            throw new RuntimeException();
        }
        for (int i = top; i >=0; i--){
            System.out.println(stack[i]);
        }

    }
}
