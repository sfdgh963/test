

import java.util.Scanner;

/*
    需求：
        有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问第二十个月的兔子对数为多少？

    思路：
        1:为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        2:因为第1个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素值也都是1
        3:用循环实现计算每个月的兔子对数
        4:输出数组中最后一个元素的值，就是第20个月的兔子对数
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){

            System.out.println("请输入月数(输入0结束):");
            int month = sc.nextInt();
            if (month == 0){
                break;
            }else if(month == 1 || month ==2){
                System.out.println("第"+month+"个月的兔子对数为:1");
            }else {
                System.out.println("第"+month+"个月的兔子对20数为:"+rabbit(month));
            }
        }

    }
    public static int rabbit(int x){
        int [] arr = new int[x];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[x-1];
    }
}
