/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terminal;

import Conceitos.Produto;
import Conceitos.Funcionario;
import Conceitos.Venda;

/**
 *
 */
public class Output {

    public static void opInvalida()
    {
        System.out.println("Digite uma opcao valida.");
    }
    
    public static void relatProduto(Produto prod)
    {
        System.out.println(prod.getRelat());
    }
    
    public static void relatVenda(Venda venda)
    {
        System.out.println(venda.getRelat());
    }
    
    public static void relatFuncionario(Funcionario func)
    {
        System.out.println(func.getRelat());
    }
    
    public static void relatCompra(float total)
    {
        System.out.println("Valor total a pagar: " + Float.toString(total));
    }
    
    public static void pagamentoFalha()
    {
        System.out.println("Pagamento inválido, por favor pague novamente");
    }
    
    public static void pagamentoCompleto()
    {
        System.out.println("Pagado com sucesso!");
    }
    
    public static void produtoNaoEncontrado()
    {
        System.out.println("Produto nao encontrado\n");
    }
    
    public static void codigoCompra(String ID)
    {
        System.out.println("Código do compra: " + ID + "\n");
    }
    
    public static void valorTotal(float total)
    {
        System.out.println("Valor total: " + Float.toString(total));
    }
}
