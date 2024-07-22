import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    public void ColourListTest() {
        ColourList colourList = new ColourList();

        // Get the list of colors
        ArrayList<String> colors = colourList.createColourList();

        //size of the list
        assertEquals(3, colors.size());

        assertTrue(colors.contains("Purple"), "Purple");
        assertTrue(colors.contains("Green"), "Green");
        assertTrue(colors.contains("Red"), "Red");
    }
}
