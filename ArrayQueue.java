package Day02;

public class ArrayQueue {
    private int Max;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int max) {
        Max = max;
        arr = new int[max];
        front = -1;
        rear = -1;
    }

    //    判断队列是否满
    public boolean isfull() {
        return rear == Max - 1;
    }

    //    判断队列是否为空
    public boolean isEmpty() {
        return front == rear;
    }

    //    添加数据
    public void addDate(int n) {
        if (isfull()) {
            throw new RuntimeException("队列满不能添加" );
        }
        rear++;
        arr[rear] = n;
    }

    //    获取队列，出数据
    public int getData() {
        if (isEmpty()) {
            throw new RuntimeException("队列空无法添加" );
        }
        front++;
        return arr[front];
    }

    //    显示队列所有数据
    public void getAllData() {
        if (isEmpty()) {
            System.out.println("队列空无法获取" );
        } else {
            //        遍历
            for (int i : arr) {
                System.out.printf("%d\t", i);
            }
            System.out.println("" );
        }
    }

    //    获取表头
    public int getHead() {
        if (isEmpty()) {
            throw new RuntimeException("队列空无法获取" );

        }
        return arr[front++];
    }
}
