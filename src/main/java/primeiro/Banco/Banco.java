/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro.Banco;

import Terminal.Output;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import primeiro.Objetos.Produto;
import primeiro.Usuarios.Funcionario;

/**
 *
 * @author Arthur
 */
public class Banco {
    private static Banco instance;
    private UUID Sessao;
    private ArrayList<Produto> Produtos;
    private ArrayList<Funcionario> Funcionarios;

    private Banco()
    {
        Produtos = new ArrayList<>();
        Funcionarios = new ArrayList<>();
    }

    public static Banco getInstance()
    {
        if(instance == null)
        {
            instance = new Banco();
        }
        return instance;
    }
    
    public void mudarSessao()
    {
        this.Sessao = UUID.randomUUID();
    }
    
    public UUID getSessao()
    {
        return Sessao;
    }
    
    public Produto getProduto(String input)
    {
        for(Produto prod : Produtos)
        {
            if(prod.compare(input))
            {
                return prod;
            }
        }
        System.err.println("Produto nao encontrado\n");
        return null;
    }
    
    public Funcionario getFuncionario(String input)
    {
        for(Funcionario func : Funcionarios)
        {
            if(func.compare(input))
            {
                return func;
            }
        }
        return null;
    }
    
    public void addProduto(String CUP, int Quantidade, String Nome, float Preco, String Especificacao)
    {
        boolean flag = true;
        for(Produto p : Produtos)
        {
            if(p.compare(CUP))
            {
                p.add();
                flag = false;
            }
        }
        if(flag)
        {
            Produto prod = new Produto(CUP, Quantidade, Nome, Preco, Especificacao);
            Produtos.add(prod);
        }
    }
    
    public void addFuncionario(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        Funcionario func = new Funcionario(Nome, CPF, Email, Senha, Salario, Categorias);
        Funcionarios.add(func);
    }
    
    public void addFuncionario(Funcionario func)
    {
        Funcionarios.add(func);
    }
    
    public void relatProds()
    {
        for(Produto prod : Produtos)
        {
            Output.relatProduto(prod);
        }
    }
}
