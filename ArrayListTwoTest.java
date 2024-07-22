import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListTwoTest {
    @Test
    public void testGetColoursList() {
        ArrayList<String> expectedColours = new ArrayList<>();
        expectedColours.add("Purple");
        expectedColours.add("Green");
        expectedColours.add("Red");

        ArrayList<String> actualColours = ArrayListTwo.getColoursList();

        assertEquals(expectedColours, actualColours);
    }
}
