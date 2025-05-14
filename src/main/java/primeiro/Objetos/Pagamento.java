/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro.Objetos;

import Terminal.Input;

/**
 *
 * @author Eidiyoshi
 */
public class Pagamento {
    private float valorTotal;
    private float valorPagado = 0;
    
    public Pagamento(float valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public boolean confirmado(){
        valorPagado = Input.getPagamento();
        
        return valorPagado >= valorTotal;
    }
}
