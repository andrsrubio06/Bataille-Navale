package ensta;

import ensta.board.Board;
import ensta.board.iBoard;
import ensta.ship.BattleShip;
import ensta.ship.Carrier;
import ensta.ship.Destroyer;
import ensta.ship.Submarine;
import ensta.ship.AbstractShip;

public class App 
{
    public static void main( String[] args )
    {
        Board a = new Board("andres"); 

        Carrier C = new Carrier();
        BattleShip B = new BattleShip();
        Submarine S = new Submarine();
        Destroyer D = new Destroyer();

        
        a.addShip(C, 6, 5);
        a.addShip(B, 5, 6);
        a.addShip(S, 4, 6);
        a.addShip(D, 3, 6);
        a.print();

    }
}
