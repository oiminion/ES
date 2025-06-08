/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import java.time.LocalDate;
import java.util.ArrayList;
import Catalogo.Banco;
import Catalogo.FuncionariosCatalogo;
import Catalogo.ProdutosCatalogo;

/**
 *
 */
public class Gerente extends Funcionario{
    
    public Gerente(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        super(Nome, CPF, Email, Senha, Salario, Categorias);
        banco = Banco.getInstance();
    }
    
    public void cadastrarProduto(String CUP, int Quantidade, String Nome, float Preco, String Especificacao)
    {
        ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
        catalogo_produto.addProduto(CUP, Quantidade, Nome, Preco, Especificacao);
    }
    
    public void cadastrarFuncionario(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        catalogo_funcionario.addFuncionario(Nome, CPF, Email, Senha, Salario, Categorias);
    }
    
    public Funcionario getFuncionario(String input)
    {
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        return catalogo_funcionario.getFuncionario(input);
    }
}
