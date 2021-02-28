package ensta.ship;

import ensta.utils.LabelShip;
import ensta.utils.Orientation;
import ensta.utils.ShipLength;
import ensta.utils.ShipName;

public class Submarine 
extends AbstractShip{

    public Submarine(){
        super(LabelShip.SUBMARINE,ShipName.SUBMARINE,ShipLength.SUBMARINE,Orientation.SOUTH);
    }

    public Submarine(Orientation orientation){
        super(LabelShip.SUBMARINE,ShipName.SUBMARINE,ShipLength.SUBMARINE, orientation);
    }

}