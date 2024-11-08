package machine_coding.tictactoe.models;


import machine_coding.tictactoe.utilities.Pair;

// for every single cell of board
public class Cell {
    private int row;
    private int col;
    private CellStatus cellStatus;
    private Player player; // it will help us to get player symbol if cell is not occupied

    public Cell(int row, int col, CellStatus cellStatus) {
        this.row = row;
        this.col = col;
        this.cellStatus = cellStatus;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
        // when player is set then cell is occupied
        this.cellStatus=CellStatus.OCCUPIES;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }


    // logic to check cell status
    public boolean isUnoccupied(){
        if(this.player==null && !this.cellStatus.equals(CellStatus.UNOCCUPIED)) return true;
        else return false;
    }

    // print cell
    public void printcell(){
        if(this.cellStatus.equals(CellStatus.UNOCCUPIED)){
            System.out.print(" - ");
        }else{
            // cell is occupied
            // so I have to print player symbol
            // for getting player symbol we have to use move object but time  will be O(n^2)
            // so reading moves list time complexity will become O(n^4) --> n^2 total cell and for every cell we are reading moves list
            // 1. way is we can add Player in Cell class initially it will be null and when player will make move we can set player in cell, but we can't do this because we are adding player also in move class --> redundancy of data
            // but if we are doing any operation again and again then we can add redundancy of data

            System.out.print(" "+this.player.getSymbol().getS()+" ");
        }
    }



}
