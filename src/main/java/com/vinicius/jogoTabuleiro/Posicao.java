package com.vinicius.jogoTabuleiro;

public class Posicao {

    private Integer linha;
    private Integer coluna;

    public Posicao(Integer linha, Integer coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public Integer getColuna() {
        return coluna;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }

    public Integer getLinha() {
        return linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }


    @Override
    public String toString() {
        return "Posicao: " +
                "coluna=" + coluna +
                ", linha=" + linha;
    }
}
