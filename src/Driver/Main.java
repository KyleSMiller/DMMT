package Driver;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage homeScreen) throws Exception {
        homeScreen.setTitle("Dungeon Master Management Tool");

        Button testButton = new Button("Test Button");

        StackPane testLayout = new StackPane();
        testLayout.getChildren().add(testButton);

        Scene testScene = new Scene(testLayout, 500, 500);
        homeScreen.setScene(testScene);
        homeScreen.show();

    }
}
