package com.vinicius.xadrez;

import com.vinicius.Exceptions.XadrezException;
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

    public PecaXadrez executadorDeMovimentos( XadrezPosicao posicaoOrigem , XadrezPosicao posicaoFinal) {
        Posicao origem = posicaoOrigem.paraPosicao();
        Posicao finall = posicaoFinal.paraPosicao();

        //serve pra validar se a posicao de origem existe
        validaPosicaoDeOrigem(origem);

        Peca pecaCapturada = realizaMovimento(origem, finall);
        return (PecaXadrez) pecaCapturada;
    }

    //metodo auxiliar
    private void validaPosicaoDeOrigem(Posicao posicao) {
        if (!tabuleiro.AquiTemUmaPeca(posicao)) {
            throw new XadrezException("nao tem uma peça nessa posicao de origem");
        }
    }

    private Peca realizaMovimento(Posicao origem, Posicao finall) {
        Peca p = tabuleiro.removePeca(origem);
        Peca pecaCapturada = tabuleiro.removePeca(finall);

        tabuleiro.lugarPeca(p ,finall);
        return pecaCapturada;
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
