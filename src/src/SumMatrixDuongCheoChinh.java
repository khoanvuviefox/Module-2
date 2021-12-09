import java.util.Scanner;

public class SumMatrixDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, row, col, sum = 0;
        System.out.println("Nhập số hàng:");
        row = sc.nextInt();
        System.out.println("Nhập số cột:");
        col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Nhập các phần tử của ma trận:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Các phần tử của ma trận:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == j)
                {
                    sum = sum + mat[i][j];
                }
            }
        }

        System.out.printf("Tổng các số ở đường chéo chính của ma trận = " + sum);
    }
}
