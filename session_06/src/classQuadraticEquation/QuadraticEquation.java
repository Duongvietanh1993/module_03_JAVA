package classQuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b,2) - (4 * (this.a * this.c));
        return delta;
    }

    public double getRoot1() {
        double r1 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
        return r1;
    }
    public  double getRoot2(){
        double r2 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
        return r2;
    }
}
