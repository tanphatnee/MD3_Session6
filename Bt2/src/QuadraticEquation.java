import java.util.Scanner;

// Lớp QuadraticEquation
class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // Phương thức khởi tạo
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter cho a
    public double getA() {
        return a;
    }

    // Getter cho b
    public double getB() {
        return b;
    }

    // Getter cho c
    public double getC() {
        return c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phương thức tính nghiệm
    public void calculateRoots() {
        double delta = getDiscriminant();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm thứ nhất: " + x1);
            System.out.println("Nghiệm thứ hai: " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Nghiệm duy nhất: " + x);
        } else {
            System.out.println("Phương trình không có nghiệm");
        }
    }
}