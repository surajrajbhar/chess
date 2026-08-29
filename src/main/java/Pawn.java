import java.util.List;

public final class Pawn implements Piece {

    private static final int STEP = 1;

    private final MovementCalculator movementCalculator;

    public Pawn(MovementCalculator movementCalculator) {
        this.movementCalculator = movementCalculator;
    }

    @Override
    public List<Position> getMoves(Position from) {
        return movementCalculator.walk(from, Direction.UP, STEP);
    }
}
