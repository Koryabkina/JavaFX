package sample;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class Pets extends Pane implements IBehavior {
    ImageView imageView;

    public void move(int x, int y){

    }
    public double getx(){
        return imageView.getX();
    }

    public double gety(){return imageView.getY();}
    public void setx(int x){ imageView.setX(x);}
    public void sety(int y){imageView.setY(y);}
    public void setSize(int value){
        imageView.setFitWidth(value);
        imageView.setFitHeight(value);
    }
    //ф-я прикрепления картинки к узлу и вызывается в конструкторе или, где хочу
    public void setRoot(Pane root){root.getChildren().addAll(imageView);}
}
