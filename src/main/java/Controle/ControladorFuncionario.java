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
        if(opcao == -1)
        {
            
        }
        else if(opcao == 1)
        {
            ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
            String relatorio = catalogo_produto.relatorioProdutos();
            Output.showOutput(relatorio);
        }
        else if(opcao == 2)
        {
            VendasCatalogo catalogo_vendas = VendasCatalogo.getInstance();
            String relatorio = catalogo_vendas.relatorioVendas();
            Output.showOutput(relatorio);
        }
        else if(opcao == 3)
        {
            String input = Input.getIdentFunc();
            FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
            Funcionario func = catalogo_funcionario.getFuncionario(input);
            Output.showOutput(func.getRelat());
        }
        else if(opcao == 4)
        {
            String input = Input.getIdentProd();
            ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
            Produto prod = catalogo_produto.getProduto(input);
            if(prod != null)
            {
                Output.showOutput(prod.getRelat());
            }
            else
            {
                Output.produtoNaoEncontrado();
            }
            
        }
        else if(opcao == 5)
        {
            String senha = Input.getSenha();
            String nova_senha = Input.getNovaSenha();
            funcionario.mudarSenha(senha, nova_senha);
        }
        else
        {
            Output.opInvalida();
        }
    }
}
