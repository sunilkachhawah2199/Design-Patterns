package machine_coding.tictactoe.models;

import machine_coding.tictactoe.utilities.Pair;

import java.util.ArrayList;
import java.util.List;

// FOR RESTRICTED USE MAKE PRIVATE AND USE GETTERS AND SETTERS AND IF WE DON'T WANT TO CHANGE VALUE THAN REMOVE SETTERS
public class Board {
    private List<List<Cell>> cells;

    public List<List<Cell>> getCells() {
        return cells;
    }


    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }


    // this constructor is used to create board of n*n size
    // basically we are creating board with this cells and here cell should be unoccupied
    public Board(int n) {
        this.cells=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(new Cell(i, j, CellStatus.UNOCCUPIED));
            }
            this.cells.add(row);
        }
    }



    // ----------------------logic for printing board
    // during printing board we are printing cell so this work should be done by Cell class
    public void printBoard(){
        int n=cells.size();
        for(int i=0; i<n; i++){
            List<Cell> row = this.cells.get(i);
            for(int j=0; j<n; j++){
                Cell cell = row.get(j);
                // now this cell can be empty or can have player
                cell.printcell();
            }
            System.out.println();
        }

    }
    // ----------------- logic for checking cell before making move ----------------------
    // board should not have logic for checking cell because it is related to cell
    public boolean checkIfCellIsUnoccupied(Pair rowCol){
        Cell cell=this.cells.get(rowCol.x).get(rowCol.y);
        return cell.isUnoccupied();
    }

    // cell update
    public void setPlayer(Pair rowCol, Player player){
        Cell cell=this.cells.get(rowCol.x).get(rowCol.y);
        cell.setPlayer(player);

    }

    public Cell getCell(Pair rowCol) {
        return this.getCells().get(rowCol.x).get(rowCol.y);
    }

    public int getSize(){
        return cells.size();
    }

}
