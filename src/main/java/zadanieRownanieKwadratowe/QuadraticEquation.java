package zadanieRownanieKwadratowe;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = b * b - 4 * a * c;

    }

    public void obliczenie() {


        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            throw new DeltaEqualsZeroException();
        } else if (delta < 0) {
            throw new DeltaLessThanZeroException();
        }

    }


    public double getX1() {
        return x1;
    }


    public double getX2() {
        return x2;
    }

    public double getDelta() {
        return delta;
    }
}
