package Bai5.AccessModifier;

public class Circle {
    //Hai thuộc tính có access modifier là private:
    private double radius = 1.0;  // radius (double) có giá trị khởi tạo là 1.0
    private String color = "red"; // color (String) có giá trị khởi tạo là "red".

    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Hai hàm:
    public Circle () {  //Một hàm không tham số
    }

    public Circle (double radius) { //Một hàm có tham số là radius
        this.radius = radius;
    }

    public String getColor () {
        return color;
    }

    public double getRadius() {
        return  radius;
    }

    public double getArea () {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircus () {
        return this.radius * 2 * Math.PI;
    }

    public String toString () {
        return "+ bán kính: " + this.getRadius() + "\n" +
                "+ màu: " + this.getColor() + "\n";
    }
}
