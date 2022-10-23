/*
Компьютер должен загадать число от 0 до 9
Пользователю надо угадать это число
Вести подсчет кол-во попыток угадывания
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userNum;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 9");

        int num = (int)Math.floor(Math.random() * 10);  //floor - округляет в меньшую сторону

        do {
            count++;
            System.out.println("Введи число");
            userNum = input.nextInt();

            if (userNum > num) {
                System.out.println("Число меньше");
            } else if (userNum < num) {
                System.out.println("Число больше");
            } else {
                System.out.println("Правильно");
            }
        } while (userNum != num);

        System.out.println("Всего попыток было потрaченно " + count);

    }
}