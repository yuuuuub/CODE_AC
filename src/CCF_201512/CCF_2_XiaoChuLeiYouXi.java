package CCF_201512;

import java.util.Scanner;

/**
 * Created by liudong on 2018/11/8.
 *问题描述
 　　消除类游戏是深受大众欢迎的一种游戏，游戏在一个包含有n行m列的游戏棋盘上进行，棋盘的每一行每一列的方格上放着一个有颜色的棋子，
     当一行或一列上有连续三个或更多的相同颜色的棋子时，这些棋子都被消除。当有多处可以被消除时，这些地方的棋子将同时被消除。
 　　现在给你一个n行m列的棋盘，棋盘中的每一个方格上有一个棋子，请给出经过一次消除后的棋盘。
 　　请注意：一个棋子可能在某一行和某一列同时被消除。
 输入格式
 　　输入的第一行包含两个整数n, m，用空格分隔，分别表示棋盘的行数和列数。
 　　接下来n行，每行m个整数，用空格分隔，分别表示每一个方格中的棋子的颜色。颜色使用1至9编号。
 输出格式
 　　输出n行，每行m个整数，相邻的整数之间使用一个空格分隔，表示经过一次消除后的棋盘。如果一个方格中的棋子被消除，
     则对应的方格输出0，否则输出棋子的颜色编号。
 样例输入
 4 5
 2 2 3 1 2
 3 4 5 1 4
 2 3 2 1 3
 2 2 2 4 4
 样例输出
 2 2 3 0 2
 3 4 5 0 4
 2 3 2 0 3
 0 0 0 4 4
 样例说明
 　　棋盘中第4列的1和第4行的2可以被消除，其他的方格中的棋子均保留。
 样例输入
 4 5
 2 2 3 1 2
 3 1 1 1 1
 2 3 2 1 3
 2 2 3 3 3
 样例输出
 2 2 3 0 2
 3 0 0 0 0
 2 3 2 0 3
 2 2 0 0 0
 样例说明
 　　棋盘中所有的1以及最后一行的3可以被同时消除，其他的方格中的棋子均保留
 */
public class CCF_2_XiaoChuLeiYouXi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int[][] copy_matrix = new int[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                copy_matrix[i][j] = matrix[i][j];
            }
        }
        // 行的判断
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m-1; j++) {
                if (matrix[i][j-1] == matrix[i][j] && matrix[i][j+1] == matrix[i][j]) {
                     copy_matrix[i][j-1] = copy_matrix[i][j]=copy_matrix[i][j+1]=0;
                }
            }
        }

        // 列的判断
        for (int j = 0; j < m; j++) {
            for (int i = 1;  i< n-1; i++) {
                if (matrix[i-1][j] == matrix[i][j] && matrix[i][j] == matrix[i+1][j]) {
                    copy_matrix[i-1][j] = copy_matrix[i][j]=copy_matrix[i+1][j]=0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(copy_matrix[i][j]+" ");
                count++;
                if (count == 5) {
                    System.out.print('\n');
                    count=0;
                }
            }
        }
    }
}
