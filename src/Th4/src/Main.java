import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Nhập a = ");
        double a  = input.nextDouble();
        System.out.println("Nhập b = ");
        double b  = input.nextDouble();
        calculator.setA(a);
        calculator.setB(b);
        System.out.println("Tổng của 2 số là : "+ calculator.add());
        System.out.println("Hiệu của 2 số là : "+ calculator.sub());
        System.out.println("Tích của 2 số là : "+ calculator.multi());
        System.out.println("Thương của 2 số là : "+ calculator.div());

    }
}