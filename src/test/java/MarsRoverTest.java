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
        Character direction = 'S';
        assertEquals(x + " " + y + " " + direction, marsRover.outputFinalCoordinates(x, y, direction));
    }

    @Test
    public void testLeftDirectionNorth() {
        assertEquals('W', marsRover.left('N'));
    }

    @Test
    public void testLeftDirectionWest() {
        assertEquals('S', marsRover.left('W'));
    }

    @Test
    public void testLeftDirectionSouth() {
        assertEquals('E', marsRover.left('S'));
    }

    @Test
    public void testLeftDirectionEast() {
        assertEquals('N', marsRover.left('E'));
    }

    @Test
    public void testRightDirectionNorth() {
        assertEquals('E', marsRover.right('N'));
    }

    @Test
    public void testRightDirectionEast() {
        assertEquals('S', marsRover.right('E'));
    }

    @Test
    public void testRightDirectionSouth() {
        assertEquals('W', marsRover.right('S'));
    }

    @Test
    public void testRightDirectionWest() {
        assertEquals('N', marsRover.right('W'));
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
