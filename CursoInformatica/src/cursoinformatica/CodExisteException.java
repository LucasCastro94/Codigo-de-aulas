/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoinformatica;

/**
 *
 * @author Lucas-pc
 */
public class CodExisteException extends RuntimeException{
    private String msg;

    public CodExisteException(int cod) {
        
   msg = "O codigo "+cod+" inserido ja existe";
    }
    
   
    @Override
    public String toString()
    {
        return msg;
    }
}
