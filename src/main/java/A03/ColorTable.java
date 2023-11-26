package A03;
import java.util.HashSet;
import java.util.Set;

public class ColorTable {
    private final int paletteSize;
    private final Set<Integer> colorSet;


    public ColorTable(int paletteSize) {
        if (!isValidPaletteSize(paletteSize)) {
            throw new InvalidPaletteSizeException();
        }

        this.paletteSize = paletteSize;
        this.colorSet = new HashSet<>();
    }


    public void add(int rgbValue) {
        if (!isValidRgbValue(rgbValue)) {
            throw new InvalidRGBValueException();
        }
        if (colorSet.contains(rgbValue)){
            throw new DuplicateRGBValueException();
        }
        colorSet.add(rgbValue);
    }


    public int getPaletteSize() {
        return paletteSize;
    }
    private boolean isValidPaletteSize(int size) {
        return size > 1 && size <= 1024 && (size & (size - 1)) == 0;
    }

    public boolean contains(int rgbValue) {

        return colorSet.contains(rgbValue);
    }

    private boolean isValidRgbValue(int rgbValue) {
        // Assuming a valid RGB value is a 24-bit value
        return (rgbValue >= 0 && rgbValue <= 0xFFFFFF);
    }
}
