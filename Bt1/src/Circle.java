import java.util.Scanner;

// Lớp Circle
class Circle {
    private double radius;
    private String color;

    // Phương thức khởi tạo không tham số
    public Circle() {
        radius = 0.0;
        color = "black";
    }

    // Phương thức khởi tạo có tham số
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter và Setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và Setter cho color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính chu vi
    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double dienTich() {
        return Math.PI * radius * radius;
    }

    // Phương thức cho phép người dùng nhập thông tin
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính: ");
        radius = scanner.nextDouble();

        System.out.print("Nhập màu sắc: ");
        color = scanner.next();
    }

    // Phương thức hiển thị thông tin
    public void displayData() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Diện tích: " + dienTich());
    }
}
