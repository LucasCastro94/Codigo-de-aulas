/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoinformatica;

/**
 *
 * @author Lucas-pc
 */
public class Alunos {
    private int codAlunos, qtdFaltas;
    private String nome;
    private double notaFinal;

    public Alunos(int codAlunos, String nome,int qtdFaltas,double notaFinal) {
        this.codAlunos = codAlunos;
        this.qtdFaltas = qtdFaltas;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public int getCodAlunos() {
        return codAlunos;
    }

    public void setCodAlunos(int codAlunos) {
        this.codAlunos = codAlunos;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    
    
}
