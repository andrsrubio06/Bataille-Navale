package ensta.ship;

import ensta.utils.LabelShip;
import ensta.utils.Orientation;
import ensta.utils.ShipLength;
import ensta.utils.ShipName;

public class Destroyer 
extends AbstractShip{

    public Destroyer(){
        super(LabelShip.DESTROYER,ShipName.DESTROYER,ShipLength.DESTROYER,Orientation.SOUTH);
    }

    public Destroyer(Orientation orientation){
        super(LabelShip.DESTROYER,ShipName.DESTROYER,ShipLength.DESTROYER, orientation);
    }

}