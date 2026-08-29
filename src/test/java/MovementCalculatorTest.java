import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovementCalculatorTest {

    private final MovementCalculator movementCalculator = new MovementCalculator();

    @Test
    public void testWalkStopsAtBoardEdge() {
        List<Position> moves = movementCalculator.walk(Position.parse("G1"), Direction.UP, 8);
        assertEquals(Arrays.asList("G2", "G3", "G4", "G5", "G6", "G7", "G8"), toStrings(moves));
    }

    @Test
    public void testWalkLimitedBySteps() {
        List<Position> moves = movementCalculator.walk(Position.parse("D4"), Direction.RIGHT, 2);
        assertEquals(Arrays.asList("E4", "F4"), toStrings(moves));
    }

    @Test
    public void testWalkFromEdgeReturnsEmpty() {
        List<Position> moves = movementCalculator.walk(Position.parse("H4"), Direction.RIGHT, 8);
        assertEquals(0, moves.size());
    }

    @Test
    public void testWalkOrdersNearestFirstRegardlessOfDirection() {
        // Regression guard for the original bug: 4 of 8 directions returned
        // farthest-cell-first due to an inconsistent Collections.reverse() call
        // in the pre-refactor per-direction methods. Every direction must now
        // return moves nearest-to-farthest.
        List<Position> left = movementCalculator.walk(Position.parse("E4"), Direction.LEFT, 8);
        assertEquals(Arrays.asList("D4", "C4", "B4", "A4"), toStrings(left));

        List<Position> down = movementCalculator.walk(Position.parse("E4"), Direction.DOWN, 8);
        assertEquals(Arrays.asList("E3", "E2", "E1"), toStrings(down));
    }

    private static List<String> toStrings(List<Position> positions) {
        List<String> strings = new ArrayList<String>();
        for (Position p : positions) {
            strings.add(p.toString());
        }
        return strings;
    }
}
