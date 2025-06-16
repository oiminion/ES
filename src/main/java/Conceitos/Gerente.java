/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import java.time.LocalDate;
import java.util.ArrayList;
import Catalogo.FuncionariosCatalogo;
import Catalogo.ProdutosCatalogo;
import Factory.FuncionarioFactory;
import Factory.ProdutoFactory;

/**
 *
 */
public class Gerente extends Funcionario{
    
    public Gerente(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        super(Nome, CPF, Email, Senha, Salario, Categorias);
    }
    
    public void cadastrarProduto(String CUP, int Quantidade, String Nome, float Preco, String Especificacao)
    {
        ProdutoFactory fac = new ProdutoFactory();
        fac.criarProdutoEstoque(CUP, Quantidade, Nome, Preco, Especificacao);
    }
    
    public void cadastrarFuncionario(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        FuncionarioFactory fac = new FuncionarioFactory();
        fac.criarFuncionario(Nome, CPF, Email, Senha, Salario, Categorias);
    }
    
    public Funcionario getFuncionario(String input)
    {
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        return catalogo_funcionario.getFuncionario(input);
    }
}
