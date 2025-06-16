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

    public Venda(UUID ID, Carrinho carrinho, LocalDateTime data, Pagamento pagamento) {
        this.ID = ID;
        this.carrinho = carrinho;
        this.data = data;
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
    
    public String getID()
    {
        return ID.toString();
    }
    
    public boolean compare(String string)
    {
        return ID.toString().equals(string);
    }
    
    public String toJSON()
    {   
        String result = "{ID:" + ID.toString() + ",";
        result += carrinho.toJSON() + ",";
        result += "Data:" + data.toString().replace(':', '?') + ",";
        result += "Preco:" + Float.toString(pagamento.getTotal()) + "}";
        
        return result;
    }
}
