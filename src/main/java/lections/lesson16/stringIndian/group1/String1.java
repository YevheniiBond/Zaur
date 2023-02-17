package lections.lesson16.stringIndian.group1;

public class String1 {
    //Стрінг це не примітив. Стрінг це клас, а тому пишеться з великої букви.
    String s1;
    //Якщо стрінг це клас, то ми можемо створити об'єкт класу
    String s2 = new String();
    //String is not datatype in Java
    //String is a class in Java
    String s3 = "  Hello hello  ";
    String s5 = "Testing World";
    String s4 = new String("Hello");

    public void stringOperations(){
       int i =  s3.trim().length();
        System.out.println("String length: " + i);
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s5.charAt(8));
    }
}
