import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Gui/Guisample.fxml"));
        primaryStage.setTitle("Movie Recommender");
        primaryStage.setScene(new Scene(root, 850, 650));
        primaryStage.show();
    }
}