package A03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    /**
     * Next test is checking if an exception is thrown properly whenever
     * the constructor gets an invalid value for the palette size
     */
    @Test
    public void testConstructorWithInvalidPaletteSizeThrowsException() {
        int invalidPaletteSize = 3;

        assertThrows(InvalidPaletteSizeException.class, () -> new ColorTable(invalidPaletteSize));
    }


    /**
     * This test checks if the program adds a valid color to the palette properly
     */
    @Test
    public void testAddValidColor() {
        ColorTable colorTable = new ColorTable(4);
        int rgbValue = 0xFF0000; // Red color

        colorTable.add(rgbValue);

        assertTrue(colorTable.contains(rgbValue));
    }
}
