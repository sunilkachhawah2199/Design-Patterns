package machine_coding.tictactoe.strategies.bot_playing;

import machine_coding.tictactoe.models.Board;
import machine_coding.tictactoe.utilities.Pair;

public interface BotPlayingStrategy {
    // if bot plat then that means bot is choosing location in board only so it will return pair of row and col
    // bot need board to make a move so bot will find unoccupied cells

    public Pair makeMove(Board board);
}
