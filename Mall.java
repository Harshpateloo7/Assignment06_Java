package Assignment07_000852665;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Scanner;
/**
 * @author Harshadkumar Patel, 000852665
 */

/**
 *  Mall class is extends Building class and implements Dwelling class. Moreover, This class contain some private variable,
 *  One private constructor and some methods. In addition, create method ask details of the Mall from the user and
 *  called private constructor of this class. The private constructor set the value and called the super constructor.
 *  Next, Draw method draw the Mall in the village and tostring method print the value of the Mall.
 * */
public class Mall extends Building implements Dwelling {
    private int store;
    private int occupants;

    /***
     * @param name name of the mall
     * @param xPosition position of the mall
     * @param store store of the mall
     * @param occupants occupants of the mall
     */
    private Mall(String name, double xPosition, int store, int occupants) {
        super(name, xPosition);
        this.store = store;
        this.occupants = occupants;
    }

    /**
     * This method is used to create the instance of the class
     * @return instance of the Mall
     */
    public static Mall create() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type..... Mall: store=");               // It will ask user to enter the number of store in Mall
        int store = scanner.nextInt();
        System.out.print("Type..... Mall: occupants=");          // It will ask user to enter the number of occupants in the mall
        int occupants = scanner.nextInt();
        System.out.print("Type..... Mall: name=");              // It will ask user to enter the Mall name in the Village
        String name = scanner.next();
        System.out.print("Type..... Mall: xPosition=");       // It will ask user to enter the position of the Mall in Village
        double xPosition = scanner.nextDouble();
        return new Mall(name, xPosition, store, occupants); // return the instance of the Mall
    }

    /**
     *
     * @return the number of occupants
     */
    @Override
    public int getNumberOfOccupants() {
        return occupants;
    }

    /**
     *
     * @param gc is used to draw the object on the frame
     */
    @Override
    public void draw(GraphicsContext gc) {
        int windowHeight = 400;
        gc.setFill(Color.rgb(255, 255, 255));
        gc.fillText(getName(), getXPosition() + 5, windowHeight - 20);
        gc.setFill(Color.rgb(255, 0, 0));
        gc.fillRect(getXPosition() + 5, windowHeight - 75, 100, 40);
        gc.setFill(Color.rgb(255, 255, 255));
        gc.fillRect(getXPosition() + 50, windowHeight - 55, 10, 15);
        gc.fillRect(getXPosition() + 30, windowHeight - 55, 10, 10);
        gc.fillRect(getXPosition() + 70, windowHeight - 55, 10, 10);
    }

    /**
     *
     * @return the full details of the object
     */
    @Override
    public String toString() {
        super.toString();
        return "Mall{" +
                "name=" + getName() +
                ", store=" + store +
                ", occupants=" + occupants +
                '}';
    }
}
