public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");

        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Màu sắc: " + circle.getColor());

        circle.setRadius(3.0);
        circle.setColor("blue");

        System.out.println("Chu vi: " + circle.chuVi());
        System.out.println("Diện tích: " + circle.dienTich());

        circle.inputData();

        circle.displayData();
    }
}
