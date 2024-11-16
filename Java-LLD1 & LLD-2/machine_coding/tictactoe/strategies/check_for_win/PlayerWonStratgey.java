package machine_coding.tictactoe.strategies.check_for_win;

import machine_coding.tictactoe.models.Board;
import machine_coding.tictactoe.models.Cell;
import machine_coding.tictactoe.models.Move;
import machine_coding.tictactoe.models.Player;


public interface PlayerWonStratgey {

    // cell has player so we don't need player seperatly

    public boolean checkforWin(Board board, Cell currCell);

    public void handleUndo(Move move);
}
