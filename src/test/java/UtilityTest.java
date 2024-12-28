import org.junit.Test;
import static org.junit.Assert.*;

public class UtilityTest {

    @Test
    public void testIsUpperBoundary() {
        assertTrue(Utility.isUpperBoundary("A8"));
        assertTrue(Utility.isUpperBoundary("H8"));
        assertFalse(Utility.isUpperBoundary("A7"));
        assertFalse(Utility.isUpperBoundary("H7"));
    }

    @Test
    public void testIsLowerBoundary() {
        assertTrue(Utility.isLowerBoundary("A1"));
        assertTrue(Utility.isLowerBoundary("H1"));
        assertFalse(Utility.isLowerBoundary("A2"));
        assertFalse(Utility.isLowerBoundary("H2"));
    }

    @Test
    public void testIsLeftBoundary() {
        assertTrue(Utility.isLeftBoundary("A1"));
        assertTrue(Utility.isLeftBoundary("A8"));
        assertFalse(Utility.isLeftBoundary("B1"));
        assertFalse(Utility.isLeftBoundary("B8"));
    }

    @Test
    public void testIsRightBoundary() {
        assertTrue(Utility.isRightBoundary("H1"));
        assertTrue(Utility.isRightBoundary("H8"));
        assertFalse(Utility.isRightBoundary("G1"));
        assertFalse(Utility.isRightBoundary("G8"));
    }

    @Test
    public void testIsDiagonalBoundary() {
        assertTrue(Utility.isDiagonalBoundary("A1"));
        assertTrue(Utility.isDiagonalBoundary("H8"));
        assertFalse(Utility.isDiagonalBoundary("D4"));
        assertFalse(Utility.isDiagonalBoundary("E5"));
    }

    @Test
    public void testIsValidPosition() {
        assertTrue(Utility.isValidPosition("A1"));
        assertTrue(Utility.isValidPosition("H8"));
        assertFalse(Utility.isValidPosition("I1"));
        assertFalse(Utility.isValidPosition("A9"));
        assertFalse(Utility.isValidPosition("A"));
        assertFalse(Utility.isValidPosition("A10"));
        assertFalse(Utility.isValidPosition("1A"));
    }

    @Test
    public void testIsValidInput() {
        assertTrue(Utility.isValidInput("Queen", "A1"));
        assertTrue(Utility.isValidInput("King", "H8"));
        assertFalse(Utility.isValidInput("Knight", "A1"));
        assertFalse(Utility.isValidInput("Queen", "I1"));
    }

    @Test
    public void testIsValidPieceName() {
        assertTrue(Utility.isValidPieceName("Queen"));
        assertTrue(Utility.isValidPieceName("King"));
        assertFalse(Utility.isValidPieceName("Knight"));
        assertFalse(Utility.isValidPieceName("Bishop"));
    }
}