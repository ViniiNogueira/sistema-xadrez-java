package com.vinicius.application;


import com.vinicius.xadrez.PartidaXadrez;
import com.vinicius.xadrez.PecaXadrez;

//Classe de interaface com metodo de print do tabuleiro
public class UI {

    public static void printTabuleiro(PecaXadrez[][] pecas) {
        for (int i = 0; i < pecas.length; i++) {
            System.out.print( 8 - i + " ");
            for (int j = 0; j < pecas.length; j++) {
                printPeca(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h ");
    }

    //metodo interno auxiliar
    private static void printPeca(PecaXadrez peca ) {
        if ( peca == null ) {
            System.out.print("-");
        } else  {
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}
