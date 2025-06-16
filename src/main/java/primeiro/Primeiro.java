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
        
        PersistenciaGeral.lerJSON();
        
        FuncionariosCatalogo catalogo_funcionarios = FuncionariosCatalogo.getInstance();
        Menu menu = new Menu();
        /*
        FuncionarioFactory facF = new FuncionarioFactory();
        facF.criarFuncionario("Func", "CPF", "email", "12345", 0, null);
        */
        //
        Cliente logado =  catalogo_funcionarios.getFuncionario("Dono");

        banco.mudarSessao();
        /*
        ProdutoFactory facP = new ProdutoFactory();
        facP.criarProdutoEstoque("P1", 1, "NomeP1", 10, null);
        
        Carrinho c = new Carrinho();
        c.addCarrinho(facP.criarProdutoCarrinho("P2", "NomeP2", 20, null));
        Pagamento pa = new Pagamento(10);
        
        VendaFactory facV = new VendaFactory();
        facV.criarVenda(c,pa);
        */
        
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
        //PersistenciaGeral.escreverJSON();
    }
}
