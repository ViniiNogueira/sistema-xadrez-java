package com.vinicius.xadrez;

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

    private void conversorDePosicao(char coluna, int linha , PecaXadrez peca ) {
        tabuleiro.lugarPeca(peca , new XadrezPosicao(coluna, linha).paraPosicao());
    }

    private void inicializaPecas(){
        conversorDePosicao('c', 1, new Torre(tabuleiro, Cores.BRANCO));
        conversorDePosicao('c', 2, new Torre(tabuleiro, Cores.BRANCO));
        conversorDePosicao('d', 2, new Torre(tabuleiro, Cores.BRANCO));
        conversorDePosicao('e', 2, new Torre(tabuleiro, Cores.BRANCO));
        conversorDePosicao('e', 1, new Torre(tabuleiro, Cores.BRANCO));
        conversorDePosicao('d', 1, new Rei(tabuleiro, Cores.BRANCO));

        conversorDePosicao('c', 7, new Torre(tabuleiro, Cores.PRETO));
        conversorDePosicao('c', 8, new Torre(tabuleiro, Cores.PRETO));
        conversorDePosicao('d', 7, new Torre(tabuleiro, Cores.PRETO));
        conversorDePosicao('e', 7, new Torre(tabuleiro, Cores.PRETO));
        conversorDePosicao('e', 8, new Torre(tabuleiro, Cores.PRETO));
        conversorDePosicao('d', 8, new Rei(tabuleiro, Cores.PRETO));
    }


}
