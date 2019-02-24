package  sample;

import javafx.scene.layout.Pane;

public interface IBehavior {
    public void move(int x, int y);
    public double getx();
    public double gety();
    public void setx(int x);
    public void sety(int y);
    public void setRoot(Pane root);
}
