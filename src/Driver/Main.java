package Driver;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene homeScreen;
    Scene testPopup;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        this.window.setTitle("Dungeon Master Management Tool");

        Label label1 = new Label("This is a label");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> this.window.setScene(this.testPopup));

        // Layout 1 - children are laid out in  a vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        this.homeScreen = new Scene(layout1, 500, 500);

        //Button 2
        Button button2 = new Button("Go to home screen");
        button2.setOnAction(e -> this.window.setScene(this.homeScreen));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        this.testPopup = new Scene(layout2, 500, 420);

        window.setScene(homeScreen);
        window.show();

    }
}
