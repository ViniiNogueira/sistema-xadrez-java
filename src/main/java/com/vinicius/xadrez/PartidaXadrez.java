package com.vinicius.xadrez;

import com.vinicius.jogoTabuleiro.Peca;
import com.vinicius.jogoTabuleiro.Posicao;
import com.vinicius.jogoTabuleiro.Tabuleiro;
import com.vinicius.xadrez.pecas.Rei;
import com.vinicius.xadrez.pecas.Torre;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        inicializaPecas();
    }

    // print tabuleiro
    public PecaXadrez[][] getPeca() {
        PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                matriz[i][j] = (PecaXadrez) tabuleiro.getPecas(i,j);
            }
        }
        return matriz;
    }

    private void inicializaPecas(){
        tabuleiro.lugarPeca(new Torre(tabuleiro, Cores.BRANCO) , new Posicao(2,1));
        tabuleiro.lugarPeca(new Rei(tabuleiro, Cores.PRETO) , new Posicao(0,4));
        tabuleiro.lugarPeca(new Rei(tabuleiro, Cores.BRANCO) , new Posicao(7,4));
    }


}
