package com.company.JavaProjetoBatalhaNaval;

import java.util.Random;
import java.util.Scanner;

public class JogoBatalhaNaval {



  /* public static void tirosDoJogador() {


        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a linha (representada pelas letras maiúsculas) onde deseja atirar:");

        String input = scan.next();

        int x = 0;
        if (input.equalsIgnoreCase("A")) {
            x = 1;
        }
        if (input.equalsIgnoreCase("B")) {
            x = 2;
        }

        if (input.equalsIgnoreCase("C")) {
            x = 3;
        }

        if (input.equalsIgnoreCase("D")) {
            x = 4;
        }

        if (input.equalsIgnoreCase("E")) {
            x = 5;
        }

        if (input.equalsIgnoreCase("F")) {
            x = 6;
        }

        if (input.equalsIgnoreCase("G")) {
            x = 7;
        }
        if (input.equalsIgnoreCase("H")) {
            x = 8;
        }
        if (input.equalsIgnoreCase("I")) {
            x = 9;
        }
        if (input.equalsIgnoreCase("J")) {
            x = 10;
        }


        System.out.println("Escolha a coluna (representada pelos números) onde deseja atirar:");
        int coluna = scan.nextInt();

        coluna = coluna + 1;

   */


        public static void main (String[]args){

            String[][] tabuleiro = new String[11][11];
            int[][] computador = new int[11][11];
            int[][] jogador = new int[11][11];
            int acertoJogador=0;
            int acertoComputador=0;

            tabuleiro[0][0] = "|  ";
            tabuleiro[0][1] = "0";
            tabuleiro[0][2] = "1";
            tabuleiro[0][3] = "2";
            tabuleiro[0][4] = "3";
            tabuleiro[0][5] = "4";
            tabuleiro[0][6] = "5";
            tabuleiro[0][7] = "6";
            tabuleiro[0][8] = "7";
            tabuleiro[0][9] = "8";
            tabuleiro[0][10] = "9";


            tabuleiro[1][0] = "| A";
            tabuleiro[2][0] = "| B";
            tabuleiro[3][0] = "| C";
            tabuleiro[4][0] = "| D";
            tabuleiro[5][0] = "| E";
            tabuleiro[6][0] = "| F";
            tabuleiro[7][0] = "| G";
            tabuleiro[8][0] = "| H";
            tabuleiro[9][0] = "| I";
            tabuleiro[10][0] = "| J";

            for (int i = 1; i < tabuleiro.length; i++) {
                for (int j = 1; j < tabuleiro[i].length; j++) {

                    tabuleiro[i][j] = " ";
                }
            }

            Scanner scan = new Scanner(System.in);

            System.out.print(" Olá, SEJA BEM VIDO AO JOGO DE BATALHA NAVAL !!!!!");
            System.out.println();
            System.out.print(" Você tem direito a 10 navios ");
            System.out.println();
            System.out.print(" Digite 1 se quiser dispor seus navios manualmente ou digite 2 se quiser dispor seus navios aleatoriamente: ");
            int escolha = scan.nextInt();

            if (escolha == 1) {

                System.out.print(" Esse é seu Tabuleiro :");
                System.out.println();
                System.out.println("---------------------------------------------");
                System.out.println("                  JOGADOR                    ");
                System.out.println("---------------------------------------------");

                for (int i = 0; i < tabuleiro.length; i++) {
                    for (int j = 0; j < tabuleiro[i].length; j++) {

                        System.out.print(tabuleiro[i][j] + " | ");

                    }
                    System.out.println();
                    System.out.println("---------------------------------------------");
                }
                int x;
                x = 0;
                for (int i = 1; i < 11; i++) {
                    System.out.println("Escolha a linha (representada pelas letras maiúsculas) onde deseja colocar o " + i + "° navio:");

                    String input = scan.next();


                    if (input.equalsIgnoreCase("A")) {
                        x = 1;
                    }
                    if (input.equalsIgnoreCase("B")) {
                        x = 2;
                    }

                    if (input.equalsIgnoreCase("C")) {
                        x = 3;
                    }

                    if (input.equalsIgnoreCase("D")) {
                        x = 4;
                    }

                    if (input.equalsIgnoreCase("E")) {
                        x = 5;
                    }

                    if (input.equalsIgnoreCase("F")) {
                        x = 6;
                    }

                    if (input.equalsIgnoreCase("G")) {
                        x = 7;
                    }
                    if (input.equalsIgnoreCase("H")) {
                        x = 8;
                    }
                    if (input.equalsIgnoreCase("I")) {
                        x = 9;
                    }
                    if (input.equalsIgnoreCase("J")) {
                        x = 10;
                    }


                    System.out.println("Escolha a coluna (representada pelos números) onde deseja colocar o " + i + "° navio:");
                    int coluna = scan.nextInt();

                    coluna = coluna + 1;

                    tabuleiro[x][coluna] = "N";


                }

                System.out.println("---------------------------------------------");
                System.out.println("                  JOGADOR                    ");
                System.out.println("---------------------------------------------");
                for (int i = 0; i < tabuleiro.length; i++) {
                    for (int j = 0; j < tabuleiro[i].length; j++) {

                        System.out.print(tabuleiro[i][j] + " | ");

                    }
                    System.out.println();
                    System.out.println("---------------------------------------------");
                }

            } else if (escolha == 2) {

                Random numeroRandom = new Random();

                for (int x = 1; x < 11; x++) {

                    int a;
                    int b;

                    a = numeroRandom.nextInt(10);
                    b = numeroRandom.nextInt(10);


                    computador[b + 1][x] = 1;
                    jogador[a + 1][x] = 1;
                    tabuleiro[a + 1][x] = "N";
                }

                    System.out.println("---------------------------------------------");
                    System.out.println("                  JOGADOR                    ");
                    System.out.println("---------------------------------------------");

                    for (int i = 0; i < tabuleiro.length; i++) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {


                            System.out.print(tabuleiro[i][j] + " | ");

                        }
                        System.out.println();
                        System.out.println("---------------------------------------------");
                    }

                boolean fimDeJogo = false;

                while (!fimDeJogo) {








                        System.out.println("Escolha a linha (representada pelas letras maiúsculas) onde deseja atirar:");

                        String input = scan.next();

                        int x = 0;
                        if (input.equalsIgnoreCase("A")) {
                            x = 1;
                        }
                        if (input.equalsIgnoreCase("B")) {
                            x = 2;
                        }

                        if (input.equalsIgnoreCase("C")) {
                            x = 3;
                        }

                        if (input.equalsIgnoreCase("D")) {
                            x = 4;
                        }

                        if (input.equalsIgnoreCase("E")) {
                            x = 5;
                        }

                        if (input.equalsIgnoreCase("F")) {
                            x = 6;
                        }

                        if (input.equalsIgnoreCase("G")) {
                            x = 7;
                        }
                        if (input.equalsIgnoreCase("H")) {
                            x = 8;
                        }
                        if (input.equalsIgnoreCase("I")) {
                            x = 9;
                        }
                        if (input.equalsIgnoreCase("J")) {
                            x = 10;
                        }

                        System.out.println();
                        System.out.println("Escolha a coluna (representada pelos números) onde deseja atirar:");
                        int coluna = scan.nextInt();

                        coluna = coluna + 1;


                        if (computador[x][coluna] == 1 && jogador[x][coluna] == 1) {
                            tabuleiro[x][coluna] = "X";
                            acertoJogador = acertoJogador + 1;
                        } else if (computador[x][coluna] == 1 && jogador[x][coluna] != 1) {
                            tabuleiro[x][coluna] = "*";
                            acertoJogador = acertoJogador + 1;
                        } else if (computador[x][coluna] != 1 && jogador[x][coluna] == 1) {
                            tabuleiro[x][coluna] = "n";
                        } else {
                            tabuleiro[x][coluna] = "-";
                        }


                        // Tiros do computador


                             int a ;
                             int b ;

                    a = numeroRandom.nextInt(10);
                    b = numeroRandom.nextInt(10);

                        if (jogador[a+1][b+1] == 1) {

                            acertoComputador = acertoComputador + 1;


                        }

                    System.out.println("---------------------------------------------");
                    System.out.println("                  JOGADOR                    ");
                    System.out.println("---------------------------------------------");

                    for (int i = 0; i < tabuleiro.length; i++) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {


                            System.out.print(tabuleiro[i][j] + " | ");

                        }
                        System.out.println();
                        System.out.println("---------------------------------------------");
                    }


                    System.out.println("Computador acertou: "+acertoComputador+" navios");
                    System.out.println("Você acertou: "+acertoJogador+" navios");

                    if (acertoJogador==10 || acertoComputador==10) {
                        fimDeJogo = true;
                    }



                    }


                 if (acertoJogador == 10){
                     System.out.println("PARABÉNS VOCÊ GANHOU !!!!!!!!!");
                 } else {

                     System.out.println("VOCÊ PERDEU !!!!!!!!!");
                 }


            } else {
                System.out.println("Digite 1 se quiser dispor seus navios manualmente ou digite 2 se quiser dispor seus navios aleatoriamente:");
            }


        }

    }

