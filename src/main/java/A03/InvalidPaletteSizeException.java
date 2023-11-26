package A03;

/**
 * Creating an exception file that handles the scenario where
 * there is an invalid value given in the constructor for the
 * palette size.
 */
public class InvalidPaletteSizeException extends RuntimeException {

    public InvalidPaletteSizeException() {

        super("Invalid palette size");
    }

}
