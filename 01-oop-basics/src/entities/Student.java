package entities;

public class Student {

    public String name;

    public double gradeA;
    public double gradeB;
    public double gradeC;

    public double finalGrade() {
        return gradeA + gradeB + gradeC;
    }

    public double missingPoints() {
        return finalGrade() < 60.0 ? 60.0 - finalGrade() : 0.0;
    }

    @Override
    public String toString() {
        String s = "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n";
        if (finalGrade() >= 60.0) {
            return s + "PASS";
        }
        return s + "FAILED\nMISSING " + String.format("%.2f", missingPoints()) + " POINTS";
    }
}
