package Bai5.AccessModifier;

public class Test extends Circle {
    private double height = 0;

    public Test () {
    }

    public Test (double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Test (double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public double getArea () {
        return super.getArea() * 2 + super.getCircus() * this.height;
    }

    public double getVolume () {
        return super.getArea() * this.height;
    }

    public String toString () {
        return super.toString() + "+ chiều cao: " + this.getHeight() + "\n";
    }
}
