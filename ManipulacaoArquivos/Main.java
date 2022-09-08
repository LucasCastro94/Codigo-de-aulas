package com.company.ManipulacaoArquivos;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a palavra a ser gravada");
        gravando(ler.nextLine());


        }

    public static void gravando(String palavra)
    {

        try {
            FileOutputStream arq = new FileOutputStream("Arquivo.txt");
            PrintWriter ptw = new PrintWriter(arq);

            ptw.printf(palavra);

            ptw.close();
            arq.close();

            System.out.println("gravado com sucesso");

        }
        catch (Exception e)
        {
            System.out.println("Erro ao escrever arquivo");
        }
    }


    }

