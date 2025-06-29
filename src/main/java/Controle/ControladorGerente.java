/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Catalogo.FuncionariosCatalogo;
import Catalogo.ProdutosCatalogo;
import Catalogo.VendasCatalogo;
import Conceitos.Funcionario;
import Conceitos.Gerente;
import Conceitos.Produto;
import Factory.FuncionarioFactory;
import Factory.GerenteFactory;
import Factory.ProdutoFactory;
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
            FuncionarioFactory fac = new FuncionarioFactory();
            fac.criarFuncionario(nome, CPF, email, senha, salario, null);
        }
        else if(opcao == 2)
        {
            String CUP = Input.getCUP();
            String Nome = Input.getNomeProd();
            float Preco = Input.getPreco();
            String Especificacao = Input.getEspec();
            int Quantidade = Input.getQuantidade();
            ProdutoFactory fac = new ProdutoFactory();
            fac.criarProdutoEstoque(CUP, Quantidade, Nome, Preco, Especificacao);
        }
        else if(opcao == 3)
        {
            ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
            String relatorio = catalogo_produto.relatorioProdutos();
            Output.showOutput(relatorio);
        }
        else if(opcao == 4)
        {
            VendasCatalogo catalogo_venda = VendasCatalogo.getInstance();
            String relatorio = catalogo_venda.relatorioVendas();
            Output.showOutput(relatorio);
        }
        else if(opcao == 5)
        {
            FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
            String input = Input.getIdentFunc();
            Funcionario func = catalogo_funcionario.getFuncionario(input);
            Output.showOutput(func.getRelat());
        }
        else if(opcao == 6)
        {
            ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
            String input = Input.getIdentProd();
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
        else if(opcao == 7)
        {
            String senha = Input.getSenha();
            String nova_senha = Input.getNovaSenha();
            gerente.mudarSenha(senha, nova_senha);
        }
        else
        {
            Output.opInvalida();
        }
    }
    
    public Gerente CriarDono()//esse está aqui, pq n vai dar para implementar criar gerente
    {
        String nome = Input.getNomeGer();
        String CPF = Input.getCPFGer();
        String email = Input.getEmailGer();
        String senha = Input.getSenha();
        float salario = Input.getSalarioGer();
        GerenteFactory facG = new GerenteFactory();
        return facG.criarGerente(nome, CPF, email, senha, salario, null);
    }
}
