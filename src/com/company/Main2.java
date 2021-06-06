package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
	/* 1. комп загадал число
        2. спросить у пользователя какое число он хочет ввести
        3. считать введенное пользователем число
        4. сравнить введенное пользователем и загаданное компом
        5.1. если число пользователя меньше загаданного, то вывести подсказку "введите больше"и перейти на шаг 2
        5.2. если число пользователя больше загаданного, то вывести подсказку "введите меньше"и перейти на шаг 2
        5.3. если число равно загаданному, то вывести что вы угадали и закончить программу
	 */
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int compNumber = 0;
        int userNumber;
        int attempt = 0;
        int complexity;
        int max = 0;


        System.out.println("Выберите уровень сложности: легкий - 1 (от 1 до 50) , средний - 2 (от 1 до 100) , тяжелый - 3 (от 1 до 500)");


        complexity = input.nextInt();

        switch (complexity) {
            case 1:
                compNumber = random.nextInt(50) + 1;
                max = 50;
                break;

            case 2:
                compNumber = random.nextInt(100) + 1;
                max = 100;
                break;
            case 3:
                compNumber = random.nextInt(500) + 1;
                max = 500;
                break;
            default:
                System.out.println("Вы не выбрали сложность");
        }



        do {

            System.out.println("Введите число: ");


            userNumber = input.nextInt();


            if (userNumber == 17) {
                System.out.print("Вы угадали одно из счастливых чисел, но призов за это не будет :( ");
            }

            if (attempt <= 500) {
                attempt++;
            }

            if (userNumber > compNumber) {
                System.out.println("Введите число поменьше, от 1 до " + userNumber);
            } else if (userNumber < compNumber) {
                System.out.println("Введите число побольше, от " + userNumber + " до " + max);
            }
        }
        while (compNumber != userNumber);
        if (attempt <= 3) {
            System.out.println("Поздравляем, вы угадали число c " + attempt + " попытки. Вы гений!");
        } else if (attempt > 3 && attempt <= 6) {
            System.out.println("Поздравляем, вы угадали число c " + attempt + " попытки. Вы молодец!");
        } else if (attempt > 6 && attempt <= 15) {
            System.out.println("Поздравляем, вы угадали число c " + attempt + " попытки. Неплохо!");
        } else if (attempt > 15 && attempt <= 30) {
            System.out.println("Поздравляем, вы угадали число c " + attempt + " попытки. Можно было справиться быстрее");
        } else if (attempt > 30) {
            System.out.println("Поздравляем, вы угадали число c " + attempt + " попытки. Очень слабо, старайтесь лучше!");


        }
    }
}