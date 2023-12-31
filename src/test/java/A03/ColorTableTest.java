package A03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing different functionalities and requirements of the ColorTable project
 */
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

    /**
     * The following test checks if adding an invalid color to the palette triggers
     * the proper reaction (ie proper throw exception)
     */
    @Test
    public void testAddInvalidColorThrowsException() {
        ColorTable colorTable = new ColorTable(4);
        int invalidRgbValue = 0xFFFFFF0; // Invalid RGB value

        assertThrows(InvalidRGBValueException.class, () -> colorTable.add(invalidRgbValue));
    }

    /**
     * Test checks whether adding a duplicate color
     * (ie it already exists in there), throws an exception in the program
     */
    @Test
    public void testAddDuplicateColorThrowsException() {
        ColorTable colorTable = new ColorTable(4);
        int rgbValue = 0xFF0000; // Red color

        colorTable.add(rgbValue);

        assertThrows(DuplicateRGBValueException.class, () -> colorTable.add(rgbValue));
    }

    /**
     * Checks if an exception is thrown when someone tries to add a new color to the palette,
     * but the palette is already full on size.
     */
    @Test
    public void testExceedCapacityThrowsException() {
        ColorTable colorTable = new ColorTable(2);
        int red = 0xFF0000;
        int green = 0x00FF00;

        colorTable.add(red);
        colorTable.add(green);

        assertThrows(ExceedingCapacityException.class, () -> colorTable.add(0x0000FF));
    }
}
