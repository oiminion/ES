/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terminal;

import primeiro.Banco.Banco;
import primeiro.Objetos.Produto;
import primeiro.Usuarios.Cliente;
import primeiro.Usuarios.Funcionario;
import primeiro.Usuarios.Gerente;

/**
 *
 * @author Arthur
 */
public class Menu {
    public static Cliente menuLogin(Banco banco)
    {
        int opcao = 0;
        while(opcao != -1)
        {
            opcao = Input.getMenuLogin();
            if(opcao == 1)
            {
                banco.mudarSessao();
                return Cliente.getInstance();
            }
            else if(opcao == 2)
            {
                String nome = Input.getNomeUsu();
                Funcionario novo = banco.getFuncionario(nome);
                String senha = Input.getSenha();
                if(novo.confirmaSenha(senha, banco.getSessao()))
                {
                    return novo;
                }
            }
            else
            {
                Output.opInvalida();
            }
        }
        return null;
    }
    
    public static Cliente menuCliente(Cliente cliente, Banco banco)
    {
        int opcao = 0;
        while(opcao != -1)
        {
            opcao = Input.getMenuCliente();
            if(opcao == -1)
            {
                return null;
            }
            else if(opcao == 1)
            {
                String input = Input.getIdentProd();
                Produto prod = banco.getProduto(input);
                Output.relatProduto(prod);
            }
            else if(opcao == 2)
            {
                while(opcao != -2)
                {
                    if(opcao == 1)
                    {
                        String input = Input.getIdentProd();
                        Produto prod = banco.getProduto(input);
                        cliente.addCarrinho(prod);
                    }
                    else if(opcao == 2)
                    {
                        cliente.relatCarrinho();
                    }
                    else
                    {
                        Output.opInvalida();
                    }
                }
            }
        }
        return null;
    }
    
    public static Funcionario menuFuncionario(Funcionario funcionario, Banco banco)
    {
        int opcao = 0;
        while(opcao != -1)
        {
            opcao = Input.getMenuFuncionario();
            if(opcao == -1)
            {
                return null;
            }
            else if(opcao == 1)
            {
                banco.relatProds();
            }
            else if(opcao == 2)
            {
                String input = Input.getIdentFunc();
                Funcionario func = banco.getFuncionario(input);
                Output.relatFuncionario(func);
            }
            else if(opcao == 3)
            {
                String input = Input.getIdentProd();
                Produto prod = banco.getProduto(input);
                Output.relatProduto(prod);
            }
            else
            {
                Output.opInvalida();
            }
        }
        return null;
    }
    
    public static Gerente menuGerente(Gerente gerente, Banco banco)
    {
        int opcao = 0;
        while(opcao != -1)
        {
            opcao = Input.getMenuGerente();
            if(opcao == -1)
            {
                return null;
            }
            else if(opcao == 1)
            {
                String nome = Input.getNomeFunc();
                String CPF = Input.getCPFFunc();
                String email = Input.getEmailFunc();
                String senha = Input.getSenha();
                float salario = Input.getSalarioFunc();
                banco.addFuncionario(nome, CPF, email, senha, salario, null);
            }
            else if(opcao == 2)
            {
                String CUP = Input.getCUP();
                String Nome = Input.getNomeProd();
                float Preco = Input.getPreco();
                String Especificacao = Input.getEspec();
                int Quantidade = Input.getQuantidade();
                banco.addProduto(CUP, Quantidade, Nome, Preco, Especificacao);
            }
            else if(opcao == 3)
            {
                banco.relatProds();
            }
            else if(opcao == 4)
            {
                String input = Input.getIdentFunc();
                Funcionario func = banco.getFuncionario(input);
                Output.relatFuncionario(func);
            }
            else if(opcao == 5)
            {
                String input = Input.getIdentProd();
                Produto prod = banco.getProduto(input);
                Output.relatProduto(prod);
            }
            else
            {
                Output.opInvalida();
            }
        }
        return null;
    }
}
