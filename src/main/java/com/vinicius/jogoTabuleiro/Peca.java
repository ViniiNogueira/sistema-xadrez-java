package com.vinicius.jogoTabuleiro;

public abstract class Peca {

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

    public abstract boolean[][] movimentosPossiveis();


    // metodo que faz um ganho ccom a subclasse
    // pq ele chama uma possivel implementacao de uma subclasse contreta da classe Peca
     public boolean movimentosPossiveis(Posicao posicao) {
         return movimentosPossiveis()[posicao.getLinha()][posicao.getColuna()];
     };

     public boolean haMovimentosPossiveis() {
         boolean[][] matriz = movimentosPossiveis();

         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 if (matriz[i][j] == true) {
                     return true;
                 }
             }
         }
         return false;
     }
}