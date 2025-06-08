/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Gerente;

/**
 *
 * @author Arthur
 */
public class ControladorCentral {
    ControladorCliente controlador_cliente = new ControladorCliente();
    ControladorFuncionario controlador_funcionario = new ControladorFuncionario();
    ControladorGerente controlador_gerente = new ControladorGerente();
    ControladorLogin controlador_login = new ControladorLogin();
    
    public ControladorCentral()
    {
    
    }
    
    public Cliente Login(int opcao)
    {
        return controlador_login.logarUsuario(opcao);
    }
    
    public void ClienteAcao(int opcao, Cliente cliente)
    {
        controlador_cliente.ClienteAcao(opcao, cliente);
    }
    
    public void ClienteCompra(int opcao, Cliente cliente)
    {
        controlador_cliente.ClienteCompra(opcao, cliente);

    }
    
    public void FuncionarioAcao(int opcao, Funcionario funcionario)
    {
        controlador_funcionario.FuncionarioAcao(opcao,funcionario);
    }
    
    public void GerenteAcao(int opcao, Gerente gerente)
    {
        controlador_gerente.GerenteAcao(opcao,gerente);
    }
}
