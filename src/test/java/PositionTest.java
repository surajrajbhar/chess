import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PositionTest {

    @Test
    public void testIsValidPosition() {
        assertTrue(Position.isValid("A1"));
        assertTrue(Position.isValid("H8"));
        assertFalse(Position.isValid("I1"));
        assertFalse(Position.isValid("A9"));
        assertFalse(Position.isValid("A"));
        assertFalse(Position.isValid("A10"));
        assertFalse(Position.isValid("1A"));
    }

    @Test
    public void testParseAndToStringNormalizesCase() {
        assertEquals("A1", Position.parse("a1").toString());
        assertEquals("H8", Position.parse("H8").toString());
    }

    @Test
    public void testShift() {
        Position e4 = Position.parse("E4");
        assertEquals("E5", e4.shift(0, 1).toString());
        assertEquals("D4", e4.shift(-1, 0).toString());
    }

    @Test
    public void testShiftPastBoardEdgeIsNotValid() {
        Position h8 = Position.parse("H8");
        assertFalse(h8.shift(1, 0).isValid());
        assertFalse(h8.shift(0, 1).isValid());
    }

    @Test
    public void testEqualsIsCaseInsensitiveViaParse() {
        assertEquals(Position.parse("E4"), Position.parse("e4"));
    }
}
