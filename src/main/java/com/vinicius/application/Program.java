package com.vinicius.application;

import com.vinicius.xadrez.PartidaXadrez;

public class Program {
    public static void main(String[] args) {

        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printTabuleiro(partidaXadrez.getPeca()); // cria classe User Interface pra print do tabuleiro



    }
}
