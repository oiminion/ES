/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import Catalogo.ProdutosCatalogo;
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
        Output.valorTotal(total);
    }
    
    public float finalizarCompra()
    {
        
        float total = calcularTotal();
        Output.relatCompra(total);
        return total;
    }
    
    public void comprar()
    {
        ProdutosCatalogo catalogo = ProdutosCatalogo.getInstance();
        for(Produto p : conteudo)
        {
            catalogo.removeProduto(p);
        }
    }
    
    public String getRelat()
    {
        String result = "Carrinho:\n";
        for(Produto p : conteudo)
        {
            result += p.getRelat() + "\n\n";
        }
        float total = calcularTotal();
        
        result += "Valor total: " + Float.toString(total) + "\n";
        
        return result;
    }
    
    public String toJSON()
    {
        String resultado = "Carrinho:[";
        for(Produto prod : conteudo)
        {
            resultado += prod.toJSON();
            resultado += ",";
        }
        if(resultado.endsWith(","))
        {
            resultado = resultado.substring(0, resultado.length() - 1);
        }
        resultado += "]";
        
        return resultado;
    }
}
