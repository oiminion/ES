/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Conceitos.Produto;
import Terminal.Input;
import Terminal.Output;
import Catalogo.ProdutosCatalogo;
import Conceitos.Cliente;
import Conceitos.Pagamento;
import Conceitos.Venda;
import Factory.PagamentoFactory;
import Factory.VendaFactory;

/**
 *
 * @author Arthur
 */
public class ControladorCliente {
    public ControladorCliente()
    {
    
    }
    
    public boolean ClienteAcao(int opcao, Cliente cliente)
    {
        if(opcao == -1)
        {
            
        }
        else if(opcao == 1)
        {
            String input = Input.getIdentProd();
            ProdutosCatalogo catalogo = ProdutosCatalogo.getInstance();
            Produto prod = catalogo.getProduto(input);
            if(prod != null)
            {
                Output.showOutput(prod.getRelat());
            }
            else
            {
                Output.produtoNaoEncontrado();
            }
        }
        else if(opcao == 2)
        {
            return true;
        }
        return false;
    }
    
    public int ClienteCompra(int opcao, Cliente cliente)
    {
        
        if(opcao == 1)
        {
            // adicionar produto
            String input = Input.getIdentProd();
            ProdutosCatalogo catalogo = ProdutosCatalogo.getInstance();
            Produto prod = catalogo.getProduto(input);
            if( prod != null )
            {
                cliente.addCarrinho(prod);
            }
        }
        if(opcao == 2)
        { // ver produtos

            String relatorio = cliente.getRelatCarrinho();
            Output.showOutput(relatorio);
        }
        if(opcao == 3)
        { // finalizar compra

            float total = cliente.getTotal();
            Output.relatCompra(total);
            PagamentoFactory facPa = new PagamentoFactory();
            Pagamento pagamento = facPa.criarPagamento(total);
            
            while( !pagamento.confirmado() ){
                Output.pagamentoFalha();
            }
            
            Output.pagamentoCompleto();
            
            cliente.comprar();
            
            VendaFactory fac = new VendaFactory();
            Venda venda = fac.criarVenda(cliente.getCarrinho(),pagamento);
            Output.codigoCompra(venda.getID());
            
            cliente.resetCarrinho();
            
            return -2;
        }
        else
        {
            Output.opInvalida();
        }
        return 4;
    }
}
