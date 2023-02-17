package lections.lesson16.stringIndian.stringHandling;

public class ReverseString {
    public static void main(String[] args) {
        String s2 = "Hello from the testing world";
        for (int i = s2.length()-1; i>=0 ; i--) {
            System.out.print(s2.charAt(i));
        }
    }
}
