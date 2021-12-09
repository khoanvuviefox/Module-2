import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Vũ Khoan", "Gia Bảo", "Dẩn Lê", "Đại Dương", "Tuấn Anh", "Anh Tuấn"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học viên: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí trong danh sách của học viên " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không có tên trong danh sách" + input_name + " in the list.");
        }
    }
}
