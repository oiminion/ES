/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.ArrayList;
import Conceitos.Produto;
import Terminal.Output;

/**
 *
 * @author Arthur
 */
public class ProdutosCatalogo {
    private static ProdutosCatalogo instance;
    private ArrayList<Produto> Produtos;

    private ProdutosCatalogo()
    {
        Produtos = new ArrayList<>();
    }

    public static ProdutosCatalogo getInstance()
    {
        if(instance == null)
        {
            instance = new ProdutosCatalogo();
        }
        return instance;
    }
    
    public Produto getProduto(String input)
    {
        for(Produto prod : Produtos)
        {
            if(prod.compare(input))
            {
                return prod;
            }
        }
        Output.produtoNaoEncontrado();
        return null;
    }
    
    public void addProduto(Produto produto)
    {
        boolean flag = true;
        for(Produto p : Produtos)
        {
            if(p.compare(produto))
            {
                p.add();
                flag = false;
            }
        }
        if(flag)
        {
            Produtos.add(produto);
        }
    }
    
    public void removeProduto(Produto produto)
    {
        for(Produto prod : Produtos)
        {
            if(prod.compare(produto))
            {
                if(prod.remove(produto))
                {
                    Produtos.remove(prod);
                }
            }
        }
    }
    
    public void relatorioProdutos()
    {
        for(Produto prod : Produtos)
        {
            Output.relatProduto(prod);
        }
    }
    
    private String getProdutosJSON()
    {
        String resultado = "Produtos:[";
        for(Produto prod : Produtos)
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
    
    public String toJSON()
    {   
        return getProdutosJSON();
    }
}
