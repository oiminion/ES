/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro.Usuarios;

import java.time.LocalDate;
import java.util.ArrayList;
import primeiro.Banco.Banco;

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
        banco.addProduto(CUP, Quantidade, Nome, Preco, Especificacao);
    }
    
    public void cadastrarFuncionario(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        banco.addFuncionario(Nome, CPF, Email, Senha, Salario, Categorias);
    }
    
    public Funcionario getFuncionario(String input)
    {
        return banco.getFuncionario(input);
    }
}
