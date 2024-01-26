package encapsulation5;

public class MainTest {
    public static void main(String[] args) {

        Circle6 c = new Circle6();
        System.out.println(c.getRadius());
        c.setRadius(20);
        System.out.println(c.getRadius());
        System.out.println(c.getLocationX());
        System.out.println(c.getLocationY());
        System.out.println(c.toString());
        System.out.println(c);
    }
}
