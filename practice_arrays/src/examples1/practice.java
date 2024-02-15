package examples1;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int[] a;
        a = new int[10];
        System.out.println(a);
       System.out.println(a[2]);
        a[2] = 45;
        System.out.println(a[2]);
        int[] x;
        x = a;
        System.out.println(x[2]);
        x[1] = 10;
        System.out.println(a[1]);
        System.out.println(a);
        System.out.println(x);
        String[] myStrings = {"Hi","there", "all"};
        System.out.println(myStrings[0]);
        String[] yourStrings = new String[3];
        yourStrings[0] = "Hi";
        yourStrings[1] = "there";
        yourStrings[2] = "all";
        System.out.println(yourStrings[0]);
        System.out.println(yourStrings[1]);
        System.out.println(yourStrings[2]);
        System.out.println(yourStrings.length);
        for (int i = 0; i<x.length; i ++){
            x[i] = 10;
        }
        for(int i= 1; i<x.length; i++){
            System.out.print(x[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(x));

        // Enhanced for loop
        for(int element: x){
            System.out.println(element + " ");
        }
        double k[]= new double[5];
        System.out.println();
        Scanner sc = new Scanner(System.in);
        for(int i =  0; i<k.length; i++){
            k[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(k));
    }

}
