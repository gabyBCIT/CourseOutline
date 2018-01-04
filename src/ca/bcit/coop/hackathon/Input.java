package ca.bcit.coop.hackathon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * @author Sam
 *
 */
public class Input extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        final int appWidth = 700;
        final int appHeight = 500;
        Scene scene = new Scene(new ScheduleInput(), appWidth, appHeight);

        primaryStage.setTitle("Your Term Outline");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
