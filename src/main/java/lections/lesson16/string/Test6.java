package lections.lesson16.string;

public class Test6 {
    public static void main(String[] args) {
        String p = "PrUvIt:2";
        String p1 = p.toLowerCase(); // всі букви починають писатися з маленької;
        System.out.println(p1);

        String s3 = p.toUpperCase();
        System.out.println(s3);

        boolean b = p.contains(":2");
        System.out.println(b);
    }
}
