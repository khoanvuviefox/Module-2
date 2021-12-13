package ClassesObjects.ClassFan;

public class TestClassFan {
    public static void main(String[] args) {
        ClassFan fan1 =new ClassFan(3,true,"green",10);
        ClassFan fan2 =new ClassFan(2,false,"black",5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
