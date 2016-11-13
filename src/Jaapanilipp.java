import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Kersti on 27.10.2016.
 */
public class Jaapanilipp extends Application{

    public void start (Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        Rectangle kast = new Rectangle(300, 200);
        kast.setFill(Color.WHITE);
        kast.setStroke(Color.BLACK);
        Circle punanering = new Circle(60);
        punanering.setFill(Color.RED);

        primaryStage.show();

        stack.getChildren().addAll(kast, punanering);

    }
}
