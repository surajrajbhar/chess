import java.util.Locale;

public enum PieceType {
    QUEEN, KING, PAWN;

    public static boolean isValid(String name) {
        if (name == null) {
            return false;
        }
        try {
            PieceType.valueOf(name.trim().toUpperCase(Locale.ROOT));
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static PieceType from(String name) {
        return PieceType.valueOf(name.trim().toUpperCase(Locale.ROOT));
    }
}
