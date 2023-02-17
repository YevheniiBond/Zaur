package lections.lesson16.string;

public class Homework {
    void showEmail(String eMail) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < eMail.length()-1) {
            a = eMail.indexOf('@', c);
            b = eMail.indexOf(".", c);
            c = eMail.indexOf(";", c + 1);
            System.out.println(eMail.substring(a + 1, b));
        }

    }

    public static void main(String[] args) {
        Homework homework = new Homework();
        homework.showEmail("ya@yahoo.com; on@mail.com; ona@gmail.com;");
    }
}
