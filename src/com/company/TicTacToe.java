package com.company;

public class TicTacToe {
    String opphoyre;
    String oppmidt;
    String oppvenstre;
    String midtvenstre;
    String midtmidt;
    String midthoyre;
    String nedvenstre;
    String nedmidt;
    String nedhoyre;

    public TicTacToe() {
        this.opphoyre = " ";
        this.oppmidt = " ";
        this.oppvenstre = " ";
        this.midtvenstre = " ";
        this.midtmidt = " ";
        this.midthoyre = " ";
        this.nedvenstre = " ";
        this.nedmidt = " ";
        this.nedhoyre = " ";
    }

    public void setOpphoyre(String opphoyre) {
        this.opphoyre = opphoyre;
    }

    public void setOppmidt(String oppmidt) {
        this.oppmidt = oppmidt;
    }

    public void setOppvenstre(String oppvenstre) {
        this.oppvenstre = oppvenstre;
    }

    public void setMidtvenstre(String midtvenstre) {
        this.midtvenstre = midtvenstre;
    }

    public void setMidtmidt(String midtmidt) {
        this.midtmidt = midtmidt;
    }

    public void setMidthoyre(String midthoyre) {
        this.midthoyre = midthoyre;
    }

    public void setNedvenstre(String nedvenstre) {
        this.nedvenstre = nedvenstre;
    }

    public void setNedmidt(String nedmidt) {
        this.nedmidt = nedmidt;
    }

    public void setNedhoyre(String nedhoyre) {
        this.nedhoyre = nedhoyre;
    }

    public String toString() {
        return String.format("  %s  |   %s  |  %s  \n" +
                "-------------------\n" +
                "  %s  |   %s  |  %s  \n" +
                "-------------------\n" +
                "  %s  |   %s  |  %s  \n",
                this.oppvenstre, this.oppmidt, this.opphoyre,
                this.midtvenstre, this.midtmidt, this.midthoyre,
                this.nedvenstre, this.nedmidt, this.nedhoyre);
    }
}
