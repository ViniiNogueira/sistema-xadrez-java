package com.vinicius.xadrez.pecas;

import com.vinicius.jogoTabuleiro.Tabuleiro;
import com.vinicius.xadrez.Cores;
import com.vinicius.xadrez.PecaXadrez;

public class Torre extends PecaXadrez {
    public Torre(Tabuleiro tabuleiro, Cores cores) {
        super(tabuleiro, cores);
    }

    @Override
    public String toString() {
        return "T";
    }
}
