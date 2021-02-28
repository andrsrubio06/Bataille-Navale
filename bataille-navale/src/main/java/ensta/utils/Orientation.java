package ensta.utils;

public enum Orientation {
    NORTH('D'),
    SOUTH('S'),
    WEST('B'),
    EAST('C');

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