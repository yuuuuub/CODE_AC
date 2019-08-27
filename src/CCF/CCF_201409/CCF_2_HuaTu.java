package CCF_201409;

import java.util.Scanner;

/**
 * Created by liudong on 2018/11/14.
 * 问题描述
 　　在一个定义了直角坐标系的纸上，画一个(x1,y1)到(x2,y2)的矩形指将横坐标范围从x1到x2，纵坐标范围从y1到y2之间的区域涂上颜色。
 　　下图给出了一个画了两个矩形的例子。第一个矩形是(1,1) 到(4, 4)，用绿色和紫色表示。第二个矩形是(2, 3)到(6, 5)，用蓝色和紫色表示。图中，一共有15个单位的面积被涂上颜色，其中紫色部分被涂了两次，但在计算面积时只计算一次。在实际的涂色过程中，所有的矩形都涂成统一的颜色，图中显示不同颜色仅为说明方便。

 　　给出所有要画的矩形，请问总共有多少个单位的面积被涂上颜色。
 输入格式
 　　输入的第一行包含一个整数n，表示要画的矩形的个数。
 　　接下来n行，每行4个非负整数，分别表示要画的矩形的左下角的横坐标与纵坐标，以及右上角的横坐标与纵坐标。
 输出格式
 　　输出一个整数，表示有多少个单位的面积被涂上颜色。
 样例输入
 2
 1 1 4 4
 2 3 6 5
 样例输出
 15
 评测用例规模与约定
 　　1<=n<=100，0<=横坐标、纵坐标<=100。
 */
public class CCF_2_HuaTu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[100][100];
        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            for (int j = a; j < c; j++) {
                for (int k = b; k < d; k++) {
                    if (arr[j][k]==0) {
                        arr[j][k]=1;
                        result++;
                    }
                }
            }
        }
        System.out.print(result);

    }

}