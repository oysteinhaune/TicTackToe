package com.company;

import java.util.Scanner;

public class TicTacToeProgram {

    private TicTacToe ticTacToe;
    private String activeplayer;
    private String playersymbol;
    private Scanner scanner;

    public TicTacToeProgram() {
        this.ticTacToe = new TicTacToe();
        this.activeplayer = "Player 1";
        this.playersymbol = "X";
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println(this.activeplayer + ", choose your place on the board: ");
        String place = this.scanner.nextLine();
        if (this.isRightInput(place)) {
            if (this.input(this.playersymbol, place)) {
                System.out.println(ticTacToe);
                if (!this.winnerCheck("X", this.ticTacToe) && !this.winnerCheck("O", this.ticTacToe)) {
                    this.switchPlayerSymbol(this.activeplayer);
                    this.switchActiveplayer(this.activeplayer);
                    this.run();
                }
                else {
                    System.out.println(this.activeplayer + " won the game! Congratulations!! :D :D");
                }
            }
            else {
                this.run();
            }
        }
        else {
            this.run();
        }
    }

    public boolean input(String symbol, String place) {
        if (place.equals("00") && this.ticTacToe.oppvenstre == " ") {
            this.ticTacToe.oppvenstre = symbol;
            return true;
        } else if (place.equals("10") && this.ticTacToe.oppmidt == " ") {
            this.ticTacToe.oppmidt = symbol;
            return true;
        } else if (place.equals("20") && this.ticTacToe.opphoyre == " ") {
            this.ticTacToe.opphoyre = symbol;
            return true;
        } else if (place.equals("01") && this.ticTacToe.midtvenstre == " ") {
            this.ticTacToe.midtvenstre = symbol;
            return true;
        } else if (place.equals("11") && this.ticTacToe.midtmidt == " ") {
            this.ticTacToe.midtmidt = symbol;
            return true;
        } else if (place.equals("21") && this.ticTacToe.midthoyre == " ") {
            this.ticTacToe.midthoyre = symbol;
            return true;
        } else if (place.equals("02") && this.ticTacToe.nedvenstre == " ") {
            this.ticTacToe.nedvenstre = symbol;
            return true;
        } else if (place.equals("12") && this.ticTacToe.nedmidt == " ") {
            this.ticTacToe.nedmidt = symbol;
            return true;
        } else if (place.equals("22") && this.ticTacToe.nedhoyre == " "){
            this.ticTacToe.nedhoyre = symbol;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isRightInput(String input) {
        if (input.equals("00") || input.equals("10") || input.equals("20") || input.equals("01")
                || input.equals("11") || input.equals("21") || input.equals("02") || input.equals("12") ||
                input.equals("22")) {
            return true;
        }
            return false;
    }

    public boolean winnerCheck(String symbol ,TicTacToe ticTacToe) {
        if (ticTacToe.oppvenstre == symbol && ticTacToe.oppmidt == symbol && ticTacToe.opphoyre == symbol) {
            return true;
        } else if (ticTacToe.midtvenstre == symbol && ticTacToe.midtmidt == symbol && ticTacToe.midthoyre == symbol) {
            return true;
        } else if (ticTacToe.nedvenstre == symbol && ticTacToe.nedmidt == symbol && ticTacToe.nedhoyre == symbol) {
            return true;
        } else if (ticTacToe.oppvenstre == symbol && ticTacToe.midtvenstre == symbol && ticTacToe.nedvenstre == symbol) {
            return true;
        } else if (ticTacToe.oppmidt == symbol && ticTacToe.midtmidt == symbol && ticTacToe.nedmidt == symbol) {
            return true;
        } else if (ticTacToe.opphoyre == symbol && ticTacToe.midthoyre == symbol && ticTacToe.nedhoyre == symbol) {
            return true;
        } else if (ticTacToe.nedvenstre == symbol && ticTacToe.midtmidt == symbol && ticTacToe.opphoyre == symbol) {
            return true;
        } else if (ticTacToe.oppvenstre == symbol && ticTacToe.midtmidt == symbol && ticTacToe.nedhoyre == symbol) {
            return true;
        } else {
            return false;
        }
    }

    public void switchActiveplayer(String player) {
        if (player == "Player 1") {
            this.activeplayer = "Player 2";
        }
        else {
            this.activeplayer = "Player 1";
        }

    }

    public void switchPlayerSymbol(String player) {
        if (player == "Player 1") {
            this.playersymbol = "O";
        }
        else {
            this.playersymbol = "X";
        }
    }
}
