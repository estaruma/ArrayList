import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListInsertTest {
    @Test
    public void testInsertAtFirstPosition() {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Purple");
        colours.add("Green");
        colours.add("Red");

        ArrayListInsert.insertAtFirstPosition(colours, "Blue");

        ArrayList<String> expectedColours = new ArrayList<>();
        expectedColours.add("Blue");
        expectedColours.add("Purple");
        expectedColours.add("Green");
        expectedColours.add("Red");

        assertEquals(expectedColours, colours);
    }
}

