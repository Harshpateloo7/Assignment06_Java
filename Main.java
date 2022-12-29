package Assignment07_000852665;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;


/**
 * @author Harshadkumar Patel, 000852665
 */
/***
 * This is main class which contain Main method of the program which run the program. This class create a stage to display object
 * ,and this class create object of the village.
 */

public class Main extends Application {
    /**
     * Lunch app main method
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Start method use this instead of main.
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(750, 400); // Set canvas Size in Pixels
        stage.setTitle("Village"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Create an object of the Village Class
        Village village = Village.create();
        village.draw(gc);
        System.out.println("Village: " + village);
        System.out.print("Total Population: " + village.getPopulation());
        System.out.println();
        System.out.println("Please check the window!!!");
        stage.show();
    }
}
