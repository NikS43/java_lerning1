import java.util.Scanner; //импорт библиотеки для работы с вводом
public class App {
    // строчный коментаррий
    /*
    многострочный коментарий
     */
    public static void main(String[] args) {
        //System.out.println("Hello world!")
            //Молодой 15-25
            //~ 26-35
            //В рассвете сил 36-65
            //Старый 66-100

            // Scanner input = new Scanner(n


       // if (/*логическое выражение*/) {

       // } else {

       // }

//        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//
//        if (age <= 18) {
//            System.out.println("Молодой");
//        } else if (age <= 65) {
//            System.out.println("В возрасте");
//        } else {
//            System.out.println("Старый");
//        }



        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = input.nextInt();

        System.out.println("Введите второе число");
        int b = input.nextInt();

        if (a < b) {
            System.out.println("a меньше b");
        } else if (a > b) {
            System.out.println("a больше b");
        } else {
            System.out.println("a равно b");
        }

    }
}