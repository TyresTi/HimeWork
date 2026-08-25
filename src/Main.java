import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task№1
        System.out.println("Task№1");
        int[] inputArray1 = {12000, 15000, 9000, 18000, 11000};
        double[] outputArray1 = new double[4];
        int sum = 0;
        for (int pyment : inputArray1) {
            sum += pyment;
        }
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int pyment : inputArray1) {
            if (pyment > max) {
                max = pyment;
            }
            if (pyment < min) {
                min = pyment;
            }
        }
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = (double) sum / inputArray1.length;
        System.out.println("inputArray1:");
        for (int value : inputArray1) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("outputArray1:");
        for (double value : outputArray1) {
            System.out.print(value + " ");
        }
        System.out.println();

        //task№2
        System.out.println("Task№2");

        int[] inputArray2 = {30000, 45000, 50000, 60000, 75000};
        double[] outputArray2 = new double[5];
        int index2 = 0;
        for (int pyment : inputArray2) {
            outputArray2[index2] = pyment * 0.13;
            index2++;
        }
        System.out.println("inputArray2:");
        for (int payment : inputArray2) {
            System.out.print(payment + " ");
        }
        System.out.println();
        System.out.println("outputArray2:");
        for (double tax : outputArray2) {
            System.out.print(tax + " ");
        }
        System.out.println();

        //task№3
        System.out.println("Task№3");
        int[] inputArray3 = {3000, 5500, 7000, 4500, 9000};
        boolean[] outputArray3 = new boolean[5];
        int index3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index3] = bonus > 5000;
            index3++;
        }
        System.out.println("inputArray3:");
        for (int bonus : inputArray3) {
            System.out.print(bonus + " ");
        }
        System.out.println();
        System.out.println("outputArray3:");
        for (boolean flag : outputArray3) {
            System.out.print(flag + " ");
        }
        System.out.println();

        //task№4
        System.out.println("Task№4");
        int[] inputArray4 = {40000, 20000, 5000, 1000, -1000};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;
        for (int value : inputArray4) {
            if (value < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println("inputArray4");
        for (int flag : inputArray4) {
            System.out.print(flag + " ");
        }
        System.out.println();
        System.out.println("outputArray4");
        for (boolean flag : outputArray4) {
            System.out.print(flag + " ");
        }
        System.out.println();

        //task№5
        System.out.println("Task№5");
        int[] inputArray5 = {50000, -12000, 30000, 0, 45000};
        int [] outputArray5 = new  int[1];
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5[0]++;
            }
        }
        System.out.println("inputArray5:");
        for (int profit : inputArray5) {
            System.out.print(profit + " ");
        }
        System.out.println();
        System.out.println("outputArray5:");
        System.out.println(outputArray5[0]);
    }
}







