import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;

public class App extends Application
{

    @Override public void start(Stage primaryStage)
    {

        Pane pane = new Pane();  

        // Ein Bild anzeigen
        Image image = new Image("/turtle.png");
        ImageView imageView = new ImageView(image);

        pane.getChildren().add(imageView);
        imageView.setX(100);
        imageView.setY(100);

        // Auf Events reagieren!
        imageView.setOnMouseClicked(e -> imageView.setX(10 + imageView.getX()));
       

        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Beispiel");
        primaryStage.show();

    }

}
