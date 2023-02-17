package lections.lesson16.string;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Щоб мудро життя прожити, треба чимало знати. Для початку запам'ятай два важливих правила: " +
                "Краще будь голодним, ніж їсти що попало І краще будь один, ніж разом з ким завгодно.";
        String s2 = s1.toUpperCase(); // такий самий стрінг тільки всі букви великі;
        char c1; // буква 1
        char c2; // буква велика 2
        for (int i = 0; i < s1.length(); i++) { // 0 менше довжини s1? так! ---> заходимо в тіло методу
            c1 = s1.charAt(i); // 0 = Ч,
            c2 = s2.charAt(i); // 0 = Ч,
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 !='\'' && c1 == c2) { // 0 це нічого з перечисленого
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
