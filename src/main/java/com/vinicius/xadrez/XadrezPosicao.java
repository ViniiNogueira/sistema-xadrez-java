package com.vinicius.xadrez;

import com.vinicius.Exceptions.XadrezException;
import com.vinicius.jogoTabuleiro.Posicao;

public class XadrezPosicao {
    private char coluna;
    private int linha;

    public XadrezPosicao(char coluna, int linha) {
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
            throw new XadrezException("erros instanciando a posicao, as posicoes validas sao a1 até h8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    // converte de posica(0 , 0) para ('a' , 8)
    protected Posicao paraPosicao() {
        return new Posicao(8 - linha , coluna - 'a');
    }

    //converte de volta para converte de ('a' , 8) para posicao(0 , 0) para
    protected static XadrezPosicao dePosicao( Posicao posicao) {
        return new XadrezPosicao( (char) ('a' + posicao.getColuna()) , 8 - posicao.getLinha() );
    }

    @Override
    public String toString() {
        return "" + coluna + linha;
    }
}
