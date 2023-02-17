package lections.lesson16.string;

public class Test8 {
    public static void main(String[] args) { // в класі стрінг метод іквалс перезаписаний (тобто == та іквалс це не одне і теж);
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1==s2); // порівнюються різні об'єкти;
        System.out.println(s1.equals(s2)); // метод іквалс для класу стрінг буде true, якщо value однакове навіть якщо об'єкти різні;
        String s3 = "pruvit"; //  s3 створює елемент в стрінг пулі з value "привіт";
        String s4 = "pruvit"; // елемент не створюється, а просто посилається на вже створений з таким самим value;
        System.out.println(s3==s4); // порівнюються два посилання на один і той самий об'єкт;
        System.out.println(s3.equals(s4)); //true, бо довжина та послідовність букв однакова;

    }
}
