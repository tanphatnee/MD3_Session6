public class Calculator {
    double a;
    double b;

    public Calculator() {

    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public double getA() {
        return a;

    }

    public void setA(double a) {
        this.a = a;

    }

    public double getB() {
        return a;

    }

    public void setB(double b) {
        this.b = b;

    }
    public  double add(){
        return a + b;
    }
    public double sub(){
        return  a - b;
    }
    public double multi(){
        return a*b;
    }
    public double div() {
        return a/b;
    }

}
