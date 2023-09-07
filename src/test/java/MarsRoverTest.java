import org.example.MarsRover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    private MarsRover marsRover;

    @BeforeEach
    public void setup() {
        marsRover = new MarsRover();
    }

    @Test
    public void testOutputFinalCoordinates() {
        int x = 12, y = 12;
        String direction = "South";
        assertEquals(x + " " + y + " " + direction.charAt(0), marsRover.outputFinalCoordinates(x, y, direction));
    }

    @Test
    public void testLeftDirectionNorth() {
        assertEquals("West", marsRover.left("North"));
    }

    @Test
    public void testLeftDirectionWest() {
        assertEquals("South", marsRover.left("West"));
    }

    @Test
    public void testLeftDirectionSouth() {
        assertEquals("East", marsRover.left("South"));
    }

    @Test
    public void testLeftDirectionEast() {
        assertEquals("North", marsRover.left("East"));
    }

    @Test
    public void testRightDirectionNorth() {
        assertEquals("East", marsRover.right("North"));
    }

    @Test
    public void testRightDirectionEast() {
        assertEquals("South", marsRover.right("East"));
    }

    @Test
    public void testRightDirectionSouth() {
        assertEquals("West", marsRover.right("South"));
    }

    @Test
    public void testRightDirectionWest() {
        assertEquals("North", marsRover.right("West"));
    }

    @Test
    public void testValidateInitialPosition() {
        assertTrue(marsRover.validateInitialPosition(4, 4));
    }

    @Test
    public void testValidateInitialPositionNotMatchingExistingVehicle() {
        assertFalse(marsRover.validateInitialPosition(4, 5));
    }

    @Test
    public void testParseVehicleMovements() {
        String vehicleMovements = "LLMMRR";
        assertTrue(marsRover.parseVehicleMovements(vehicleMovements));
    }

    @Test
    public void testParseVehicleMovementsRogueCharacter() {
        String vehicleMovements = "LLMMRRT";
        assertFalse(marsRover.parseVehicleMovements(vehicleMovements));
    }


//    public void testConvertDecimalToRoman() {
 //       System.out.printf("Input: %d, Expected: %s\n", 1999, "MCMXCIX");
//
 //       assertEquals("MCMXCIX", romanNumerals.convertDecimalToRoman(1999));
    //public void testHelloWorld() {
        //assertEquals("Hello World", marsRover.HelloWorld());
    //}
}
