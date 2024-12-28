
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Utility {
    
    public static boolean isUpperBoundary(String position) {
        Set<String> boundariesSet = new HashSet<>(Arrays.asList(Constants.UPPER_BOUNDARIES));
        if (!isValidPosition(position) || boundariesSet.contains(position)) {
            return true;
        }
        return false;
    }

    public static boolean isLowerBoundary(String position) {
        Set<String> lowerBoundariesSet = new HashSet<>(Arrays.asList(Constants.LOWER_BOUNDARIES));
        if (!isValidPosition(position) || lowerBoundariesSet.contains(position)) {
            return true;
        }
        return false;
    }

    public static boolean isLeftBoundary(String position) {
        Set<String> leftBoundariesSet = new HashSet<>(Arrays.asList(Constants.LEFT_BOUNDARIES));

        if (!isValidPosition(position) || leftBoundariesSet.contains(position)) {
            return true;
        }
        return false;
    }

    public static boolean isRightBoundary(String position) {
        Set<String> rightBoundariesSet = new HashSet<>(Arrays.asList(Constants.RIGHT_BOUNDARIES));
        if (!isValidPosition(position) || rightBoundariesSet.contains(position)) {
            return true;
        }
        return false;
    }

    public static boolean isDiagonalBoundary(String position) {
        if (!isValidPosition(position) || isLeftBoundary(position) || isRightBoundary(position) || isUpperBoundary(position) || isLowerBoundary(position)) {
            return true;
        }
        return false;
    }


    public static boolean isValidPosition(String position) {
        // 1. A string is valid if its length is exactly two if position.length == 2 then valid otherwise invalid.
        // 2. First char should between A to H
        // 3. Second char should be between 1 and 8
        if (position.length() != 2) {
            return false;
        }
        char firstChar = position.charAt(0);
        Integer secondChar = Character.getNumericValue(position.charAt(1));
        if (firstChar < 'A' || firstChar > 'H') {
            return false;
        }
        if (secondChar < 1 || secondChar > 8) {
            return false;
        }
        return true;
    }

    public static boolean isValidInput(String pieceName, String position) {
        if (!isValidPieceName(pieceName)) {
            return false;
        }
        if (!isValidPosition(position)) {
            return false;
        }
        return true;
    }

    public static boolean isValidPieceName(String userInput) {
        Set<String> validPieceNames = new HashSet<>(Arrays.asList(Constants.VALID_PIECE_NAME));
        String pieceName = userInput.trim().toUpperCase(Locale.ROOT);
        if (!validPieceNames.contains(pieceName)) {
            return false;
        }
        return true;
    }
}
