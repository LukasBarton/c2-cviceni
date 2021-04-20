package cz.educanet.praha;

import java.util.Scanner;

public class Average {

    public static double average(Scanner scanner) {
        double sum = 0;
        double average = 0;
        int i = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
            i++;
        }
        average = average + sum/i;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }
}
