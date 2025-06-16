/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Catalogo.FuncionariosCatalogo;
import Conceitos.Gerente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Arthur
 */
public class GerenteFactory {
    public GerenteFactory()
    {}
    
    public Gerente criarGerente(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        Gerente novo = new Gerente(Nome, CPF, Email, Senha, Salario, Categorias);
        catalogo_funcionario.addGerente(novo);
        return novo;
    }
    
    public Gerente lerGerente(String Nome, String CPF, UUID ID, String Email, String Senha, float Salario, LocalDate DataEmpregacao, ArrayList<String> Categorias)
    {
        FuncionariosCatalogo catalogo_funcionario = FuncionariosCatalogo.getInstance();
        Gerente novo = new Gerente(Nome, CPF, ID, Email, Senha, Salario, DataEmpregacao, Categorias);
        catalogo_funcionario.addGerente(novo);
        return novo;
    }
}
