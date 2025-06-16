/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.ArrayList;
import Conceitos.Funcionario;
import Conceitos.Gerente;

/**
 *
 * @author Arthur
 */
public class FuncionariosCatalogo {
    private static FuncionariosCatalogo instance;
    private ArrayList<Funcionario> Funcionarios;
    private ArrayList<Gerente> Gerentes;

    private FuncionariosCatalogo()
    {
        Funcionarios = new ArrayList<>();
        Gerentes = new ArrayList<>();
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
        for(Gerente gerente : Gerentes)
        {
            if(gerente.compare(input))
            {
                return gerente;
            }
        }
        return null;
    }
    
    private String getFuncionariosJSON()
    {
        String resultado = "Funcionarios:[";
        for(Funcionario func : Funcionarios)
        {
            resultado += func.toJSON();
            resultado += ",";
        }
        if(resultado.endsWith(","))
        {
            resultado = resultado.substring(0, resultado.length() - 1);
        }
        resultado += "]";
        
        return resultado;
    }
    
    private String getGerentesJSON()
    {
        String resultado = "Gerentes:[";
        for(Gerente gerente : Gerentes)
        {
            resultado += gerente.toJSON();
            resultado += ",";
        }
        if(resultado.endsWith(","))
        {
            resultado = resultado.substring(0, resultado.length() - 1);
        }
        resultado += "]";
        
        return resultado;
    }
    
    public String toJSON()
    {
        String resultado = "FuncionariosCatalogo:{";
        resultado += getFuncionariosJSON() + ",";
        resultado += getGerentesJSON() + "}";
        
        return resultado;
    }
    
    public void addFuncionario(Funcionario func)
    {
        Funcionarios.add(func);
    }
    
    public void addGerente(Gerente gerente)
    {
        Gerentes.add(gerente);
    }
}
