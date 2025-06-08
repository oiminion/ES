/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import Terminal.Output;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Carrinho {
    private ArrayList<Produto> conteudo;
    
    public Carrinho()
    {
        conteudo = new ArrayList<>();
    }
    
    public void addCarrinho(Produto prod)
    {
        boolean flag = true;
        for(Produto p : conteudo)
        {
            if(p.compare(prod.getCUP()))
            {
                p.add();
                flag = false;
            }
        }
        if(flag)
        {
            conteudo.add(prod.criarProdutoCarrinho());
        }
    }
    
    public float calcularTotal()
    {
        float total = 0;
        for(Produto p : conteudo)
        {
            total += p.getValor();
        }
        return total;
    }
    
    public void relatCarrinho()
    {
        for(Produto p : conteudo)
        {
            Output.relatProduto(p);
        }
        float total = calcularTotal();
        System.out.println("Valor total: " + Float.toString(total));
    }
    
    public float finalizarCompra()
    {
        
        float total = calcularTotal();
        Output.relatCompra(total);
        return total;
    }
    
}
