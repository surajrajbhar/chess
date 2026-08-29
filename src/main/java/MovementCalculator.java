import java.util.ArrayList;
import java.util.List;

public final class MovementCalculator {

    public List<Position> walk(Position from, Direction direction, int maxSteps) {
        List<Position> movements = new ArrayList<Position>();
        Position current = from;
        for (int i = 0; i < maxSteps; i++) {
            current = current.shift(direction.dFile, direction.dRank);
            if (!current.isValid()) {
                break;
            }
            movements.add(current);
        }
        return movements;
    }
}
