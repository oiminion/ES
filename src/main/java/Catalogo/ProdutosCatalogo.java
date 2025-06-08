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
    
    public void addProduto(String CUP, int Quantidade, String Nome, float Preco, String Especificacao)
    {
        boolean flag = true;
        for(Produto p : Produtos)
        {
            if(p.compare(CUP))
            {
                p.add();
                flag = false;
            }
        }
        if(flag)
        {
            Produto prod = new Produto(CUP, Quantidade, Nome, Preco, Especificacao);
            Produtos.add(prod);
        }
    }
    
    public void relatorioProdutos()
    {
        for(Produto prod : Produtos)
        {
            Output.relatProduto(prod);
        }
    }
}
