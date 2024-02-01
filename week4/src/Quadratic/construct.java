package Quadratic;

public class construct {

    private double a;

    private double b;

    private double c;

    // Construct

    public construct(double a, double b , double c){
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


    public String toString(){return a + "x^2" + b + "x" + c;}

    public double getDiscriminant(){return (b*b) - (4*a*c); }

    public double getRoot1(){
        double discriminant = getDiscriminant();
        if(discriminant >= 0){
            return -b + Math.sqrt(discriminant) / (2*a) ;
        } else {
            return 0;
        }
    }
}
