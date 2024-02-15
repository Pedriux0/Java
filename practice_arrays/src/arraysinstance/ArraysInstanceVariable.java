package arraysinstance;

public class ArraysInstanceVariable {
    private double[] x;
    public ArraysInstanceVariable(double[] x){
        this.x = new double[x.length];
        for(int i = 0; i < x.length; i++){
            this.x[i] = x[i];
        }

    }
    public double getElement(int i){
        return x[i];
    }
}
