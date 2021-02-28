package ensta.board;

import ensta.ship.AbstractShip;
import ensta.utils.*;
import ensta.board.*;


public class Board implements iBoard
{
    


    private static final String NO_SHIP = ".";

    private String name;
    
    private char[][] boardShips;
    
    private boolean[][] boardHits;

    
    public Board(String name, int size){
        this.name = name;
        this.boardShips = new char[size][size];
        this.boardHits = new boolean[size][size];
    }

    public Board(String name){
        this(name,10);
    }

    private void printBoardTitle(String title, int boardColumnSize){
        System.out.print(" " + title + String.format("%" + (3 * boardColumnSize - title.length() + 2) + "s", ""));
    }


    private void printBoardHeader(int boardColumnSize){
        System.out.print("   ");
        for(int j = 0; j < boardColumnSize; j++){
            System.out.print(" " + (char)(65 + j) + " ");
        }  
    }

    public void print(){
      
        System.out.println("\n\n" + name);
      
        printBoardTitle("Navires:", boardShips[0].length);
      
        printBoardTitle("Frappes:", boardHits[0].length);
      
        System.out.println();

        printBoardHeader(boardShips[0].length);
      
        System.out.print(" ");
      
        printBoardHeader(boardHits[0].length);
      
        System.out.println();

        for(int i = 0; i < boardShips.length; i++){
            //printing column numbers
            System.out.print(String.format("%2s ", i + 1));
            //printing board ships
            for(int j = 0; j < boardShips[0].length; j++){
                System.out.print(" " + printShip(j, i) + " ");
            }
            //printing column numbers
            System.out.print(String.format(" %2s ", i + 1));
            //printing board hits
            for(int j = 0; j < boardHits[0].length; j++){
                System.out.print(" " + "." + " ");
            }
            System.out.println();
        }

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }


    @Override
    public int getSize() {
        return boardShips.length;
    }

    @Override
    public boolean checkShip(int x, int y) {
        return boardShips[x][y]== 0 ? false : true;
    }

    private String printShip(int i, int j){   
        return boardShips[i][j] == 0 ? NO_SHIP : Character.toString(boardShips[i][j]);
    } 
    
    
    
    public void addShip(AbstractShip ship, int x, int y)
    //throws boardException
    {

            int boardLimit = getSize();

            int shipSize=ship.getLength().getValue();
            
            int yDir=0, xDir=0;
            
            int i=0;
                
                switch (ship.getOrientation().getValue()) {
                    case 'n':
                    yDir = -1;
                        break;
                    case 's':
                    yDir = 1;
                        break;
                    case 'e':
                    xDir = 1;
                        break;
                    case 'w':
                    xDir = -1;
                        break;
                }
         //here is where to the exceptions supossed to be verified
            if((x+xDir*shipSize)>boardLimit||
                (x+xDir*shipSize)<0||
                (y+yDir*shipSize)>boardLimit||
                (y+yDir*shipSize)<0||
                y<0||x<0)
    //                         throw new boardException("It goes off the board");

        for (int j = 0; j < shipSize; j++) {
            while(i<shipSize){
                if(checkShip(x+xDir*i, y+yDir*j))
    //                            throw new boardException("the position is already occupied",i,j);
                i++;
            }
        } 

        for (int j = 0; j < shipSize ; j++) {
            this.boardShips[x+xDir*j][y+yDir*j]=ship.getType().getValue();
        }
        
    }

}