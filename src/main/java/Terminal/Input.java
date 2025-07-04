/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terminal;
import java.util.Scanner;
/**
 *
 */
public class Input {
    
    private static Scanner scan;
    
    public static Scanner getInstance()
    {
        if(scan == null)
        {
            scan = new Scanner(System.in);
        }
        return scan;
    }
        
    
    public static String getString()
    {
        getInstance();
        return scan.nextLine();
    }
    
    public static String getNomeUsu()
    {
        System.out.println("Digite o nome do usuario:");
        return getString();
    }
    
    public static String getIdentProd()
    {
        System.out.println("Digite o nome ou CUP do produto:");
        return getString();
    }
    
    public static String getIdentFunc()
    {
        System.out.println("Digite o nome ou ID do usuário:");
        return getString();
    }
    
    public static String getNome()
    {
        System.out.println("Digite o nome do usuario:");
        return getString();
    }
    
    public static String getCPFFunc()
    {
        System.out.println("Digite o CPF do funcionario:");
        return getString();
    }
    
    public static String getEmailFunc()
    {
        System.out.println("Digite o email do funcionario:");
        return getString();
    }
    
    public static float getSalarioFunc()
    {
        System.out.println("Digite o salário do funcionario:");
        return Float.parseFloat(getString());
    }
    
    public static String getCPF()
    {
        System.out.println("Digite o CPF do usuario:");
        return getString();
    }
    
    public static String getNomeFunc()
    {
        System.out.println("Digite o nome do funcionario:");
        return getString();
    }
    
    public static String getSenha()
    {
        System.out.println("Digite a senha:");
        return getString();
    }
    
    public static String getNovaSenha()
    {
        System.out.println("Digite a nova senha:");
        return getString();
    }
    
    public static String getNomeProd()
    {
        System.out.println("Digite o nome do produto:");
        return getString();
    }
    
    public static String getCUP()
    {
        System.out.println("Digite o código universal do produto:");
        return getString();
    }
    
    public static float getPreco()
    {
        System.out.println("Digite o preço do produto:");
        return Float.parseFloat(getString());
    }
    
    public static String getEspec()
    {
        System.out.println("Digite a especificação do produto:");
        return getString();
    }
    
    public static int getQuantidade()
    {
        System.out.println("Digite a quantidade do produto:");
        return Integer.parseInt(getString());
    }
    
    public static int getMenuLogin()
    {
        System.out.println("Digite a opcao desejada:");
        System.out.println("""
                           1 : login cliente
                           2 : login funcionario
                           -1: sair""");
        return Integer.parseInt(getString());   
    }
    
    public static int getMenuCliente()
    {
        System.out.println("Digite a opcao desejada:");
        System.out.println("""
                           1 : buscar produto
                           2 : comprar produtos
                           -1: logout""");
        return Integer.parseInt(getString());   
    }
    
    public static int getMenuClienteCompra()
    {
        System.out.println("\nDigite a opcao desejada:");
        System.out.println("""
                           1 : adicionar produto
                           2 : ver produtos
                           3 : finalizar compra
                           -2: sair""");
        return Integer.parseInt(getString());   
             
    }
    
    public static int getMenuFuncionario()
    {
        System.out.println("Digite a opcao desejada:");
        System.out.println("""
                           1 : relatorio de produtos
                           2 : relatorio de vendas
                           3 : buscar funcionario
                           4 : buscar produto
                           5 : mudar senha
                           -1: logout""");
        return Integer.parseInt(getString());   
    }
    
    public static int getMenuGerente()
    {
        System.out.println("Digite a opcao desejada:");
        System.out.println("""
                           1 : cadastrar funcionario
                           2 : cadastrar produto
                           3 : relatorio de produtos
                           4 : relatorio de vendas
                           5 : buscar funcionario
                           6 : buscar produto
                           7 : mudar senha
                           -1: logout""");
        return Integer.parseInt(getString());   
    }
    
    public static float getPagamento()
    {
        System.out.println("Insira o valor que se pagou: ");
        return Float.parseFloat(getString()); 
    }
    
    public static String getCPFGer()
    {
        System.out.println("Digite o CPF do gerente:");
        return getString();
    }
    
    public static String getEmailGer()
    {
        System.out.println("Digite o email do gerente:");
        return getString();
    }
    
    public static float getSalarioGer()
    {
        System.out.println("Digite o salário do gerente:");
        return Float.parseFloat(getString());
    }
    
    public static String getNomeGer()
    {
        System.out.println("Digite o nome do gerente:");
        return getString();
    }
}
