import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Task №1
        System.out.println("Task №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф. И. О. сотрудника — " + fullName);
//        Task №2
        System.out.println("Task №2");
        String f1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + f1);
//        Task №3
        System.out.println("Task №3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1);
//        Task №4
        System.out.println("Task №4");
    }
}







