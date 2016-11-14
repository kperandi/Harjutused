import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Kersti on 30.10.2016.
 */
public class Kalkulaatorgraafiline extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane kast = new Pane();
        Scene kalk = new Scene(kast, 260, 320);
        primaryStage.setScene(kalk);
        primaryStage.setTitle("Kalkulaator");
        primaryStage.show();

        TextField tulemus = new TextField();
        tulemus.setTranslateX(20);
        tulemus.setTranslateY(20);
        tulemus.setPrefSize(220, 40);

        Button seitse = new Button(("7"));
        seitse.setTranslateX(20);
        seitse.setTranslateY(80);
        seitse.setPrefSize(40, 40);

        Button kaheksa = new Button(("8"));
        kaheksa.setTranslateX(80);
        kaheksa.setTranslateY(80);
        kaheksa.setPrefSize(40, 40);

        Button uheksa = new Button(("9"));
        uheksa.setTranslateX(140);
        uheksa.setTranslateY(80);
        uheksa.setPrefSize(40, 40);

        Button neli = new Button(("4"));
        neli.setTranslateX(20);
        neli.setTranslateY(140);
        neli.setPrefSize(40, 40);

        Button viis = new Button(("5"));
        viis.setTranslateX(80);
        viis.setTranslateY(140);
        viis.setPrefSize(40, 40);

        Button kuus = new Button(("6"));
        kuus.setTranslateX(140);
        kuus.setTranslateY(140);
        kuus.setPrefSize(40, 40);

        Button uks = new Button(("1"));
        uks.setTranslateX(20);
        uks.setTranslateY(200);
        uks.setPrefSize(40, 40);

        Button kaks = new Button(("2"));
        kaks.setTranslateX(80);
        kaks.setTranslateY(200);
        kaks.setPrefSize(40, 40);

        Button kolm = new Button(("3"));
        kolm.setTranslateX(140);
        kolm.setTranslateY(200);
        kolm.setPrefSize(40, 40);

        Button nulll = new Button("0");
        nulll.setTranslateX(20);
        nulll.setTranslateY(260);
        nulll.setPrefSize(40, 40);

        Button koma = new Button(",");
        koma.setTranslateX(80);
        koma.setTranslateY(260);
        koma.setPrefSize(40, 40);

        Button vordub = new Button("=");
        vordub.setTranslateX(140);
        vordub.setTranslateY(260);
        vordub.setPrefSize(40, 40);

        Button jagada = new Button("/");
        jagada.setTranslateX(200);
        jagada.setTranslateY(80);
        jagada.setPrefSize(40, 40);

        Button korrutada = new Button("*");
        korrutada.setTranslateX(200);
        korrutada.setTranslateY(140);
        korrutada.setPrefSize(40, 40);

        Button miinus = new Button("-");
        miinus.setTranslateX(200);
        miinus.setTranslateY(200);
        miinus.setPrefSize(40, 40);

        Button pluss = new Button("+");
        pluss.setTranslateX(200);
        pluss.setTranslateY(260);
        pluss.setPrefSize(40, 40);



        kast.getChildren().addAll(tulemus,uks, kaks, kolm, neli, viis, kuus, seitse, kaheksa, uheksa, nulll, koma, vordub, jagada, korrutada, miinus, pluss);

    }
}
