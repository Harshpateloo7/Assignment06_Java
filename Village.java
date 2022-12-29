package Assignment07_000852665;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Harshadkumar Patel, 000852665
 */
/**
 * This is the Village class extends Building class. Moreover, This class contain some private variable,
 *  One private constructor and some methods. In addition, create method ask details of the Village from the user and
 *  called private constructor of this class. The private constructor set the value and called the super constructor and ask choose of the HighRise from the user
 *  Next, Draw method draw the Village and draw ApartmentBuilding, Mall, and House by creating their object.
 *  tostring method print the objects of the Village.
 *
 * */
public class Village extends Building {
    public final int Y_FLOOR;
    private String name;
    private int size;
    ArrayList<Object> drawList = new ArrayList<Object>();

    /**
     * @param name      It will take name as input
     * @param size      It will take size as input
     * @param Y_FLOOR   It will take floor as input
     * @param xPosition It will take position as input
     */
    private Village(String name, int size, int Y_FLOOR, double xPosition) {
        super(name, xPosition);
        this.name = name;
        this.size = size;
        this.Y_FLOOR = Y_FLOOR;
        Scanner scanner = new Scanner(System.in);
        // take the input from the user
        do {
            System.out.println();
            System.out.println("1. ApartmentBuilding");             // Option one ApartmentBuilding*/
            System.out.println("2. House");                         // Option two House
            System.out.println("3. Mall");                          // Option three Mall
            System.out.print("Choose the value=");                  // choose option from 1,2, and 3
            int input = scanner.nextInt();
            if (input == 1) {
                drawList.add(ApartmentBuilding.create());           // create an instance of the apartment building and store in the array
            } else if (input == 2) {
                drawList.add(House.create());                       // create an instance of the house and store in the array
            } else if (input == 3) {
                drawList.add(Mall.create());                        // create an instance of the mall and store in the array
            }
        } while (drawList.size() < size);
    }

    /**
     * This method is used to create the instance of the class
     *
     * @return the instance of the Village
     */
    public static Village create() {
        Scanner scanner = new Scanner(System.in);                                   // create scanner of the object
        System.out.println();
        System.out.print("Enter the name of the village=");                         // It will ask user to enter the name of the Village
        String name = scanner.next();
        System.out.print("Enter the number of object in the village=");             // It will ask user to enter number of object in Village
        int size = scanner.nextInt();
        System.out.print("Enter the ground floor position of the building=");       // It will ask user to enter the ground floor position of the building
        int Y_FLOOR = scanner.nextInt();
        System.out.print("Enter the xPosition of the village=");                    // It will ask user to enter the xPosition of the Village name
        double xPosition = scanner.nextDouble();
        return new Village(name, size, Y_FLOOR, xPosition);                         // return the instance of the Village
    }
    /**
     * @return size of the population of the Village
     */
    public int getPopulation() {
        return size;
    }

    /**
     * @return the full details of the object
     */
    @Override
    public String toString() {
        super.toString();
        return "Village{" +
                "size=" + getPopulation() +
                ", name='" + name + '\'' +
                ", Y_FLOOR=" + Y_FLOOR +
                '}';
    }

    /**
     * @param gc is used to draw the object on the frame
     */
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.rgb(55, 155, 255));
        gc.fillRect(0, 0, 750, 400);
        gc.setFill(Color.rgb(255, 255, 255));
        gc.fillText(getName(), getXPosition(), 20);
        // Draw apartment building and house
        System.out.println();
        for (int i = 0; i < drawList.size(); i++) {
            System.out.println();
            if (drawList.get(i) instanceof ApartmentBuilding) {
                ApartmentBuilding apartmentBuilding = (ApartmentBuilding) drawList.get(i);
                apartmentBuilding.draw(gc);
                System.out.println((i + 1) + "ApartmentBuilding: " + apartmentBuilding);
            } else if (drawList.get(i) instanceof House) {
                House house = (House) drawList.get(i);
                house.draw(gc);
                System.out.println((i + 1) + "House: " + house);
            } else if (drawList.get(i) instanceof Mall) {
                Mall mall = (Mall) drawList.get(i);
                mall.draw(gc);
                System.out.println((i + 1) + "Mall: " + mall);
            }
        }
    }
}
