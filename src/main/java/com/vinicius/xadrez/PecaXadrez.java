package com.vinicius.xadrez;

import com.vinicius.jogoTabuleiro.Peca;
import com.vinicius.jogoTabuleiro.Tabuleiro;

import java.awt.*;

public class PecaXadrez extends Peca {

    private Color  color;

    public PecaXadrez(Color color, Tabuleiro tabuleiro) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
