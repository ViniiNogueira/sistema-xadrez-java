package com.vinicius.xadrez;

import com.vinicius.jogoTabuleiro.Peca;
import com.vinicius.jogoTabuleiro.Posicao;
import com.vinicius.jogoTabuleiro.Tabuleiro;

public abstract class PecaXadrez extends Peca {

    private Cores cores;

    public PecaXadrez(Tabuleiro tabuleiro, Cores color) {
        super(tabuleiro);
        this.cores = color;
    }

    public Cores getCores() {
        return cores;
    }

    protected boolean haPecaAdversariaAqui(Posicao posicao) {
        PecaXadrez p = (PecaXadrez) getTabuleiro().getPecas(posicao);
        return p != null &&p.getCores() != cores;


    }

}
