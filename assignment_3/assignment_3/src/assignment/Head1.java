package assignment;

import javafx.scene.Group;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


    public class Head1 extends Group {


        private int x;
        private int y;
        private int size;

        public Head1(int x, int y, int size ){
            this.x = x;
            this.y = y;
            this.size = size;
        }


        public Head1(int x , int y){
            this(x,y,50);
        }

        public Head1(){
            this(0,0,50);
        }

        public void draw(GraphicsContext gc){
            gc.setFill(Color.GREEN);
            gc.setStroke(Color.BEIGE);
            gc.fillRoundRect(x, y, size, size, size / 4, size / 4);

            gc.strokeRoundRect(x, y, size, size, size / 4, size / 4);

        }
    }
