package ensta.utils;

public enum Orientation {
    NORTH('n'),
    SOUTH('s'),
    WEST('w'),
    EAST('e');

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
    
    public static Orientation fromString(String value) {
        for (Orientation o : Orientation.values()) {
            if (o.toString().equals(value)) {
                return o;
            }
        }
        return null;
    }

    private Orientation(char value) 
    { 
        this.value = value; 
    } 
}