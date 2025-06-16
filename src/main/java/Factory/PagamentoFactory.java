/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Conceitos.Pagamento;


/**
 *
 * @author Arthur
 */
public class PagamentoFactory {
    public PagamentoFactory()
    {}
    
    public Pagamento criarPagamento(float total)
    {
        Pagamento novo = new Pagamento(total);
        return novo;
    }
    
    public Pagamento lerPagamento(float total)
    {
        Pagamento novo = new Pagamento(total);
        novo.setPago();
        return novo;
    }
}
