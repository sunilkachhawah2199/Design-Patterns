package machine_coding.tictactoe.strategies.check_for_win;

import machine_coding.tictactoe.models.Board;
import machine_coding.tictactoe.models.Cell;
import machine_coding.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneStrategy implements PlayerWonStratgey{


    // this list size will be
    private List<HashMap<Character, Integer>> rowsMap; // rowsMap.get(0) --> will give hashmap of first row | for many rows we need many hm so we are using list
    private List<HashMap<Character, Integer>> colsMap;

    // total 2 hm for 2 rows
    private HashMap<Character, Integer> diagonalMap;
    private HashMap<Character, Integer> reverseDiagonalMap;


    // for n size board we need n hashmap in row and n hashmap in col
    public OrderOneStrategy(int n){
        rowsMap=new ArrayList<>();
        colsMap=new ArrayList<>();
        for(int i=0;i<n;i++){
            rowsMap.add(new HashMap<>());
            colsMap.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkforWin(Board board, Cell currCell) {
        // we required total 2*n+1 hashmap
        // before checking for win first update hashmap of that row, col, diagonal on which move made
        Player currPlayer= currCell.getPlayer(); // player who made move on this cell
        char symbol=currPlayer.getSymbol().getS();

        // getting location of cell so we can update hm according to this location
        int row=currCell.getRow();
        int col=currCell.getCol();

        HashMap<Character, Integer> rowMap=rowsMap.get(row); // hashmap for that row
        HashMap<Character, Integer> colMap=rowsMap.get(col); // hm for that col

        rowMap.put(symbol, rowMap.getOrDefault(symbol, 0)+1);
        colMap.put(symbol,colMap.getOrDefault(colMap,0)+1);

        // will check for that location is present on diagonal or on reverse diagonal


        return  false;
    }

    private boolean checkIfCellIsOnDiagonal(int n,Cell cell){
        if(cell.getRow()== cell.getCol()) return true;
        else return false;
    }

    private boolean checkIfCellIsOnReverseDiagonal(int n,Cell cell){
        if(cell.getRow()== n-1-cell.getCol()) return true;
        else return false;
    }

    private boolean checkIfCellIsCenter(int n,Cell cell){
        if(n%2==0) return false;
        int center=n/2;
        int row=cell.getRow();
        int col=cell.getCol();
        if(row== col && row==center && col ==center) return true;
        else return false;
    }
}
