/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Conceitos.Produto;
import Terminal.Input;
import Terminal.Output;
import Catalogo.ProdutosCatalogo;
import Conceitos.Carrinho;
import Conceitos.Cliente;
import Conceitos.Pagamento;
import Conceitos.Venda;
import Factory.VendaFactory;

/**
 *
 * @author Arthur
 */
public class ControladorCliente {
    public ControladorCliente()
    {
    
    }
    
    public void ClienteAcao(int opcao, Cliente cliente)
    {
        ProdutosCatalogo catalogo = ProdutosCatalogo.getInstance();
        if(opcao == -1)
        {
            
        }
        else if(opcao == 1)
        {
            String input = Input.getIdentProd();
            Produto prod = catalogo.getProduto(input);
            Output.relatProduto(prod);
        }
        else if(opcao == 2)
        {
            
        }
    }
    
    public void ClienteCompra(int opcao, Cliente cliente)
    {
        ProdutosCatalogo catalogo = ProdutosCatalogo.getInstance();
        Carrinho carrinho = new Carrinho();
        
        if(opcao == 1)
        {
            // adicionar produto
            String input = Input.getIdentProd();
            Produto prod = catalogo.getProduto(input);
            if( prod != null )
            {
                carrinho.addCarrinho(prod);
            }
        }
        if(opcao == 2)
        { // ver produtos

            carrinho.relatCarrinho();
        }
        if(opcao == 3)
        { // finalizar compra

            float total = carrinho.finalizarCompra();
            Pagamento pagamento = new Pagamento(total);
            
            while( !pagamento.confirmado() ){
                Output.pagamentoFalha();
            }
            
            Output.pagamentoCompleto();
            
            carrinho.comprar();
            
            VendaFactory fac = new VendaFactory();
            Venda venda = fac.criarVenda(carrinho,pagamento);
            Output.codigoCompra(venda.getID());
        }
        else
        {
            Output.opInvalida();
        }
    }
}
