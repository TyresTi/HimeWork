import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Task №1
        int[] weight = new int[3];
        weight[0] = 3;
        weight[1] = 9;
        weight[2] = 67;
        // Task №1.1
        float[] weight1 = {1.57F, 7.654F, 9.986F};
        // Task №1.2
        String[] weight2 = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь" };
        // Task №2
        System.out.println("Task №2");
        System.out.println(weight[0] + "," + weight[1] + "," + weight[2]);
        System.out.println(weight1[0] + "," + weight1[1] + "," + weight1[2]);
        System.out.println(weight2[0] + "," + weight2[1] + "," + weight2[2] + "," + weight2[3] + "," + weight2[4] + "," + weight2[5]);
        // Task №3
        System.out.println("Task №3");
        System.out.println(weight[2] + "," + weight[1] + "," + weight[0]);
        System.out.println(weight1[2] + "," + weight1[1] + "," + weight1[0]);
        System.out.println(weight2[5] + "," + weight2[4] + "," + weight2[3] + "," + weight2[2] + "," + weight2[1] + "," + weight2[0]);
        // Task №4
        System.out.println("Task №4");
        for (int i = 0; i < weight.length; i++) {
            weight[i]++;
            System.out.println(weight[i]);
        }
    }
}





