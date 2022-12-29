package Assignment07_000852665;
/**
 * @author Harshadkumar Patel, 000852665
 */
/**
 * Building class is an abstract class
 * */
public abstract class Building implements Drawable {
    private String name;
    private double xPosition;

    /**
     * @param name name of the building
     * @param xPosition position of the building
     */
    public Building(String name, double xPosition) {
        this.name = name;
        this.xPosition = xPosition;
    }
    /**
     *
     * @return the position of the building
     */
    @Override
    public double getXPosition() {
        return xPosition;
    }
    /**
     *
     * @return the name of the building
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return the full details of the object
     */
    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", xPosition=" + xPosition +
                '}';
    }
}
