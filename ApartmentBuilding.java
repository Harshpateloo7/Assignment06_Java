package Assignment07_000852665;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Scanner;
/**
 * @author Harshadkumar Patel, 000852665
 */

/**
 * ApartmentBuilding class is extends HighRise class and implements Dwelling class. Moreover, This class contain some private variable,
 * One private constructor and some methods. In addition, create method ask details of the apartmentBuilding from the user and
 * called private constructor of this class. The private constructor set the value and called the super constructor.
 * Next, Draw method draw the apartmentBuilding in the village and tostring method print the value of the apartmentBuilding.
 * */
public class ApartmentBuilding extends HighRise implements Dwelling {
    private final int occupantsPerFloor;
    /**
     * @param occupantsPerFloor occupants per floor of the building
     * @param numberOfFloors number of floor in a building
     * @param name name of the building
     * @param xPosition set the position of the building
     */
    private ApartmentBuilding(int occupantsPerFloor, int numberOfFloors, String name, double xPosition) {
        super(numberOfFloors, name, xPosition);
        this.occupantsPerFloor = occupantsPerFloor;
    }

    /**
     * This method is used to create the instance of the class
     * @return the instance of the ApartmentBuilding
     */
    public static ApartmentBuilding create() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type...  ApartmentBuilding: occupantsPerFloor=");                     // It will ask user to enter the occupants per floor in the ApartmentBuilding
        int occupantsPerFloor = scanner.nextInt();
        System.out.print("Type... ApartmentBuilding: numberOfFloors=");                         // It will ask user to enter the number of floor in the ApartmentBuilding
        int numberOfFloors = scanner.nextInt();
        System.out.print("Type... ApartmentBuilding: name=");                                   // It will ask user to enter the name of the Building
        String name = scanner.next();
        System.out.print("Type... ApartmentBuilding: xPosition=");                              // It will ask user to enter the xPosition of the Building
        double xPosition = scanner.nextInt();
        return new ApartmentBuilding(occupantsPerFloor, numberOfFloors, name, xPosition);       // return the instance of the ApartmentBuilding
    }

    /**
     *
     * @return number of occupants in the ApartmentBuilding
     */
    @Override
    public int getNumberOfOccupants() {
        return getNumberOfFloors() * getNumberOfOccupants();
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
        gc.fillRect(getXPosition() + 5, windowHeight - 35 - (10 * getNumberOfFloors() * 2), 50, 10 * getNumberOfFloors() * 2);
        gc.setFill(Color.rgb(255, 255, 255));
        int tempHeight = windowHeight;
        for (int i = 0; i < getNumberOfFloors(); i++) {
            gc.fillRect(getXPosition() + 10, tempHeight - 50, 10, 10);
            gc.fillRect(getXPosition() + 25, tempHeight - 50, 10, 10);
            gc.fillRect(getXPosition() + 40, tempHeight - 50, 10, 10);
            tempHeight = tempHeight - 20;
        }
    }

    /**
     *
     * @return the full details of the object
     */
    @Override
    public String toString() {
        super.toString();
        return "ApartmentBuilding{" +
                "name=" + getName() +
                ", numberOfFloors=" + getNumberOfFloors() +
                ", occupantsPerFloor=" + occupantsPerFloor +
                '}';
    }
}
