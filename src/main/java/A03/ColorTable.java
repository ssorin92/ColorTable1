package A03;
import java.util.HashSet;
import java.util.Set;


/**
 * The ColorTable class represents a palette of RGB colors. It stores unique color values and
 * enforces constraints on the size and validity of the colors.
 */

public class ColorTable {

    /**
     * The size of the color palette, representing the maximum number of colors allowed.
     */
    private final int paletteSize;

    /**
     * Set to store unique RGB color values in the color palette.
     */
    private final Set<Integer> colorSet;

    /**
     * Constructs a ColorTable object with the specified palette size.
     *
     * @param paletteSize The number of colors in the palette. Must be a power of two,
     * greater than 1, and less than or equal to 1024.
     * @throws InvalidPaletteSizeException If an invalid palette size is provided.
     */
    public ColorTable(int paletteSize) {
        if (!isValidPaletteSize(paletteSize)) {
            throw new InvalidPaletteSizeException();
        }

        this.paletteSize = paletteSize;
        this.colorSet = new HashSet<>();
    }

    /**
     * Adds a 24-bit RGB color to the color palette.
     *
     * @param rgbValue The RGB color value to add.
     * @throws InvalidRGBValueException If an invalid RGB color value is provided.
     * @throws DuplicateRGBValueException If the RGB color is already present in the palette.
     * @throws ExceedingCapacityException If the color palette is already at its maximum capacity.
     */
    public void add(int rgbValue) {
        if (!isValidRgbValue(rgbValue)) {
            throw new InvalidRGBValueException();
        }
        if (colorSet.contains(rgbValue)){
            throw new DuplicateRGBValueException();
        }
        if (colorSet.size() >= paletteSize) {
            throw new ExceedingCapacityException();
        }
        colorSet.add(rgbValue);
    }

    /**
     * Retrieves the size of the color palette.
     *
     * @return The size of the color palette.
     */
    public int getPaletteSize() {
        return paletteSize;
    }

    /**
     * Validates if the provided size is a valid palette size.
     *
     * @param size The size to validate.
     * @return True if the size is a power of two, greater than 1, and less than or equal to 1024; otherwise, false.
     */
    private boolean isValidPaletteSize(int size) {
        return size > 1 && size <= 1024 && (size & (size - 1)) == 0;
    }

    /**
     * Checks if the color palette contains a specific RGB color value.
     *
     * @param rgbValue The RGB color value to check.
     * @return True if the color palette contains the specified RGB color; otherwise, false.
     */
    public boolean contains(int rgbValue) {

        return colorSet.contains(rgbValue);
    }


    /**
     * Validates if the provided RGB color value is within the valid range.
     *
     * @param rgbValue The RGB color value to validate.
     * @return True if the RGB value is a 24-bit value; otherwise, false.
     */
    private boolean isValidRgbValue(int rgbValue) {
        // Assuming a valid RGB value is a 24-bit value
        return (rgbValue >= 0 && rgbValue <= 0xFFFFFF);
    }
}
