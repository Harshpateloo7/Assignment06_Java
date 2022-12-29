package Assignment07_000852665;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Scanner;
/**
 * @author Harshadkumar Patel, 000852665
 */
/**
 *  House class is extends Building class and implements Dwelling class. Moreover, This class contain some private variable,
 *  One private constructor and some methods. In addition, create method ask details of the House from the user and
 *  called private constructor of this class. The private constructor set the value and called the super constructor.
 *  Next, Draw method draw the House in the village and tostring method print the value of the House.
 *
 * */
public class House extends Building implements Dwelling {
    private int bedrooms;
    private int occupants;
    /***
     * @param name name of the house
     * @param xPosition position of the house
     * @param bedrooms bedrooms of the house
     * @param occupants occupants of the house
     */
    private House(String name, double xPosition, int bedrooms, int occupants) {
        super(name, xPosition);
        this.bedrooms = bedrooms;
        this.occupants = occupants;
    }
    /**
     * This method is used to create the instance of the class
     * @return instance of the House
     */
    public static House create() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type... House: bedrooms=");               // It will ask user to enter the number of bedroom in the house
        int bedrooms = scanner.nextInt();
        System.out.print("Type... House:occupants=");              // It will ask user to enter the occupants number in the house
        int occupants = scanner.nextInt();
        System.out.print("Type... House: name=");                  // It will ask user to enter the name of the house
        String name = scanner.next();
        System.out.print("Type... House: xPosition=");             // It will ask user to enter the xPostion of the house
        double xPosition = scanner.nextDouble();
        return new House(name, xPosition, bedrooms, occupants);    // return the instance of the House
    }

    /**
     *
     * @return the number of occupants in the house
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
        gc.fillRect(getXPosition() + 5, windowHeight - 75, 40, 40);
        gc.setFill(Color.rgb(255, 255, 255));
        gc.fillRect(getXPosition() + 10, windowHeight - 70, 10, 10);
        gc.fillRect(getXPosition() + 30, windowHeight - 55, 10, 15);
    }

    /**
     *
     * @return the full details of the object
     */
    @Override
    public String toString() {
        super.toString();
        return "House{" +
                "name=" + getName() +
                ", bedrooms=" + bedrooms +
                ", occupants=" + occupants +
                '}';
    }
}
