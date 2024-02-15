package arraysinstance;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class variablesMain {
    public static void main(String[] args) {
        double[] myArray  = {2.2,3.2,6.2};
        ArraysInstanceVariable a = new ArraysInstanceVariable(myArray);
        System.out.println(a.getElement(1));
        myArray[0] = 99.9;
        System.out.println();
        System.out.println(a.getElement( 0 ));
    }
}
