package lections.lesson16.string;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.salary=salary;
        this.isManager=isManager;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(100.5,true);
//        System.out.println(emp.salary, + emp.isManager); ми не можемо використати "+", як знак конкатенації,
//        тому що тут два різних примітивних типи даних;
        //але
        System.out.println("Vin meneger? " + emp.isManager + ";" + " Yogo zarplata: " + emp.salary + ";");

    }
}
