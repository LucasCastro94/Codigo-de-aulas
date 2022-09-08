/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoinformatica;



/**
 *
 * @author Lucas-pc
 */
public class Turmas{
    private String nomeCurso;
    private int qtdTotalAulas;
    private Alunos alunos[];
    private int count;

    public Turmas(String nomeCurso, int qtdTotalAulas) {
        this.nomeCurso = nomeCurso;
        this.qtdTotalAulas = qtdTotalAulas;
        count=0;
        alunos = new Alunos[19];
        
    }
    
   boolean validaCod(int cod)
    {
        for(int i=0; i<count; i++)
        {
          
            if(alunos[i].getCodAlunos()==cod)
            {
                return true;
            }
        }
        return false;
    }
    
    void incluirAluno(Alunos al) throws LimiteListaException
    {
        if(count>19)
        {
           throw new LimiteListaException(19); 
        }
        if(validaCod(al.getCodAlunos()))
        {
         throw new CodExisteException(al.getCodAlunos());
        } 
        
        alunos[count]=al;
        alunos[count].setNotaFinal(0);
        alunos[count].setQtdFaltas(0);
        count++;
    }
    
    Alunos buscarAluno(int cod)
    {
        Alunos ref=null;
        for(int i=0; i<count;i++)
        {
            if(alunos[i].getCodAlunos()==cod)
            {
               ref=alunos[i];
            }
        }
        
        return ref;
    }
    
    
    public void registrarFalta(int cod)
    {    boolean achou=false;
         for(int i=0; i<count;i++)
        {
            if(alunos[i].getCodAlunos()==cod)
            {
             achou=true;
             alunos[i].setQtdFaltas((alunos[i].getQtdFaltas())+1);
            }
        }
         
         if(!achou)
         {
             throw new RuntimeException("Cod não encontrado");
         }
    }
    
   public void atribuirNota(int cod, double nota)
   {
        boolean achou=false;
         for(int i=0; i<count;i++)
        {
            if(alunos[i].getCodAlunos()==cod)
            {
             achou=true;
             alunos[i].setNotaFinal(nota);
            }
        }
         
         if(!achou)
         {
             throw new RuntimeException("Cod não encontrado");
         }
       
   }
   
  
    
    public void listarAlunos()
    {
        System.out.println("Turma:"+nomeCurso+"\nQuantidade Aulas:"+qtdTotalAulas+"\n--------------------------------------\nListando todos Alunos\n--------------------------------------");
        
        for(int i=0; i<count; i++)
        {
             System.out.println("Codigo:"+alunos[i].getCodAlunos()
                +"\nNome:"+alunos[i].getNome()
                + "\nQtd Falta:"+alunos[i].getQtdFaltas()+
                "\nNota final:"+alunos[i].getNotaFinal()
                    +"\nFrequencia:"+(100/qtdTotalAulas)*(qtdTotalAulas-alunos[i].getQtdFaltas())+"\n"
                );
        }
       
    }
    
    public void listarAprovados()
    {
        
        System.out.println("\n-------------------------------\nALUNOS APROVADOS\n-------------------------------\n");
          for(int i=0; i<count; i++)
        {
            if((100/qtdTotalAulas)*(qtdTotalAulas-alunos[i].getQtdFaltas())>75 && alunos[i].getNotaFinal()>=6)
            {
                 System.out.println("Codigo:"+alunos[i].getCodAlunos()
                +"\nNome:"+alunos[i].getNome()
                + "\nQtd Falta:"+alunos[i].getQtdFaltas()+
                "\nNota final:"+alunos[i].getNotaFinal()
                    +"\nFrequencia:"+(100/qtdTotalAulas)*(qtdTotalAulas-alunos[i].getQtdFaltas())+"\n"); 
            }
        }
    }
   
    
    
    
       
}
