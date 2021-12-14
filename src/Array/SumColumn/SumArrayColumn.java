package Array.SumColumn;

public class SumArrayColumn {
    public static int[][] generator(int size, int maxValue) {
        int[][] ouRay = new int[size][size];
        for (int[] x : ouRay) {
            for (int i = 0; i < x.length; i++) {
                x[i] = (int) (Math.random() * maxValue);
            }
        }
        return ouRay;
    }

    public static int sumColumn(int[][] arr, int column) {
        int sum = 0;
        if ((column < arr.length)&&(column>=0)) {
            for (int i = 0; i < arr.length; i++) {
                sum+= arr[i][column];

            }
        }
        return sum;
    }
    public static String print(int[][] arr){
        String print = "";
        for (int[]x :arr){
            for (int y: x){
                print+= (String.valueOf(y)+"  ");
            }
            print+="\n \n";
        }
        return print;
    }
}
