package com.vinicius.xadrez;

import com.vinicius.jogoTabuleiro.Peca;
import com.vinicius.jogoTabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {

    private Cores color;

    public PecaXadrez(Tabuleiro tabuleiro, Cores color) {
        super(tabuleiro);
        this.color = color;
    }

    public Cores getColor() {
        return color;
    }

}
