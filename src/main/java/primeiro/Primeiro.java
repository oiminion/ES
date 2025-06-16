/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package primeiro;

import Terminal.Menu;
import Conceitos.Cliente;
import Catalogo.Banco;
import Catalogo.FuncionariosCatalogo;
import Conceitos.Carrinho;
import Conceitos.Funcionario;
import Conceitos.Gerente;
import Conceitos.Pagamento;
import Factory.FuncionarioFactory;
import Factory.GerenteFactory;
import Factory.ProdutoFactory;
import Factory.VendaFactory;
import Persistencia.FuncionariosPersistencia;
import Persistencia.PersistenciaGeral;

/**
 *
 * @author Arthur
 */
public class Primeiro {

    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        Cliente logado = null;
        Menu menu = new Menu();
        
        if(!PersistenciaGeral.lerJSON())
        {
            banco.mudarSessao();
            logado = menu.criarDono();
        }

        
        /*
        FuncionarioFactory facF = new FuncionarioFactory();
        facF.criarFuncionario("Func", "CPF", "email", "12345", 0, null);
        */
        //
        

        banco.mudarSessao();
        
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
        PersistenciaGeral.escreverJSON();
    }
}
