package A03;
import java.util.HashSet;
import java.util.Set;

public class ColorTable {
    private final int paletteSize;
    private final Set<Integer> colorSet;


    public ColorTable(int paletteSize) {
        this.paletteSize = paletteSize;
        this.colorSet = new HashSet<>();
    }

    public int getPaletteSize() {
        return paletteSize;
    }
}
