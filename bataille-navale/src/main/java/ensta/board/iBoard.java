package ensta.board;

import ensta.ship.AbstractShip;

/**
 * iBoard
 */
public interface iBoard {

    int getSize();

    void addShip(AbstractShip ship, int x, int y) throws boardException;

    boolean checkShip(int x, int y);
}