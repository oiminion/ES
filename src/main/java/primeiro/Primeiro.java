/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package primeiro;

import Terminal.Input;
import Terminal.Menu;
import Terminal.Output;
import Conceitos.Cliente;
import java.util.UUID;
import Catalogo.Banco;
import Catalogo.FuncionariosCatalogo;
import Conceitos.Funcionario;
import Conceitos.Gerente;

/**
 *
 * @author Arthur
 */
public class Primeiro {

    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        FuncionariosCatalogo catalogo_funcionarios = FuncionariosCatalogo.getInstance();
        Menu menu = new Menu();
        
        Cliente logado = new Gerente("Dono", "CPF", "email", "12345", 0, null);
        banco.mudarSessao();
        catalogo_funcionarios.addFuncionario((Gerente)logado);
        boolean parar = false;
        while(!parar)
        {
            if(logado == null)
            {
                logado = menu.menuLogin(banco);
                if(logado == null)
                {
                    parar = true;
                }
            }
            else if(logado instanceof Gerente)
            {
                System.out.println("GERENTE");
                logado = menu.menuGerente((Gerente)logado);
            }
            else if(logado instanceof Funcionario)
            {
                System.out.println("FUNCIONARIO");
                logado = menu.menuFuncionario((Funcionario)logado);
            }
            else if(logado instanceof Cliente)
            {
                System.out.println("CLIENTE");
                logado = menu.menuCliente(logado);
            }
        }
    }
}
