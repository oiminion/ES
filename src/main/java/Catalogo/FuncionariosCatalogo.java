/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.ArrayList;
import Conceitos.Funcionario;

/**
 *
 * @author Arthur
 */
public class FuncionariosCatalogo {
    private static FuncionariosCatalogo instance;
    private ArrayList<Funcionario> Funcionarios;

    private FuncionariosCatalogo()
    {
        Funcionarios = new ArrayList<>();
    }

    public static FuncionariosCatalogo getInstance()
    {
        if(instance == null)
        {
            instance = new FuncionariosCatalogo();
        }
        return instance;
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
    
    public void addFuncionario(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        Funcionario func = new Funcionario(Nome, CPF, Email, Senha, Salario, Categorias);
        Funcionarios.add(func);
    }
    
    public void addFuncionario(Funcionario func)
    {
        Funcionarios.add(func);
    }
}
