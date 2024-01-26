package encapsulation5;

/**
 * This class defines a circle with radius adn x,y location
 *
 * @author Juan Naranjo
 */
public class Circle6 {

    private double radius = 10;
    /**
     * The x-coordinate of the circle
     */
    private double x = 100;
    /**
     * The y-coordinate of the circle
     */
    private double y = 100;

    /**
     * It gets the radius
     *
     * @return radius
     */
    public double getRadius(){
        return radius;
    }

    /**
     *
     *
     * @param other Repdresents your second Circle Object
     * @return boolean
     */
    public boolean equals(Circle6 other){
        return (this.x == other.x && this.y == other.y && this.radius == other.radius);
    }
    /**
     * It sets the radius of the circle
     *
     * @param radius The radius of the radius
     */
    public void setRadius(double radius){
        this.radius  = radius;
    }

    /**
     *
     * get your x location
     * @return
     */
    public double getLocationX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getLocationY(){
        return y;
    }

    /**
     * set your y-coordinate
     * @param y y-coordinate
     */
    public void setY(double y){
        this.y = y;
    }
    public String toString(){
        return "Circle6: radius " + radius + "x- location " + x + "y-location "+ y ;

    }
}
