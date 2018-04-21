package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter these numbers for the position.\nExample 00 for: up left.\n" +
                "  0 0  |  1 0  |  2 0  \n" +
                "----------------------\n" +
                "  0 1  |  1 1  |  2 1  \n" +
                "----------------------\n" +
                "  0 2  |  1 2  |  2 2  \n");
	    TicTacToeProgram ticTacToeProgram = new TicTacToeProgram();
        ticTacToeProgram.run();
    }
}
