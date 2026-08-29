import java.util.ArrayList;
import java.util.List;

public final class Queen implements Piece {

    private static final int STEP = 8;
    private static final Direction[] DIRECTIONS = {
        Direction.LEFT, Direction.RIGHT, Direction.DOWN, Direction.UP,
        Direction.DIAGONAL_NE, Direction.DIAGONAL_NW, Direction.DIAGONAL_SW, Direction.DIAGONAL_SE
    };

    private final MovementCalculator movementCalculator;

    public Queen(MovementCalculator movementCalculator) {
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
