package A03;


/**
 * Exception handling for when an INVALID value is input for the color in the palette
 */
public class InvalidRGBValueException extends RuntimeException {
    public InvalidRGBValueException() {

        super("Invalid RGB Value");
    }
}
