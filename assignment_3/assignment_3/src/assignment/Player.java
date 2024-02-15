package assignment;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.paint.Color;

import javafx.scene.text.Font;

import javafx.scene.text.Text;

public class Player {
    private int x;
    private int y;
    private int winPercentage;
    private String title;
    private Head1 head;

    private Wheels leftWheels;
    private Wheels rightWheels;

    public Player(int x, int y , int size , int winPercentage, String title){
        this.x = x;

        this.y = y;

        this.winPercentage = winPercentage;

        this.title = title;
        this.head = new Head1(x, y - size/2 , size / 2);
        this.leftWheels = new Wheels(x - size/4 , y + size/4);
        this.rightWheels = new Wheels(x + size / 4, y + size / 4);
    }
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLACK);

        gc.fillRoundRect(x - 30, y - 50, 60, 80, 20, 20);

        gc.setFill(Color.WHITE);

        gc.fillRoundRect(x - 25, y - 45, 50, 60, 15, 15);

        gc.setFill(Color.BLACK);

        gc.fillText(title, x - 20, y - 30);

        gc.fillText("Win Percentage: " + winPercentage, x - 20, y - 10);

        head.draw(gc);

        leftWheels.drawn(gc);

        rightWheels.drawn(gc);



    }
}
