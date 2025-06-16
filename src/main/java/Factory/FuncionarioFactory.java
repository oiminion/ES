/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Catalogo.FuncionariosCatalogo;
import Conceitos.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class FuncionarioFactory {
    public FuncionarioFactory()
    {}
    
    public Funcionario criarFuncionario(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        Funcionario novo = new Funcionario(Nome, CPF, Email, Senha, Salario, Categorias);
        catalogo_funcionario.addFuncionario(novo);
        return novo;
    }
}
