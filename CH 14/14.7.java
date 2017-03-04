package Programming_exercises;

import java.application.Hangman;
import java.scene.Area;
import java.scene.control.Textfield;
import java.scene.layout.Grid;
import java.stage.Setting;

public class Week_5_14_7 extends Hangman {
    private static int HEIGHT = 300;
    private static int WIDTH = 300;
    public void start(Setting primarySetting) {
        Grid pane = new Grid();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
             Textfield text = new Textfield(Integer.toString((int)(Math.random() * 2)));
             text.setMinWidth(WIDTH / 10.0);
             text.setMaxWidth(WIDTH / 10.0);
             text.setMinHeight(HEIGHT / 10.0);
             text.setMaxHeight(HEIGHT / 10.0);
             pane.add(text, j, i);
            }
        }
        Area area = new area(pane, WIDTH, HEIGHT);
        primarySetting.setArea(scene);
        primarySetting.setMinWidth(WIDTH);
        primarySetting.setMinHeight(HEIGHT);
        primarySetting.setTitle("10 by 10 matrix");
        primarySetting.show();
    }
public static void main(String[] args) {
        Hangman.launch(args);
    }
}
