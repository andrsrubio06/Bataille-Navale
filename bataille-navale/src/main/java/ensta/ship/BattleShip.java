package ensta.ship;

import ensta.utils.LabelShip;
import ensta.utils.Orientation;
import ensta.utils.ShipLength;
import ensta.utils.ShipName;

public class BattleShip 
extends AbstractShip{

    public BattleShip(){
        super(LabelShip.BATTLESHIP,ShipName.BATTLESHIP,ShipLength.BATTLESHIP,Orientation.SOUTH);
    }

    public BattleShip(Orientation orientation){
        super(LabelShip.BATTLESHIP,ShipName.BATTLESHIP,ShipLength.BATTLESHIP, orientation);
    }

}