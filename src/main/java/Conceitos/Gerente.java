/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import java.time.LocalDate;
import java.util.ArrayList;
import Catalogo.FuncionariosCatalogo;
import java.util.UUID;

/**
 *
 */
public class Gerente extends Funcionario{
    
    public Gerente(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        super(Nome, CPF, Email, Senha, Salario, Categorias);
    }

    public Gerente(String Nome, String CPF, UUID ID, String Email, String Senha, float Salario, LocalDate DataEmpregacao, ArrayList<String> Categorias) {
        super(Nome, CPF, ID, Email, Senha, Salario, DataEmpregacao, Categorias);
    }
    
    public Funcionario getFuncionario(String input)
    {
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        return catalogo_funcionario.getFuncionario(input);
    }
}
