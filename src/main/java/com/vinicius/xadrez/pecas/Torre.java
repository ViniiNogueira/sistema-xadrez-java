package com.vinicius.xadrez.pecas;

import com.vinicius.jogoTabuleiro.Posicao;
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

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];

        Posicao p = new  Posicao(0, 0);


        // para cima
        p.setValores(posicao.getLinha() -1, posicao.getColuna());
        while (getTabuleiro().posicaoexiste(p) && !getTabuleiro().AquiTemUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() -1);
        }
        if (getTabuleiro().posicaoexiste(p) && haPecaAdversariaAqui(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        // para esquerda
        p.setValores(posicao.getLinha(), posicao.getColuna() -1);
        while (getTabuleiro().posicaoexiste(p) && !getTabuleiro().AquiTemUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() -1);
        }
        if (getTabuleiro().posicaoexiste(p) && haPecaAdversariaAqui(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //direita
        p.setValores(posicao.getLinha(), posicao.getColuna() +1);
        while (getTabuleiro().posicaoexiste(p) && !getTabuleiro().AquiTemUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() +1);
        }
        if (getTabuleiro().posicaoexiste(p) && haPecaAdversariaAqui(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        // para baixo
        p.setValores(posicao.getLinha() +1, posicao.getColuna());
        while (getTabuleiro().posicaoexiste(p) && !getTabuleiro().AquiTemUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() +1);
        }
        if (getTabuleiro().posicaoexiste(p) && haPecaAdversariaAqui(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }



        return mat;
    }

}
