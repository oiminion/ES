/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Catalogo.FuncionariosCatalogo;
import Catalogo.ProdutosCatalogo;
import Catalogo.VendasCatalogo;
import Conceitos.Funcionario;
import Conceitos.Produto;
import Terminal.Input;
import Terminal.Output;

/**
 *
 * @author Arthur
 */
public class ControladorFuncionario {
    public ControladorFuncionario()
    {
        
    }
    
    public void FuncionarioAcao(int opcao, Funcionario funcionario)
    {   
        ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        VendasCatalogo catalogo_vendas = VendasCatalogo.getInstance();
        
        if(opcao == -1)
        {
            
        }
        else if(opcao == 1)
        {
            catalogo_produto.relatorioProdutos();
        }
        else if(opcao == 2)
        {
            catalogo_vendas.relatorioVendas();
        }
        else if(opcao == 3)
        {
            String input = Input.getIdentFunc();
            Funcionario func = catalogo_funcionario.getFuncionario(input);
            Output.relatFuncionario(func);
        }
        else if(opcao == 4)
        {
            String input = Input.getIdentProd();
            Produto prod = catalogo_produto.getProduto(input);
            Output.relatProduto(prod);
        }
        else
        {
            Output.opInvalida();
        }
    }
}
