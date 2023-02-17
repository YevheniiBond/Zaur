package lections.lesson8;

public class Student {

    String name;
    int course;
     static int count; // ось тут буде постійно дефолтне значення 0, якщо не використати слово final; якщо перед змінною стоїть слово static, то ця змінна належить всьому класу

    public Student(String name2, int course2) {
        count++; //  ось тут воно збільшується на 1, але далі одиниці не йде без final;
        this.name = name2;
        this.course = course2;
        System.out.println("Student " + count + " created");
    }
}

class studentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Vlad", 2);
        Student st3 = new Student("Vadym", 5);
        System.out.println(st1.name);
        System.out.println(Student.count);
    }
}
