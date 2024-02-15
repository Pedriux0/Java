package assignment;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.paint.Color;

public class Wheels {

    private int x;

    private int y;

    private int radius;

    public Wheels(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Wheels() {

        this(0, 0, 20);

    }

    public Wheels(int x , int y){
        this(x, y ,20);
    }
    public void drawn(GraphicsContext gc){
        gc.setFill(Color.RED);
        gc.fillOval(x- radius, y - radius, radius * 2, radius *2 );
    }
}
