/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Arthur
 */
public class Venda {
    private UUID ID;
    private Carrinho carrinho;
    private LocalDateTime data;
    private Pagamento pagamento;

    public Venda(Carrinho carrinho, Pagamento pagamento) {
        ID = UUID.randomUUID();
        this.data = LocalDateTime.now();
        this.carrinho = carrinho;
        this.pagamento = pagamento;
    }
    
    public String getRelat()
    {
        String result = "\nID: " + ID.toString();
        result += "\nTotal pago: " + Float.toString(pagamento.getTotal());
        result += "\nCarrinho: " + carrinho.getRelat();
        result += "\nData: " + data.toString();
        return result;
    }
    
    public boolean compare(String string)
    {
        return ID.toString().equals(string);
    }
}
