/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terminal;

import Conceitos.Produto;
import Conceitos.Funcionario;

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
    
    public static void relatFuncionario(Funcionario func)
    {
        System.out.println(func.getRelat());
    }
}
