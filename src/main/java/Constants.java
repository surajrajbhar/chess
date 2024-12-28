public class Constants {

    public final static int QUEEN_STEP = 8;
    public final static int KING_STEP = 1;
    public final static int PAWN_STEP = 1;
    public final static String LEFT = "LEFT";
    public final static String RIGHT = "RIGHT";
    public final static String DOWN = "DOWN";
    public final static String UP = "UP";
    public final static String DIAGONAL_NE = "DIAGONAL_NE";
    public final static String DIAGONAL_NW = "DIAGONAL_NW";
    public final static String DIAGONAL_SW = "DIAGONAL_SW";
    public final static String DIAGONAL_SE = "DIAGONAL_SE";
    public final static String[] QUEEN_DIRECTIONS = {LEFT, RIGHT, DOWN, UP, DIAGONAL_NE, DIAGONAL_NW, DIAGONAL_SW, DIAGONAL_SE};
    public final static String[] KING_DIRECTIONS = {DIAGONAL_SW, LEFT, DIAGONAL_NE, DOWN, UP, DIAGONAL_NW, RIGHT, DIAGONAL_SE};
    public final static String[] PAWN_DIRECTIONS = {UP};
    public final static String QUEEN = "QUEEN";
    public final static String KING = "KING";
    public final static String PAWN = "PAWN";
    public final static String[] VALID_PIECE_NAME = {QUEEN, KING, PAWN};
    public final static String[] UPPER_BOUNDARIES = {"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"};
    public final static String[] LOWER_BOUNDARIES = {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"};
    public final static String[] LEFT_BOUNDARIES = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8"};
    public final static String[] RIGHT_BOUNDARIES = {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8"};
    // TODO: Add enum instead of final, if time permits
}
