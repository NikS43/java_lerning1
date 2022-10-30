/*
Компьютер должен загадать число от 0 до 9
Пользователю надо угадать это число
Вести подсчет кол-во попыток угадывания
 */


import java.util.Scanner;

public class Main {
        public static void solutionSingleNum() {
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

        public static void solutionDoubleNums() {
            int userNum1 = -1;
            int userNum2 = -1;
            int count = 0;

            Scanner input = new Scanner(System.in);
            System.out.println("Отгадай 2 числа");

            int num1 = (int)Math.floor(Math.random() * 15 + 1);  //floor - округляет в меньшую сторону
            int num2 = (int)Math.floor(Math.random() * 6);  //floor - округляет в меньшую сторону

            do {
                count++;

                if (userNum1 != num1) {
                    System.out.println("введи 1 число");
                    userNum1 = input.nextInt();

                    if (userNum1 > num1) {
                        System.out.println("Число 1 меньше");
                    } else if (userNum1 < num1) {
                        System.out.println("Число 1 больше");
                    } else {
                        System.out.println("Число 1 правильно");
                    }
                }
                if (userNum2 != num2) {
                    System.out.println("введи 2 число");
                    userNum2 = input.nextInt();

                    if (userNum2 > num2) {
                        System.out.println("Число 2 меньше");
                    } else if (userNum2 < num2) {
                        System.out.println("Число 2 больше");
                    } else {
                        System.out.println("Число 2 правильно");
                    }
                }
                } while (userNum1 != num1 && userNum2 != num2);
                System.out.println("попыток затрачено " + count);
            }

    public static void main(String[] args) {
        System.out.println("Выберете задачу \n" +
                "1 - угадать 1 число \n" +
                "2 - угадать 2 числа");
        Scanner input = new Scanner(System.in);
        int solN = input.nextInt();
        if (solN == 1) {
            solutionSingleNum();
        } else if (solN == 2) {
            solutionDoubleNums();
        } else {
            System.out.println("Ч... Чегооооооо?!?!?!");
        }

    }
}