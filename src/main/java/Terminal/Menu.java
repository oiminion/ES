/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terminal;

import Catalogo.Banco;
import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Gerente;
import Controle.ControladorCentral;


/**
 *
 * @author Arthur
 */
public class Menu {
    
    ControladorCentral controle = new ControladorCentral();
    
    public Menu()
    {
    
    }
    
    public Cliente menuLogin(Banco banco)
    {
        int opcao = 0;
        while(opcao != -1)
        {
            opcao = Input.getMenuLogin();
            return controle.Login(opcao);
        }
        return null;
    }
    
    public boolean subMenuCliente(Cliente cliente)
    {
        int opcao = 0;
        while(opcao != -2)
        {
            opcao = Input.getMenuClienteCompra();
            opcao = controle.ClienteCompra(opcao, cliente);
        }
        return false;
    }
    
    public Cliente menuCliente(Cliente cliente)
    {
        int opcao = 0;
        boolean comprando = false;
        while(opcao != -1)
        {
            opcao = Input.getMenuCliente();
            
            if(!comprando)
            {
                comprando = controle.ClienteAcao(opcao, cliente);
            }
            
            if(comprando)
            {
                comprando = subMenuCliente(cliente);
            }
        }
        return null;
    }
    
    public Funcionario menuFuncionario(Funcionario funcionario)
    {
        int opcao = 0;
        while(opcao != -1)
        {
            opcao = Input.getMenuFuncionario();
            controle.FuncionarioAcao(opcao,funcionario);
        }
        return null;
    }
    
    public Gerente menuGerente(Gerente gerente)
    {
        int opcao = 0;
        while(opcao != -1)
        {
            opcao = Input.getMenuGerente();
            controle.GerenteAcao(opcao, gerente);
        }
        return null;
    }
    
    public Gerente criarDono()
    {
        return controle.CriarDono();
    }
}
