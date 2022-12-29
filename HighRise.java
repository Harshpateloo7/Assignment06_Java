package Assignment07_000852665;
/**
 * @author Harshadkumar Patel, 000852665
 */
/**
 * HighRise class is an abstract class
 */
public abstract class HighRise extends Building {
    private final int numberOfFloors;
    /**
     * @param numberOfFloors number of floors in the building
     * @param name name of the building
     * @param xPosition position of the building
     */
    public HighRise(int numberOfFloors, String name, double xPosition) {
        super(name, xPosition);
        this.numberOfFloors = numberOfFloors;
    }

    /**
     *
     * @return the number of floors of the building
     */
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     *
     * @return the full details of the object
     */
    @Override
    public String toString() {
        super.toString();
        return "HighRise{" +
                "numberOfFloors=" + numberOfFloors +
                '}';
    }
}
