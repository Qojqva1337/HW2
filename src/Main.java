public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2.  Домашнее задание -1. Задание 1
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 1");
        int monthlyAdd = 15_000;
        int sum = 0;
        int mon = 1;
        while (sum < 2_459_000) {
            sum += monthlyAdd + sum * 0.01;
            System.out.println(" В " + mon + " Месяце - сумма накоплений составит " + sum + mon++);
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 2
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 3
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 3");
        int population = 12_000_000;
        float birthRate = (float) 17 / 1000;
        float deathRate = (float) 8 / 1000;
        for (int a = 1; a < 11; a++) {
            population = population + Math.round(population * birthRate) - Math.round(population * deathRate);
            System.out.println(" Year = " + a + " population");
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 4
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 4");
        int mouth = 1;
        int summ = 15_000;
        while (summ < 12_000_000) {
            summ += summ * 0.07;
            System.out.println(" В " + mouth + " Месяце - сумма накоплений составит " + summ + " рублей");
            mouth++;
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 5
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 5");
        int mouth1 = 1;
        int summ1 = 15_000;
        while (summ1 < 12_000_000) {
            summ1 += summ1 * 0.07;
            if (mouth1 % 6 == 0) {
                System.out.println(" В " + mouth1 + " Месяце - сумма накоплений составит " + summ1 + " рублей");
            }
            mouth1++;
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 6
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 6");
        int mouth2 = 1;
        int summ2 = 15_000;
        while (mouth2 <= 9 * 12) {
            summ2 += summ2 * 0.07;
            if (mouth2 % 6 == 0) {
                System.out.println(" В " + mouth2 + " Месяце - сумма накоплений составит " + summ2 + " рублей");
            }
            mouth2++;
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 7
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 7");
        int lastDay = 30;
        int firstFriday = 2;
        while (firstFriday <= lastDay) {
            System.out.println("Today is Friday " + firstFriday);
            firstFriday += 7;
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 8
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 8");
        int currentYear = 2022;
        int startPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        for (int g = startPeriod; g <= endPeriod; g++) {
            if (g % 79 == 0) {
                System.out.println(g);
                }
            }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 9
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 9");
        for (int s = 1; s <= 10; s++) {
            System.out.println("2x" + s + " = " + 2 * s);
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание -1. Задание 10
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 10");

    }

}
