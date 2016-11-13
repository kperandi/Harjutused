import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Kersti on 27.10.2016.
 */
public class Eestilipp extends Application{

    public void start (Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        Rectangle sininetriip = new Rectangle(100, 100, 330, 70);
        sininetriip.setFill(Color.DARKBLUE);
        sininetriip.setStroke(Color.BLACK);
        Rectangle musttriip = new Rectangle(100, 170, 330, 70);
        musttriip.setFill(Color.BLACK);
        musttriip.setStroke(Color.BLACK);
        Rectangle valgetriip = new Rectangle(100, 240, 330, 70);
        valgetriip.setFill(Color.WHITE);
        valgetriip.setStroke(Color.BLACK);
        primaryStage.show();

        pane.getChildren().addAll(sininetriip, musttriip, valgetriip);

    }
}
