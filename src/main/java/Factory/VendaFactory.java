/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Catalogo.VendasCatalogo;
import Conceitos.Carrinho;
import Conceitos.Pagamento;
import Conceitos.Venda;
import java.time.LocalDateTime;
import java.util.UUID;
import org.json.JSONArray;

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
    
    public Venda lerVenda(UUID ID, JSONArray carrinho, LocalDateTime data, float pagamento)
    {
        PagamentoFactory facPa = new PagamentoFactory();
        CarrinhoFactory facC = new CarrinhoFactory();
        VendasCatalogo catalogo_venda = VendasCatalogo.getInstance();
        
        Pagamento pag = facPa.lerPagamento(pagamento);
        Carrinho ca = facC.lerCarrinho(carrinho);
        Venda novo = new Venda(ID, ca, data, pag);
        catalogo_venda.addVenda(novo);
        return novo;
    }
}
