import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ChessPieceMovementTest {

    @Test
    public void testGetPieceMovement_Queen() {
        ChessPieceMovement chessPieceMovement = new ChessPieceMovement();
        List<String> expectedMovements = Arrays.asList(
            "A4", "B4", "C4", "D4", "F4", "G4", "H4", "E1", "E2", "E3", "E5", "E6", "E7", "E8",
            "A8", "B7", "C6", "D5", "F3", "G2", "H1", "B1", "C2", "D3", "F5", "G6", "H7"
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
