import java.util.Objects;

public final class Position {

    private final char file;
    private final int rank;

    private Position(char file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public static Position parse(String raw) {
        if (raw == null || raw.length() != 2) {
            throw new IllegalArgumentException("Position must be exactly 2 characters: " + raw);
        }
        char file = Character.toUpperCase(raw.charAt(0));
        int rank = Character.digit(raw.charAt(1), 10);
        return new Position(file, rank);
    }

    public static boolean isValid(String raw) {
        if (raw == null || raw.length() != 2) {
            return false;
        }
        return parse(raw).isValid();
    }

    public boolean isValid() {
        return file >= 'A' && file <= 'H' && rank >= 1 && rank <= 8;
    }

    public Position shift(int dFile, int dRank) {
        return new Position((char) (file + dFile), rank + dRank);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }
        Position other = (Position) o;
        return file == other.file && rank == other.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }

    @Override
    public String toString() {
        return "" + file + rank;
    }
}
