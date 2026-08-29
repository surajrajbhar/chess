import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ChessPieceMovement {

    private final PieceFactory pieceFactory;

    public ChessPieceMovement() {
        this.pieceFactory = new PieceFactory(new MovementCalculator());
    }

    public List<String> getPieceMovement(String input) {
        String[] userInput = input.split(",");
        if (userInput.length != 2) {
            System.out.println("Invalid input, please enter valid input");
            return new ArrayList<String>();
        }

        String pieceName = userInput[0].trim().toUpperCase(Locale.ROOT);
        String positionInput = userInput[1].trim().toUpperCase(Locale.ROOT);

        if (!PieceType.isValid(pieceName) || !Position.isValid(positionInput)) {
            System.out.println("Invalid piece or position, please enter valid piece name and position");
            return new ArrayList<String>();
        }

        Piece piece = pieceFactory.create(PieceType.from(pieceName));
        Position position = Position.parse(positionInput);

        List<String> result = new ArrayList<String>();
        for (Position move : piece.getMoves(position)) {
            result.add(move.toString());
        }
        return result;
    }
}
