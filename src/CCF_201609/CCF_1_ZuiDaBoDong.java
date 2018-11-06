package CCF_201609;

import java.util.Scanner;

/**
 * Created by liudong on 2018/11/6.
 * 问题描述
 　　小明正在利用股票的波动程度来研究股票。小明拿到了一只股票每天收盘时的价格，他想知道，这只股票连续几天的最大波动值是多少，
     即在这几天中某天收盘价格与前一天收盘价格之差的绝对值最大是多少。
 输入格式
 　　输入的第一行包含了一个整数n，表示小明拿到的收盘价格的连续天数。
 　　第二行包含n个正整数，依次表示每天的收盘价格。
 输出格式
 　　输出一个整数，表示这只股票这n天中的最大波动值。
 样例输入
 6
 2 5 5 7 3 5
 样例输出
 4
 样例说明
 　　第四天和第五天之间的波动最大，波动值为|3-7|=4。
 评测用例规模与约定
 　　对于所有评测用例，2 ≤ n ≤ 1000。股票每一天的价格为1到10000之间的整数。
 */
public class CCF_1_ZuiDaBoDong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
           result =  Math.max(result,Math.abs((nums[i]-nums[i+1])));
        }
        System.out.print(result);
    }
}
