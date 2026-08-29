public final class PieceFactory {

    private final MovementCalculator movementCalculator;

    public PieceFactory(MovementCalculator movementCalculator) {
        this.movementCalculator = movementCalculator;
    }

    public Piece create(PieceType type) {
        switch (type) {
            case QUEEN:
                return new Queen(movementCalculator);
            case KING:
                return new King(movementCalculator);
            case PAWN:
                return new Pawn(movementCalculator);
            default:
                throw new IllegalStateException("Unhandled piece type: " + type);
        }
    }
}
