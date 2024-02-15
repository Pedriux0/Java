package Arrays;

public class IntArrayProcessor {

    private int[] a;

    public IntArrayProcessor(int[] a){
        this.a = new int[a.length];
        for(int i = 0; i< a.length; i++){
            this.a[i] = a[i];
        }
    }

    public void print(){
        for(int element: a){
            System.out.println();
        }
    }
    public void printReverse(){
        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
    public void increment(int i){
        for(int index= 0; index < a.length; index++){
            a[index] = a[index] + i;
        }
    }
    }