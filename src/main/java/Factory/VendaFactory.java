/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Catalogo.VendasCatalogo;
import Conceitos.Carrinho;
import Conceitos.Pagamento;
import Conceitos.Venda;

/**
 *
 * @author Arthur
 */
public class VendaFactory {
    public VendaFactory()
    {}
    
    public Venda criarVenda(Carrinho carrinho, Pagamento pagamento)
    {
        VendasCatalogo catalogo_venda = VendasCatalogo.getInstance();
        Venda novo = new Venda(carrinho, pagamento);
        catalogo_venda.addVenda(novo);
        return novo;
    }
}
