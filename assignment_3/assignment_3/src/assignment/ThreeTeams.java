package assignment;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class ThreeTeams {
    public static void main(String[] args) {
        Color refereeColor = Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

        Player referee = new Player(0,0,50,100, "Referee", refereeColor);

        Teams team1 = new Teams("Team 1", 100, 300, refereeColor);
        Teams team2 = new Teams("Team 2", 400, 300, refereeColor);
        Teams team3 = new Teams("Team 3", 700, 300, refereeColor);

        referee.draw(gc);
        team1.draw(gc);
        team2.draw(gc);
        team3.draw(gc);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Three Teams");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    }
}
