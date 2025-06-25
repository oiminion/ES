/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Conceitos.Cliente;
import Conceitos.Funcionario;
import Terminal.Input;
import Terminal.Output;
import Catalogo.FuncionariosCatalogo;

/**
 *
 * @author Arthur
 */
public class ControladorLogin {
    public ControladorLogin()
    {
    
    }
    
    public Cliente logarUsuario(int opcao)
    {
        FuncionariosCatalogo catalogo = FuncionariosCatalogo.getInstance();
        if(opcao == 1)
        {
            return Cliente.getInstance();
        }
        else if(opcao == 2)
        {
            String nome;
            Funcionario novo;
            do{
                nome = Input.getNomeUsu();
                novo = catalogo.getFuncionario(nome);
            }while(novo == null);
            String senha;
            do{
                senha = Input.getSenha();
            }while(novo.confirmaSenha(senha) == false);
            return novo;
        }
        else if(opcao == -1)
        {
            return null;
        }
        else
        {
            Output.opInvalida();
        }
        return null;
    }
    
}
