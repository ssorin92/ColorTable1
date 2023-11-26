package A03;
import org.junit.jupiter.api.Test;
import java.awt.*;

public class ColorTableTest {
    /**
     * First test is the one checking if the constructor functions properly with a
     * valid value for the palette size (ie 4 in this case)
     * We create a new instance of a colortable, and test.
     */
    @Test
    public void testConstructorWithValidPaletteSize(){
        int paletteSize=4;

        ColorTable colorTable= new ColorTable(paletteSize);
        assertEquals(paletteSize,colorTable.getPaletteSize());
    }
}
