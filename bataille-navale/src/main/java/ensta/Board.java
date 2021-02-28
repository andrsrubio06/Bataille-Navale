package ensta;


public class Board
{

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
                System.out.print(" " + "." + " ");
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



}