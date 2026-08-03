//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Task №1
        System.out.println("//Task №1");
        int firstFriday = 1;
        for (; firstFriday <= 31; firstFriday++) {
            if (firstFriday % 7 == 0) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            }
        }

        //Task №2
        System.out.println("//Task №2");
        int distance = 0;
        int fullDistance = 42195;
        do {
            System.out.println("Держитесь! Осталось " + (fullDistance - distance) + " метров");
            distance = distance + 500;
        }
        while (distance <= fullDistance);

        //Task №2.1
        System.out.println("//Task №2.1");
        int distance1 = 0;
        int fulldistance1 = 42195;
        int steps = 0;
        for (int i = 0; i < 84; i++) {
            distance1 = distance1 + 500;
            steps = steps + 1;
            System.out.println("Держитесь! Осталось " + (fulldistance1 - distance1) + " метров");
        }
        //Task №2.2
        System.out.println("//Task №2.2");
        System.out.println("Программа работает корректно и выводит " + steps + " сообщения");
        //Task №2.3
        System.out.println("//Task №2.3");
        System.out.println("Оба варианта проверены на читаемость и корректность кода");

        //Task №3
        System.out.println("//Task №3");
        int sum = 1000;
        int currentDay = 1;
        while (sum >= 100) {
            if (currentDay % 5 == 0) {
                currentDay++;
                continue;
            }
            sum = sum - 100;
            currentDay++;
        }
        System.out.println("Вы можете оставить автомобиль на " + (currentDay - 1) + " дней.");
        //Task №3.1
        System.out.println("//Task №3.1");
        int sum1 = 1000;
        int currentDay1 = 1;
        for (int day = 1; sum1 >= 100; day++) {
            if (day % 5 == 0) {
                currentDay1++;
                continue;
            }
            sum1 = sum1 - 100;
            currentDay1++;
        }
        System.out.println("Вы можете оставить автомобиль на " + (currentDay1 - 1) + " дней.");

        //Task №4
        System.out.println("//Task №4");
        int month = 0;
        int total = 0;
        while (true) {
            total += 15000;
            month++;
            if (month % 6 == 0) {
                total += total * 7 / 100;
            }
            System.out.println("Месяц " + month + ". Сумма накоплений: " + total);
            if (total >= 12_000_000) {
                break;
            }


        }
        //Task №5
        System.out.println("//Task №5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев! Зарядка приостановлена.");

                if (overheats > 3) {
                    System.out.println("Зарядка досрочно завершена.");
                    break;
                }
                minute += 2;
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут.");


    }
}





