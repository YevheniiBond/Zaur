package lections.lesson16.string;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String colir) {
        Car c10 = new Car(colir, "v5");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        Car c2 = c.abc("Black");
        System.out.println(c.color);
        System.out.println(c.abc("Blue"));

    }
}
