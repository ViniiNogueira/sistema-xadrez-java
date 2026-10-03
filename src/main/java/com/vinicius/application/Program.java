package com.vinicius.application;

import com.vinicius.Exceptions.XadrezException;
import com.vinicius.xadrez.PartidaXadrez;
import com.vinicius.xadrez.PecaXadrez;
import com.vinicius.xadrez.XadrezPosicao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while (true) {
                try {
                    UI.clearScreen();
                    UI.printTabuleiro(partidaXadrez.getPeca()); // cria classe User Interface pra print do tabuleiro
                    System.out.println();
                    System.out.println("Digite a posicao de origem");
                    XadrezPosicao origem = UI.lePosicaoXadrez(sc);

                    System.out.println("Posicao de destino: ");
                    XadrezPosicao destino = UI.lePosicaoXadrez(sc);

                    PecaXadrez pecaCapturada = partidaXadrez.executadorDeMovimentos(origem, destino);
                } catch (XadrezException | InputMismatchException e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
        }


    }
}
