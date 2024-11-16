package machine_coding.tictactoe.strategies.bot_playing;

import machine_coding.tictactoe.exceptions.InvalidGameException;
import machine_coding.tictactoe.models.Board;
import machine_coding.tictactoe.models.Cell;
import machine_coding.tictactoe.utilities.Pair;

import java.util.List;

public class EasyBotPlaying implements BotPlayingStrategy{
    @Override
    public Pair makeMove(Board board) {
        // bot will iterate on board and bot will make move on first empty cell
        int n=board.getSize();
        List<List<Cell>> cells=board.getCells();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Cell cell= cells.get(i).get(j);
                if(cell.isUnoccupied()){
                    return new Pair(i,j);
                }
            }
        }
        // but we will not get this error neven because it will only occur when we all cell are filled
        throw new InvalidGameException("no place present where bot can make a move");
    }
}
