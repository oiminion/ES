/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package primeiro;

import Terminal.Input;
import Terminal.Menu;
import Terminal.Output;
import primeiro.Usuarios.Cliente;
import java.util.UUID;
import primeiro.Banco.Banco;
import primeiro.Usuarios.Funcionario;
import primeiro.Usuarios.Gerente;

/**
 *
 * @author Arthur
 */
public class Primeiro {

    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        
        Cliente logado = new Gerente("Dono", "CPF", "email", "12345", 0, null);
        banco.mudarSessao();
        banco.addFuncionario((Gerente)logado);
        boolean parar = false;
        while(!parar)
        {
            if(logado == null)
            {
                logado = Menu.menuLogin(banco);
                if(logado == null)
                {
                    parar = true;
                }
            }
            else if(logado instanceof Gerente)
            {
                System.out.println("GERENTE");
                logado = Menu.menuGerente((Gerente)logado, banco);
            }
            else if(logado instanceof Funcionario)
            {
                System.out.println("FUNCIONARIO");
                logado = Menu.menuFuncionario((Funcionario)logado, banco);
            }
            else if(logado instanceof Cliente)
            {
                System.out.println("CLIENTE");
                logado = Menu.menuCliente(logado, banco);
            }
        }
    }
}
