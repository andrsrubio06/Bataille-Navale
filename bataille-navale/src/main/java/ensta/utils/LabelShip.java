package ensta.utils;

public enum LabelShip {
    DESTROYER('D'),
    SUBMARINE('S'),
    BATTLESHIP('B'),
    CARRIER('C');

    private char value; 

    public char getValue() 
    {
        return this.value;
    }

    @Override
    public String toString()
    {
        return Character.toString(this.value);
    }
    
    private LabelShip(char value) 
    { 
        this.value = value; 
    } 
}