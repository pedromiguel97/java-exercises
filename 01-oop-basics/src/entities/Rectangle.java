package entities;

public class Rectangle {

    // attributes
    public double width;
    public double height;

    // methods

    // Area: A = w × h
    public double area() {
        return width * height;
    };

    // Perimeter: P = 2(w + h)
    public double perimeter() {
        return 2 * (width + height);
    }

    // Diagonal: d = √(w² + h²)
    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return "AREA = "
                + String.format("%.2f", area())
                + "\n"
                + "PERIMETER = "
                + String.format("%.2f", perimeter())
                + "\n"
                + "DIAGONAL = "
                + String.format("%.2f", diagonal());
    }
}
