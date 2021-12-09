public class MinArrayFind {
    public static void main(String[] args) {
        int numbers[] = new int[]{1, 2, 3, 4, 5};
        int min = numbers[0];
        //Vòng lặp
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
