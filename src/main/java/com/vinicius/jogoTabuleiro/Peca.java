package com.vinicius.jogoTabuleiro;

public class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    //TODO posicao nao iniciada pq ela vai comecar como NULL
    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    // so classes e subclasses podem acessar o tabuleiro de uma peca
    protected Posicao getPosicao() {
        return posicao;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
