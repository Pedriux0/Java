package assigment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
// Scanner import
import java.util.Scanner;

public class FXGraphicsTemplate extends Application {

    private static final int BLOCK_SIZE = 50;

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(700, 500);
        stage.setTitle("Game");
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Scanner sc = new Scanner(System.in);
        //User inputs ( with limits)
        System.out.println("Enter the number of rows for bricks in a range of 1 to 10 :");
        int rows = getUserInput(sc, 1, 10);

        System.out.println("Enter the number of columns for bricks in a range of 1 to 10:");
        int columns = getUserInput(sc, 1, 10);

        System.out.println("Current score :");
        int currentScore = getUserInput(sc, 0, Integer.MAX_VALUE);

        System.out.println("High score:");
        int highScore = getUserInput(sc, 0, Integer.MAX_VALUE);

        System.out.println("In what are the actual game:");
        int level = getUserInput(sc, 1, Integer.MAX_VALUE);

        System.out.println("Enter the ball position (max 400 ):");
        double ballPosition = getDoubleInput(sc, 0, 400);

        System.out.println("Enter the paddle x position (max 400 ) :");
        double paddleXPosition = getDoubleInput(sc, 0, 400);
        // Update of the scores , if necessary
        if (currentScore > highScore) {
            highScore = currentScore;
            System.out.println("High score updated to: " + highScore);
        }

        gc.strokeLine(400, 50, 400, 350);
        // Methods
        drawBlockGrid(gc, rows, columns, BLOCK_SIZE);
        drawBall(gc, ballPosition, BLOCK_SIZE * (rows + 2));
        drawPaddle(gc, paddleXPosition, BLOCK_SIZE * (rows + 2)); // (rows + 2) to put below the blocks
        drawDisplay(gc, currentScore, highScore, level);

        stage.show();
    }
    // Draw of the grid (Function or Methods)
    private void drawBlockGrid(GraphicsContext gc, int rows, int cols, int block_size) {
        for (int row = 0; row < rows; row++) { //  iterates over each row in the grid
            for (int col = 0; col < cols; col++) { // iterates over each column in the current row.
                double x = col * block_size; // x coordinate ( top left corner)
                double y = row * block_size; // y coordinate ( top left corner)
                drawBlock(gc, x, y, block_size); // draw the block
            }
        }
    }
    // Draw of the block (Function)
    private void drawBlock(GraphicsContext gc, double x, double y, double blockSize) {
        gc.setFill(Color.ORANGE);
        gc.fillRect(x, y, blockSize, blockSize);

        // Line width
        gc.setLineWidth(3.0); // Adjust the line width

        gc.setStroke(Color.WHITE);
        gc.strokeRect(x, y, blockSize, blockSize);

        // line width default
        gc.setLineWidth(1.0);
    }
    // Function of the ball
    private void drawBall(GraphicsContext gc, double x, double y) {
        // Draw a ball
        double ballRadius = 20; // Adjust the radius
        gc.setFill(Color.RED);
        gc.fillOval(x - ballRadius, y - ballRadius, 2 * ballRadius, 2 * ballRadius); // Circle
    }

    private void drawPaddle(GraphicsContext gc, double x, double y) {
        // Draw a paddle
        double paddleWidth = 80; // Adjust the width
        double paddleHeight = 15; // Adjust the height
        gc.setFill(Color.BLUE);
        gc.fillRect(x - paddleWidth / 2, y + 40, paddleWidth, paddleHeight); // y-coordinate
    }

    // Display sections with the scores
    private void drawDisplay(GraphicsContext gc, int currentScore, int highScore, int level) {
        double textX = 450;
        // Positions and color
        gc.setFill(Color.BLACK);
        gc.fillText("Current Score: " + currentScore, textX, 50);
        gc.fillText("High Score: " + highScore, textX, 70);
        gc.fillText("Level: " + level, textX, 90);
    }
    // Wrong Assumptions
    private int getUserInput(Scanner sc, int min, int max) {
        int userInput;
        do { // DO - loop
            while (!sc.hasNextInt()) {
                System.out.println("It's not gonna work, do it again.");
                sc.next(); // Eat the loop and start
            }
            userInput = sc.nextInt(); // Is an integer  ?
        } while (userInput < min || userInput > max); // Is in range ?
        return userInput; // Check if it's correct
    }

    // The same as the above one , but in double
    private double getDoubleInput(Scanner sc, double min, double max) {
        double userInput;
        do {
            while (!sc.hasNextDouble()) {
                System.out.println("It's not gonna work, do it again .");
                sc.next();
            }
            userInput = sc.nextDouble();
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
