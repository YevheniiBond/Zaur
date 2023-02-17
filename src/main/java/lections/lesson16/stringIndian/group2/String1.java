package lections.lesson16.stringIndian.group2;

public class String1 {
    String text1 = "Testing World";
    String text2 = "India";
    String text3 = "Hello this is testing world";

    public void stringOperation2() {
        String[] arr = text3.split(" ");
        for (String a: arr) {
            System.out.println(a);
        }

        System.out.println(text1.replace("ting", "$$"));

        // цей метод рахує скільки разів повторюється буква - е
        System.out.println(text1.length() - text1.replace("e", "").length());

        System.out.println(text1 + " " + text2);

        System.out.println(text1.concat(" ").concat(text2));

        System.out.println(text1.substring(2, 6));

        if (text1.contains("ting")) {
            System.out.println("Found");
        } else {
            System.out.println("Not a found");
        }

    }
}
