/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Catalogo.FuncionariosCatalogo;
import Catalogo.ProdutosCatalogo;
import Conceitos.Funcionario;
import Conceitos.Gerente;
import Conceitos.Produto;
import Terminal.Input;
import Terminal.Output;

/**
 *
 * @author Arthur
 */
public class ControladorGerente {
    
    public ControladorGerente()
    {
    
    }
    
    public void GerenteAcao(int opcao, Gerente gerente)
    {
        ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        if(opcao == -1)
        {
            
        }
        else if(opcao == 1)
        {
            String nome = Input.getNomeFunc();
            String CPF = Input.getCPFFunc();
            String email = Input.getEmailFunc();
            String senha = Input.getSenha();
            float salario = Input.getSalarioFunc();
            gerente.cadastrarFuncionario(nome, CPF, email, senha, salario, null);
        }
        else if(opcao == 2)
        {
            String CUP = Input.getCUP();
            String Nome = Input.getNomeProd();
            float Preco = Input.getPreco();
            String Especificacao = Input.getEspec();
            int Quantidade = Input.getQuantidade();
            gerente.cadastrarProduto(CUP, Quantidade, Nome, Preco, Especificacao);
        }
        else if(opcao == 3)
        {
            catalogo_produto.relatorioProdutos();
        }
        else if(opcao == 4)
        {
            String input = Input.getIdentFunc();
            Funcionario func = catalogo_funcionario.getFuncionario(input);
            Output.relatFuncionario(func);
        }
        else if(opcao == 5)
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
