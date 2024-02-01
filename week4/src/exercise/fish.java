package exercise;

public class fish {
    private String name;
    private String color;
    private double size;
    private double x ,y ;

    // Constructor
    public fish(String name,String color, double size, double x , double y){
        this.name = name;
        this.color = color;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "fish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
