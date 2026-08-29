public enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    DIAGONAL_NE(-1, 1),
    DIAGONAL_NW(1, -1),
    DIAGONAL_SW(-1, -1),
    DIAGONAL_SE(1, 1);

    public final int dFile;
    public final int dRank;

    Direction(int dFile, int dRank) {
        this.dFile = dFile;
        this.dRank = dRank;
    }
}
