package application;

import java.util.ArrayList;
import java.util.List;

public class Ex99_PrettierTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bruno");
        names.add("Carla");
        for (String name : names) {
            if (name.length() > 3) {
                System.out.println("Long name: " + name);
            } else {
                System.out.println("Short name: " + name);
            }
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        System.out.println("Total: " + total);
        double average = calculateAverage(new int[] { 4, 8, 15, 16, 23, 42 });
        System.out.println("Average: " + average);
    }

    private static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.length;
    }
}
