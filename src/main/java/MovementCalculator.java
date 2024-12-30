import java.util.*;

public class MovementCalculator {

    public List<String> getUpMovement(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            Integer secondChar = Character.getNumericValue(currentPosition.charAt(1));
            for (int i = 1; i <= step; i++) {
                secondChar = secondChar + 1;
                String newPosition = String.format("%c%d", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isUpperBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        return movements;
    }

    public List<String> getDownMovement(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            Integer secondChar = Character.getNumericValue(currentPosition.charAt(1));
            for (int i = 0; i < step; i++) {
                secondChar = secondChar - 1;
                String newPosition = String.format("%c%d", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isLowerBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        Collections.reverse(movements);
        return movements;
    }

    public List<String> getLeftMovement(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            char secondChar = currentPosition.charAt(1);
            for (int i = 1; i <= step; i++) {
                firstChar = (char) (firstChar - 1);
                String newPosition = String.format("%c%c", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isLeftBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        Collections.reverse(movements);
        return movements;
    }

    public List<String> getRightMovement(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            char secondChar = currentPosition.charAt(1);
            for (int i = 1; i <= step; i++) {
                firstChar = (char) (firstChar + 1);
                String newPosition = String.format("%c%c", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isRightBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        return movements;

    }

    public List<String> getDiagonalMovement_NE(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            int secondChar = Character.getNumericValue(currentPosition.charAt(1));
            for (int i = 1; i <= step; i++) {
                firstChar = (char) (firstChar - 1);
                secondChar = secondChar + 1;
                String newPosition = String.format("%c%d", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isDiagonalBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        Collections.reverse(movements);
        return movements;

    }

    public List<String> getDiagonalMovement_SE(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            int secondChar = Character.getNumericValue(currentPosition.charAt(1));
            for (int i = 1; i <= step; i++) {
                firstChar = (char) (firstChar + 1);
                secondChar = secondChar + 1;
                String newPosition = String.format("%c%d", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isDiagonalBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        return movements;

    }

    public List<String> getDiagonalMovement_SW(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            int secondChar = Character.getNumericValue(currentPosition.charAt(1));
            for (int i = 1; i <= step; i++) {
                firstChar = (char) (firstChar - 1);
                secondChar = secondChar - 1;
                String newPosition = String.format("%c%d", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isDiagonalBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        Collections.reverse(movements);
        return movements;

    }

    public List<String> getDiagonalMovement_NW(String currentPosition, int step) {
        List<String> movements = new ArrayList<>();
        if (Utility.isValidPosition(currentPosition)) {
            char firstChar = currentPosition.charAt(0);
            int secondChar = Character.getNumericValue(currentPosition.charAt(1));
            for (int i = 1; i <= step; i++) {
                firstChar = (char) (firstChar + 1);
                secondChar = secondChar - 1;
                String newPosition = String.format("%c%d", firstChar, secondChar);
                if(!Utility.isValidPosition(newPosition)){
                    break;
                }
                if (Utility.isDiagonalBoundary(newPosition)) {
                    movements.add(newPosition);
                    break;
                }
                movements.add(newPosition);
            }
        }
        return movements;

    }

    public List<String> getMovement(String currentPosition, int steps, String direction) {
        switch (direction) {
            case Constants.LEFT:
                return getLeftMovement(currentPosition, steps);
            case Constants.RIGHT:
                return getRightMovement(currentPosition, steps);
            case Constants.DOWN:
                return getDownMovement(currentPosition, steps);
            case Constants.UP:
                return getUpMovement(currentPosition, steps);
            case Constants.DIAGONAL_NE:
                return getDiagonalMovement_NE(currentPosition, steps);
            case Constants.DIAGONAL_SW:
                return getDiagonalMovement_SW(currentPosition, steps);
            case Constants.DIAGONAL_NW:
                return getDiagonalMovement_NW(currentPosition, steps);
            case Constants.DIAGONAL_SE:
                return getDiagonalMovement_SE(currentPosition, steps);
            default:
                return new ArrayList<>();
        }
    }

    // current: @7, @9, A7, A9, B7, B8, B9,
    //          @7, @9, A7, A9, B7, B8, B9,


}
