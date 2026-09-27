package com.vinicius.jogoTabuleiro;

import com.vinicius.jogoTabuleiro.ExceptionsTabuleiro.TabuleiroException;

public class Tabuleiro {

    private int linhas;
    private int colunas;

    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {

        if ( linhas < 1 || colunas < 1 ) {
            throw new TabuleiroException("Erro criando tabuleiro! é necessario pelo menos 1 linha e 1 coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    //TODO nao vou criar getter e setter de peca pq vou fazer metodos que retornam as posicoes de uma peca.

    public int getColunas() {
        return colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public Peca getPecas(int linha, int coluna) {
        if (!posicaoexiste(linha, coluna)) {
            throw new TabuleiroException("Essa posicao nao está no tabuleiro!");
        }
        return pecas[linha][coluna];
    }

    public Peca getPecas(Posicao posicao) {
        if (!posicaoexiste(posicao)) {
            throw new TabuleiroException("Essa posicao nao está no tabuleiro!");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void lugarPeca(Peca  peca , Posicao posicao) {
        if (AquiTemUmaPeca(posicao)) {
            throw new TabuleiroException("Ja tem uma peça na posicao : " + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }


    //metodo auxiliar
    private boolean posicaoexiste(int linha, int coluna) {
        return (linha >= 0 && linha < linhas) && (coluna >= 0 && coluna < colunas);
    }

    public boolean posicaoexiste(Posicao posicao) {
        return posicaoexiste(posicao.getLinha(), posicao.getColuna());
    }

    public boolean AquiTemUmaPeca(Posicao posicao) {
        if (!posicaoexiste(posicao)) {
            throw new TabuleiroException("Essa posicao nao está no tabuleiro!");
        }
        return getPecas(posicao) != null;
    }
}