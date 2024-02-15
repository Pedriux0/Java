package arrayObjects;

public class ArraysObjects1 {
    public static void main(String[] args) {
        Circle[] a = new Circle[5];
        for(Circle c: a){
            System.out.println(c + " ");
        }
        for(int i = 0; i <a.length; i++){
            a[i] = new Circle(i + 1);
        }
        System.out.println();
        for(Circle c : a){
            System.out.println(c + " ");
        }
        System.out.println(a[1].getRadius());
        System.out.println(a[1].getArea());
        Circle c = a[2];
        System.out.println(c.getRadius());
        double totalArea = 0;
        for (int i = 0; i < 5; i++) {
            totalArea += a[i].getArea();
        }
    }

}
