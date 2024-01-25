package attributes1;



public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        Circle d = new Circle();
        System.out.println(d);
        System.out.println(c == d);
        System.out.println(c.radius);
        c.radius = 75;
        System.out.println(c.radius);
        c = d ;
        System.out.println(c.radius);
        c.radius = 100;
        System.out.println(d.radius);
        System.out.println(c == d);
        Circle x = new Circle();
        System.out.println(x);
        Circle y = new Circle();
        System.out.println(y);
        System.out.println(c.x + "" + c.y);
        c.x = 50;
        c.y = 50;
        System.out.println(d.x + " " + d.y);
        System.out.println(c.addup(2 , 3, 4));
        d.radius = 2;
        System.out.println(d.getArea());
        c.setLocation(100 ,200);
        c.radius=  35;
        c.draw(gc);
        System.out.println(c.x + " " + c.y);
        Circle e =new Circle();
        System.out.println(c.equals(e));
        System.out.println(e.radius);
    }
}
