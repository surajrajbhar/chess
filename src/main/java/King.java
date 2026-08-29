import java.util.ArrayList;
import java.util.List;

public final class King implements Piece {

    private static final int STEP = 1;
    private static final Direction[] DIRECTIONS = {
        Direction.DIAGONAL_SW, Direction.LEFT, Direction.DIAGONAL_NE, Direction.DOWN,
        Direction.UP, Direction.DIAGONAL_NW, Direction.RIGHT, Direction.DIAGONAL_SE
    };

    private final MovementCalculator movementCalculator;

    public King(MovementCalculator movementCalculator) {
        this.movementCalculator = movementCalculator;
    }

    @Override
    public List<Position> getMoves(Position from) {
        List<Position> moves = new ArrayList<Position>();
        for (Direction direction : DIRECTIONS) {
            moves.addAll(movementCalculator.walk(from, direction, STEP));
        }
        return moves;
    }
}
