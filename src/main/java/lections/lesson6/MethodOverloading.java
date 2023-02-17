package lections.lesson6;

public class MethodOverloading { //перевантаження методів;
    void show(int i1) {
        System.out.println(i1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        String s = "pruvit";
        mO.show(s);
        boolean b = true;
        mO.show(b);
    }
}