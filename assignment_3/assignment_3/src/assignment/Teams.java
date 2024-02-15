package assignment;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Teams {

    private Player[] players;
    private String name;

    public Teams(String name, int x, int y , Color color){
        this.name = name;
        players = new Player[3];
        for(int i = 0; i < players.length; i++){
            players[i] = new Player(x + (i * 100), y, 50, 50, color, refereeColor);
        }
    }
    public void draw(GraphicsContext gc){
        for(Player player : players ){
            player.draw(gc);
        }
    }
}
