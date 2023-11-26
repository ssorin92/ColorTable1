package A03;

/**
 * Exception handling for when the EGB value about to be introduced is
 * already in the palette, and we dont want a duplicate of it.
 */
public class DuplicateRGBValueException extends RuntimeException {
    public DuplicateRGBValueException() {

        super("Duplicate RGB value");
    }

}
