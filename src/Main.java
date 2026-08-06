import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Task №1
        System.out.println("Task №1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(Arrays.toString(weight));
        // Task №1.1
        System.out.println("Task №1.1");
        float[] weight1 = {1.57F, 7.654F, 9.986F};
        System.out.println(Arrays.toString(weight1));
        // Task №1.2
        System.out.println("Task №1.2");
        String[] weight2 = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь"};
        System.out.println(Arrays.toString(weight2));
        // Task №2
        System.out.println("Task №2");
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
            } else {
                System.out.print(weight[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weight1.length; i++) {
            if (i == weight1.length - 1) {
                System.out.print(weight1[i]);
            } else {
                System.out.print(weight1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weight2.length; i++) {
            if (i == weight2.length - 1) {
                System.out.print(weight2[i]);
            } else {
                System.out.print(weight2[i] + ", ");
            }
        }
        System.out.println();

        // Task №3
        System.out.println("Task №3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight[i]);
            } else {
                System.out.print(weight[i] + ", ");
            }
        }
        System.out.println();
        for (int i = weight1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight1[i]);
            } else {
                System.out.print(weight1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = weight2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight2[i]);
            } else {
                System.out.print(weight2[i] + ", ");
            }
        }
        System.out.println();

        // Task №4
        System.out.println("Task №4");
        for (int i = 0; i < weight.length; i++) {
            weight[i]++;
            System.out.println(weight[i]);
        }
    }
}





