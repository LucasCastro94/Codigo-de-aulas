/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoinformatica;

/**
 *
 * @author Lucas-pc
 */
public class CursoInformatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Alunos a1 = new Alunos(1,"marcos", 10, 10);
     Alunos a2 = new Alunos(2,"jorge", 10, 10);
     Alunos a3 = new Alunos(3,"leo", 10, 10);
     
     Turmas t1 = new Turmas("Ingles", 10);
 
    try{
        t1.incluirAluno(a1);
         t1.incluirAluno(a2);
          t1.incluirAluno(a3);
          
    t1.atribuirNota(1, 10);
    t1.atribuirNota(2, 8);
    t1.atribuirNota(3, 4);
    t1.registrarFalta(1);
    t1.registrarFalta(2);
    t1.registrarFalta(3);
    }
    catch(LimiteListaException | CodExisteException ex)
    {
        System.out.println(""+ex);
    }
    catch(RuntimeException ex)
    {
         System.out.println(""+ex);
    }


    
   
    t1.listarAlunos();
    t1.listarAprovados();
    
   System.out.println("buscando aluno:"+t1.buscarAluno(3).getNome());
        
    }
    
}
