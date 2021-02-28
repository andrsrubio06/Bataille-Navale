package ensta.ship;

import ensta.utils.LabelShip;
import ensta.utils.Orientation;
import ensta.utils.ShipLength;
import ensta.utils.ShipName;

/**
 * Carrier
 */
public class Carrier 
extends AbstractShip{

    public Carrier(){
        super(LabelShip.CARRIER,ShipName.CARRIER,ShipLength.CARRIER,Orientation.SOUTH);
    }

    public Carrier(Orientation orientation){
        super(LabelShip.CARRIER,ShipName.CARRIER,ShipLength.CARRIER, orientation);
    }

}