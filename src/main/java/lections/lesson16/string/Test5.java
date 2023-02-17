package lections.lesson16.string;

public class Test5 {
    public static void main(String[] args) {
        String s = null; //це означає що стрінг s немає адресу, тобто не посилається на будь-який об'єкт;
        s +="ok";
        System.out.println(s);
    }
}
