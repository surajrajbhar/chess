import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ChessPieceMovementTest {

    @Test
    public void testGetPieceMovement_Queen() {
        ChessPieceMovement chessPieceMovement = new ChessPieceMovement();
        // Nearest-cell-first in every direction. The pre-refactor version reversed
        // the LEFT/DOWN/DIAGONAL_NE/DIAGONAL_SW segments only (a copy-paste
        // artifact of Collections.reverse() being added to some of the eight
        // duplicated per-direction methods but not others) -- see MovementCalculator.
        List<String> expectedMovements = Arrays.asList(
            "D4", "C4", "B4", "A4", "F4", "G4", "H4", "E3", "E2", "E1", "E5", "E6", "E7", "E8",
            "D5", "C6", "B7", "A8", "F3", "G2", "H1", "D3", "C2", "B1", "F5", "G6", "H7"
        );
        List<String> actualMovements = chessPieceMovement.getPieceMovement("Queen, E4");
        assertEquals(expectedMovements, actualMovements);
    }

    @Test
    public void testGetPieceMovement_King() {
        ChessPieceMovement chessPieceMovement = new ChessPieceMovement();
        List<String> expectedMovements = Arrays.asList(
            "C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6"
        );
        List<String> actualMovements = chessPieceMovement.getPieceMovement("King, D5");
        assertEquals(expectedMovements, actualMovements);
    }

    @Test
    public void testGetPieceMovement_Pawn() {
        ChessPieceMovement chessPieceMovement = new ChessPieceMovement();
        List<String> expectedMovements = Arrays.asList("G2");
        List<String> actualMovements = chessPieceMovement.getPieceMovement("Pawn, G1");
        assertEquals(expectedMovements, actualMovements);
    }

}
