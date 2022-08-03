package Day02;

import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayQueue arrayQueue = new ArrayQueue(3);
        lo:
        while (true) {
            System.out.println("1.创建队列  2.添加数据  3.获取数据 4.获取表头 5. 退出程序 6.获取所有数据" );
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("请输入队列大小" );
                    int a = sc.nextInt();
                     arrayQueue = new ArrayQueue(a);
                    System.out.println("创建成功" );
                    break;
                case 2:
                    System.out.println("请输入添加的数据" );
                    int data = sc.nextInt();
                    arrayQueue.addDate(data);
                    System.out.println("创建成功" );
                    break;
                case 3:
                    int data1= arrayQueue.getData();
                    System.out.println("获取了"+data1 );
                    break;
                case 4:
                    int head =arrayQueue.getHead();
                    System.out.println("表头为"+head );
                    break;
                case 5:
                    break lo;
                case 6:
                    arrayQueue.getAllData();
                    break ;
                default:
                    System.out.println("输入有误，重新输入");
                    break ;
            }


        }
    }
}
