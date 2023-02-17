package lections.lesson4;

public class Car {
    String color = "red";
    String engine = "V6";

}

class carTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.engine);
        System.out.println(car1.color);
    }
}
