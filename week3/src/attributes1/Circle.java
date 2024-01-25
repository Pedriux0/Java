package attributes1;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Circle {

    double radius = 50;
    int color = 0; // 0-red 1- black -2 blue
    double x,y;

    int addup(int a, int b , int c){
        int d = a+ b + c ; // i want chips
        return d;
    }
    double getArea(){
         return Math.PI * Math.pow(radius,2);
    }

    void setLocation(double newx, double newy){
        x = newx;
        y = newy;
    }
    boolean equals(Circle other){
        other.radius = 1000;
        return (x == other.x && y == other.y && radius == other.radius  && color == other.color);
    }
    void draw(GraphicsContext gc){
        gc.setStroke(Color.BLACK);
        gc.strokeOval(x-radius, y-radius, radius*2 , radius*2);
    }
}
