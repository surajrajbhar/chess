import java.util.*;
public class ChessPieceMovement {

    MovementCalculator movementCalculator;
    public ChessPieceMovement() {
        this.movementCalculator = new MovementCalculator();
    }

    public List<String> getQueenMovement(String currentPosition) {
        List<String> queenMovements = new ArrayList<>();
        for (String direction : Constants.QUEEN_DIRECTIONS) {
            List<String> movements = movementCalculator.getMovement(currentPosition, Constants.QUEEN_STEP, direction);
            queenMovements.addAll(movements);
        }

        return queenMovements;
    }

    public List<String> getKingMovement(String currentPosition) {
        List<String> kingMovements = new ArrayList<>();
        for (String direction : Constants.KING_DIRECTIONS) {
            List<String> movements = movementCalculator.getMovement(currentPosition, Constants.KING_STEP, direction);
            kingMovements.addAll(movements);
        }
        return kingMovements;
    }

    public List<String> getPawnMovement(String currentPosition) {
        List<String> pawnMovements = new ArrayList<>();
        for (String direction : Constants.PAWN_DIRECTIONS) {
            List<String> movements = movementCalculator.getMovement(currentPosition, Constants.PAWN_STEP, direction);
            pawnMovements.addAll(movements);
        }
        return pawnMovements;
    }


    public List<String> getPieceMovement(String input) {

        String[] userInput = input.split(",");
        if (userInput.length != 2) {
            System.out.println("Invalid input, please enter valid input");
            return new ArrayList<>();
        }

        String pieceName = userInput[0].trim().toUpperCase(Locale.ROOT);
        String position = userInput[1].trim().toUpperCase(Locale.ROOT);

        if (!Utility.isValidInput(pieceName, position)) {
            System.out.println("Invalid piece or position, please enter valid piece name and position");
            return new ArrayList<>();
        }
        if (pieceName.equals(Constants.QUEEN)) {
            List<String> queenMovements = getQueenMovement(position);
            return queenMovements;
        } else if (pieceName.equals(Constants.KING)) {
            List<String> kingMovements = getKingMovement(position);
            return kingMovements;
        } else {
            List<String> pawnMovement = getPawnMovement(position);
            return pawnMovement;
        }

    }



}
