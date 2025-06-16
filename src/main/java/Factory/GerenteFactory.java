/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Catalogo.FuncionariosCatalogo;
import Conceitos.Gerente;
import java.util.ArrayList;

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
}
