package sudoku.problemdomain;

import java.util.Objects;

/**
 * Convenience class for storing the location of a given tile in the Sudoku puzzle in a Hashmap.
 */
public record Coordinates(int x, int y) {

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
