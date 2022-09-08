/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoinformatica;

/**
 *
 * @author Lucas-pc
 */
public class LimiteListaException extends Exception {
    
    private String msg;

    public LimiteListaException(int cap) {
        msg = "Falha ao adicionar o elemento na lista capacidade maxima atingida limite de "+cap;
    }
    
    @Override
   public String toString()
   {
    return msg;   
   }
    
}
