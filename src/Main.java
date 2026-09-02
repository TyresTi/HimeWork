import java.util.Arrays;

import java.util.concurrent.ThreadLocalRandom;
public class Main {
    //    Для задачи №1
    public static void checkYear(int year) {
        System.out.println("Проверяемый год: " + year + ".");
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else
            System.out.println(year + " год не является високосным.");
    }
    //    Общие разделители
    public static void printSeparator() {
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
    }
    public static void printSeparator1() {
        System.out.println("================");
    }
    //    Для задачи №2
    public static void installAppType(int clientOs, int clientDeviceYear) {
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ....");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: ....");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке: ....");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке: ....");
        }
    }
    public static int randomYear() {
        int minYear = 2000;
        int maxYear = 2026;
        return ThreadLocalRandom.current().nextInt(minYear, maxYear + 1);
    }
    public static int randomOs() {
        int minOs = 0;
        int maxOs = 1;
        return ThreadLocalRandom.current().nextInt(minOs, maxOs + 1);
    }
    //    Для задачи №3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
    public static int randomDeliveryDistance() {
        int minDistance = 0;
        int maxDistance = 200;
        return ThreadLocalRandom.current().nextInt(minDistance, maxDistance + 1);
    }
    public static void main(String[] args) {
//        Task №1
        System.out.println("Task №1");
        printSeparator();
        checkYear(randomYear());
        printSeparator1();
//        Task №2
        System.out.println("Task №2");
        printSeparator();
        int clientDeviceYear = randomYear();
        int clientOs = randomOs();
        if (clientOs == 1) {
            System.out.println("Ваша операционная система: Android" +".");
        } else {
            System.out.println("Ваша операционная система: iOS" +".");
        }
        System.out.println("Год выпуска вашего телефона: " + clientDeviceYear +".");
        installAppType(clientOs, clientDeviceYear);
        printSeparator1();
        //        Task №3
        System.out.println("Task №3");
        printSeparator();
        int deliveryDistance = randomDeliveryDistance();
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Расстояние до клиента: " + deliveryDistance + "км.");
        if (deliveryDays == 0) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays +".");
        }
        printSeparator1();
    }
}







