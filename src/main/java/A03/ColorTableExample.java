package A03;

/**
 * 'Example" file that showcases how the ColorTable can work
 */
public class ColorTableExample {

    public static void main(String[] args) {
        try {

            /**
             * Create a ColorTable with a palette size of 4
             */
            ColorTable colorTable = new ColorTable(4);

            /**
             * Add some colors to the palette
             */
            int red = 0xFF0000;
            int green = 0x00FF00;
            int blue = 0x0000FF;
            int yellow = 0xFFFF00;

            colorTable.add(red);
            colorTable.add(green);
            colorTable.add(blue);

            /**
             * Try to add a duplicate color (this should throw an exception)
             */
            try {
                colorTable.add(red);
            } catch (DuplicateRGBValueException e) {
                System.out.println("Error: " + e.getMessage());
            }

            /**
             * Print the palette size
             */
            System.out.println("Palette Size: " + colorTable.getPaletteSize());

            /**
             *  Check if a random color is in the palette
             */
            System.out.println("Is yellow in the palette? " + colorTable.contains(yellow));
        }
        catch (InvalidPaletteSizeException | InvalidRGBValueException | ExceedingCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
