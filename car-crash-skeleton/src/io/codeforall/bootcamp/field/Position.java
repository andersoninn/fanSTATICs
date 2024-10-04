package io.codeforall.bootcamp.field;

public class Position {

    private int col = (int) (Math.random() * 99); // Inital positionCol
    private int row = (int) (Math.random() * 24); // Inital positionRow

    private int randomMoviment() {
        int nextMoviment = (int) (Math.random() * 2); // moviment -1 || +1
        return nextMoviment;
    }

    private int direction() {
        int direction = (int) (Math.random() * 2); // getCol// || getRow
        return direction;
    }

    public int getCol() {
        if (direction() == 0) {
            return col;
        }
        randomMoviment();
        if (randomMoviment() == 1) {
            col++;
            return col;
        } else {
            col--;
        }
        return col;
    }


    public int getRow() {
        if (direction() == 1) {
            return row;
        }
        randomMoviment();
        if (randomMoviment() == 1) {
            row++;
            return row;
        } else {
            row--;
        }
        return row;

    }
}
