package ensta.ship;

import ensta.utils.LabelShip;
import ensta.utils.ShipName;
import ensta.utils.Orientation;
import ensta.utils.ShipLength;

public abstract class AbstractShip{

    protected LabelShip type;
   
    protected ShipName name;
    
    protected ShipLength length;
    
    protected Orientation orientation;

    protected int strikeCount;

    public LabelShip getType() {
        return this.type;
    }

    public ShipName getName() {
        return this.name;
    }

    public ShipLength getLength() {
        return this.length;
    }


    public Orientation getOrientation() {
        return this.orientation;
    }

    public void Strikes() {
        this.strikeCount++;
    }

    public boolean Sunk() {
        return this.strikeCount == this.length.getValue();
    }

    public void setOrientation(Orientation orientation) 
    {
        this.orientation = orientation;
    }

    public AbstractShip (LabelShip type, ShipName name, ShipLength length, Orientation orientation)
    {
        this.type = type;
        this.name = name;
        this.length = length;
        this.orientation = orientation;
        this.strikeCount = 0;
    }


}