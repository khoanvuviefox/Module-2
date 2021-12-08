import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 22940;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền (USD): ");
        usd = sc.nextDouble();
        double quydoi = usd * 22940;
        System.out.print("Giá trị tiền (VNĐ): " + quydoi);
    }
}
