package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static Pane HomeRoot = new Pane();
    public static Pane root = new Pane();
    Habitat habit = new Habitat();
    long prevTime = 0;
    long beginTime;
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Pane root = new Pane();
        //основной прикрепляется к сцене, а к основному всё остальное
        root.getChildren().addAll(HomeRoot);
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1200, 800));

        beginTime = System.currentTimeMillis();
        //игровой цикл
        // TODO: 22.02.2019   про лямбды-хуямбды
        AnimationTimer timer = new AnimationTimer() {
            @Override//переопределение функции
            public void handle(long now) {

                long currentTime =System.currentTimeMillis()-beginTime;
                long stepTime = currentTime - prevTime;

                if (stepTime>=1000) {
                    int t=(int)(currentTime/1000);
                    habit.update(t);
                    //root.getChildren().addAll(HomeRoot);
                    prevTime=currentTime;
                }
            }
        };
        timer.start();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}