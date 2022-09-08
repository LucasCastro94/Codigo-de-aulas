package com.company.ManipulacaoArquivos;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;

public class LendoArq {
    public static void main(String[] args) {

        try {
            FileInputStream arq = new FileInputStream("Arquivo.txt");
            InputStreamReader input = new InputStreamReader(arq);
            BufferedReader br = new BufferedReader(input);

            String palavra;

            do{
                palavra = br.readLine();
                if(palavra!=null)
                {
                    System.out.println(palavra);
                }
            }while(palavra==null);

        }
        catch (Exception e)
        {
            System.out.println("Erro ao ler o arquivo");
        }

    }

}