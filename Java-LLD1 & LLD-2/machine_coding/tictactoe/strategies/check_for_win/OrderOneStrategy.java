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
    int n;


    // for n size board we need n hashmap in row and n hashmap in col
    public OrderOneStrategy(int n){
        this.n=n;
        rowsMap=new ArrayList<>();
        colsMap=new ArrayList<>();
        diagonalMap=new HashMap<>();
        reverseDiagonalMap=new HashMap<>();
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

        // adding count of moves by player and if any move become equal to length like row, col, diagonal then user will won
        rowMap.put(symbol, rowMap.getOrDefault(symbol, 0)+1);
        colMap.put(symbol,colMap.getOrDefault(colMap,0)+1);

        // will check for that location is present on diagonal or on reverse diagonal
        // if present on diafgonal then only update diagonal hm
        if(checkIfCellIsOnDiagonal(currCell)){
            diagonalMap.put(symbol, diagonalMap.getOrDefault(symbol,0)+1);
        }

        if(checkIfCellIsOnReverseDiagonal(board.getSize(), currCell)){
            reverseDiagonalMap.put(symbol, reverseDiagonalMap.getOrDefault(board.getSize(), 0)+1);
        }
        // now if count in any row, col, diagonal, reverse diagonal
        // in row maximum player= board size and same for col
        // for diagonal: if all diagonal cell are field with same symbol then count= root((n*n)+(n*n))


        if(rowMap.get(symbol)==n) return true;
        if(colMap.get(symbol)==n) return true;
        if(checkIfCellIsOnDiagonal(currCell) &&  diagonalMap.get(symbol)==n ) return true;
        if(checkIfCellIsOnReverseDiagonal(this.n, currCell) && reverseDiagonalMap.get(symbol)==n)return true;
        return  false;
    }

    private boolean checkIfCellIsOnDiagonal(Cell cell){
        return cell.getRow()== cell.getCol();
    }

    private boolean checkIfCellIsOnReverseDiagonal(int n,Cell cell){
        return cell.getRow()== n-1-cell.getCol();
    }
}
