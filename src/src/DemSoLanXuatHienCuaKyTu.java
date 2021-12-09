public class DemSoLanXuatHienCuaKyTu {
    public static void main(String args[]) {

        String str = "Khoan đẹp trai nhất thế giới";
        char timkiem = 'a';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == timkiem)
                count++;
        }

        System.out.println("Ký tự '" + timkiem + "' xuất hiện " + count + " lần.");
    }
}