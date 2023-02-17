package lections.lesson8;

public class Test {
    //final для змінних означає що ми їх значення змінювати не можемо
     public final int a = 10; // read only ми не можемо змінити цю змінну
     // public final d; у змінних з файнал не може бути дефолтного значення

    public static void main(String[] args) {
        Test t = new Test();
//        t.a = t.a *2; якщо розкоментувати, то буде горіти червоним, тому що значення ~а~ ми змінювати не можемо
        System.out.println();
    }
}
