package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Cat extends Pets {
    public  static int cats = 0;
    Cat(){
        imageView = new ImageView(new Image("32.png"));
        setSize(70);
        cats++;
    }
    Cat(int size){
        imageView = new ImageView(new Image("32.png"));
        setSize(size);
        cats++;
    }
    Cat(int x,int y){
        //javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource("32.png").toExternalForm());
        //imageView = new ImageView(image);
        imageView = new ImageView(new Image("12.png"));
        setSize(150);
        setx(x);
        sety(y);
        cats++;
        //setRoot(Main.HomeRoot);
        Main.root.getChildren().addAll(imageView);
    }
}
