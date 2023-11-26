package A03;


/**
 * Exception handling for when there is an attempt to add
 * a new color to the palette, but the size cap is hit
 */
public class ExceedingCapacityException extends RuntimeException {
    public ExceedingCapacityException() {

        super("Capacity Exceeded");
    }

}