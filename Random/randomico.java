package com.company.Random;

import java.util.Random;
import java.util.Scanner;

public class randomico {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();
        int[] vetor = new int[5];
        vetor[0] = 21;
        vetor[1] = 32;
        vetor[2] = 21;
        vetor[3] = 32;
        vetor[4] = 21;

        System.out.println(vetor[random.nextInt(5)]); // imprimindo um vetor de indice randomico

        JogoDoAcerto();
    }

    public static void JogoDoAcerto() {
        Random random = new Random();
        int numeroSecreto = random.nextInt(10);
        int tentativas = 5;
        int chute;

        while (tentativas>=0) {
            System.out.println("Informe o valor do seu chute?");
            chute = ler.nextInt();

            if (chute == numeroSecreto) {
                tentativas--;
                System.out.println("PARABENS VC ACERTOU!!!!");
                break;
            } else {
                tentativas--;
                System.out.println("Você Errou, tente novamente!!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
            if (tentativas == 0) {
                System.out.println("Terminou Suas chances");
                break;
            }


        }
    }
}