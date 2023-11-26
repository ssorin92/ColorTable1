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
}
