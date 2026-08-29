import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PieceTypeTest {

    @Test
    public void testIsValid() {
        assertTrue(PieceType.isValid("Queen"));
        assertTrue(PieceType.isValid("King"));
        assertTrue(PieceType.isValid("Pawn"));
        assertFalse(PieceType.isValid("Knight"));
        assertFalse(PieceType.isValid("Bishop"));
        assertFalse(PieceType.isValid(null));
    }

    @Test
    public void testFromIsCaseAndWhitespaceInsensitive() {
        assertEquals(PieceType.QUEEN, PieceType.from("queen"));
        assertEquals(PieceType.KING, PieceType.from(" King "));
        assertEquals(PieceType.PAWN, PieceType.from("PAWN"));
    }
}
