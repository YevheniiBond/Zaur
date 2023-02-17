package lections.lesson16.string;

public class Test2 {
    String S1 = "Hello";
    static String s1 = new String("Good Day!");
    static String s2 = new String("Bad Day!");
    static String s3 = new String("Bad Day!");

    // об'єкти s2 та s3 посилаються на різні адреси;
    static String s4 = "Hello";
    static String s5 = "Hello";

    public static void main(String[] args) {
        String string = new String();
        System.out.println("Hello");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s5.equals(s4));
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
    }

}
