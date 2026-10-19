package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_StudentStatus {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();

        student.gradeA = sc.nextDouble();
        student.gradeB = sc.nextDouble();
        student.gradeC = sc.nextDouble();

        double finalGrade = student.finalGrade();

        System.out.println(student);

        sc.close();
    }
}
