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
import Catalogo.Banco;

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
        Banco banco = Banco.getInstance();
        if(opcao == 1)
        {
            banco.mudarSessao();
            return Cliente.getInstance();
        }
        else if(opcao == 2)
        {
            String nome = Input.getNomeUsu();
            Funcionario novo = catalogo.getFuncionario(nome);
            while(novo == null)
            {
                novo = catalogo.getFuncionario(nome);
            }
            String senha = Input.getSenha();
            boolean flag = false;
            while(!flag)
            {
                if(novo.confirmaSenha(senha))
                {
                    flag = true;
                }
            }
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
