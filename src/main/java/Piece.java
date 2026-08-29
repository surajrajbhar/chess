import java.util.List;

public interface Piece {
    List<Position> getMoves(Position from);
}
