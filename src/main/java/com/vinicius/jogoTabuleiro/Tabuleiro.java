package com.vinicius.jogoTabuleiro;

public class Tabuleiro {

    private int linhas;
    private int colunas;

    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    //TODO nao vou criar getter e setter de peca pq vou fazer metodos que retornam as posicoes de uma peca.

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public Peca getPecas(int linha, int coluna) {
        return pecas[linha][coluna];
    }


    public Peca getPecas(Posicao posicao) {
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void lugarPeca(Peca  peca , Posicao posicao) {
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

}