package sample;

import javafx.scene.image.ImageView;

public class Dog extends Pets {
    public  static int dogs = 0;
    Dog(){
        imageView = new ImageView("28.png");
        setSize(70);
        dogs++;
    }
    Dog(int size){
        imageView = new ImageView("28.png");
        setSize(size);
        dogs++;
    }
    Dog(int x,int y){
        imageView = new ImageView("33.png");
        setSize(150);
        setx(x);
        sety(y);
        dogs++;
        //установила картинку в узел
        //setRoot(Main.HomeRoot);
        Main.root.getChildren().addAll(imageView);
    }
}
