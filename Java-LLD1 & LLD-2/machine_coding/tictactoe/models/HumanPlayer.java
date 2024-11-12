package machine_coding.tictactoe.models;

import machine_coding.tictactoe.utilities.Pair;

import java.util.Scanner;

public class HumanPlayer extends Player{
    public HumanPlayer(String name, Symbol s){
        super(name, s); // will call the constructor of the parent class
    }

    @Override
    public Pair makeMove(Board board) {
        int n=board.getSize();
        Scanner sc=new Scanner(System.in);
        System.out.println("Its "+this.getName()+" 's turn");
        System.out.println(" where do you want to make move enter row, col");
        System.out.println("enter row ");
        int row=sc.nextInt();
        while(row>=n){
            System.out.println("enter choose valid row less than "+n);
            row=sc.nextInt();
        }

        System.out.println("enter col");
        int col=sc.nextInt();
        while(col>=n){
            System.out.println("enter choose valid col less than "+n);
            col=sc.nextInt();
        }

        // player has don't direct access to make a move operation because all core operation should be handles from game class
        // so we will return row and col from here and Game class will make a move
        return new Pair(row, col);
    }
}

