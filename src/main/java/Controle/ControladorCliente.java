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
        if(opcao == 1)
        {
            // adicionar produto
            String input = Input.getIdentProd();
            Produto prod = catalogo.getProduto(input);
            if( prod != null )
            {
                cliente.addCarrinho(prod);
            }
        }
        if(opcao == 2)
        { // ver produtos

            cliente.relatCarrinho();
        }
        if(opcao == 3)
        { // finalizar compra

            cliente.finalizarCompra();
        }
        else
        {
            Output.opInvalida();
        }
    }
}
