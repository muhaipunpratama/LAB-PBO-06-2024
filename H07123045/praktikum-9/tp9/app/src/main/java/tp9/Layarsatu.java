package tp9;

import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.layout.BackgroundFill;

public class Layarsatu{
    Stage stage;

    public Layarsatu(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label plossa = new Label("HELLO");
        plossa.setFont(Font.font( "Comic Sans MS", 15));
        plossa.setTextFill(Color.BLACK);

        Label plossa2 = new Label("Welcome to Wee Page");
        plossa2.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        plossa2.setTextFill(Color.BLACK);

        Button aneh = new Button("About Me");
        aneh.setPrefWidth(150);
        aneh.setBackground(new Background(new BackgroundFill(Color.PURPLE, new CornerRadii(10), null)));
        aneh.setTextFill(Color.WHITE);
        aneh.setOnAction(e -> {
            Layardua kedua = new Layardua(stage);
            kedua.show();
        });  

        VBox aipun = new VBox(plossa, plossa2, aneh);
        aipun.setBackground(new Background(new BackgroundFill(Color.PINK, CornerRadii.EMPTY, null)));
        aipun.setAlignment(Pos.CENTER);
        // aipun.setSpacing(3);
        
        Scene cipung = new Scene(aipun, 500, 500);
        stage.setScene(cipung);
        stage.show();
    }
}