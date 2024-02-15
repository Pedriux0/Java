package Arrays;

public class Mainmethod {

    public static void main(String[] args) {
        int[] x = {2,3,10,50};

        IntArrayProcessor a = new IntArrayProcessor(x);
        a.print();

        a.printReverse();
        a.increment(10);
        System.out.println();
        a.print();
    }
}
