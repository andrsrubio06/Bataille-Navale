package ensta.board;

/**
 * boardException
 */
public class boardException extends Exception{

    private static final long serialVersionUID = 1L;
        
    public boardException(String reason) {
        super("The ship cannot be placed in the coordinates provided because: "+reason);
    }
    public boardException(String reason, int x,int y) {
        super("The ship cannot be placed in the coordinates provided because: "+reason+ " in the position" +" ("+x+","+y+")");
    }
}