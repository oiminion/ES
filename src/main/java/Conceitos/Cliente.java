/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import Factory.CarrinhoFactory;

/**
 *
 * @author Arthur
 */
public class Cliente {
    private static Cliente instance;

    protected Carrinho carrinho;
    
    protected Cliente()
    {
        CarrinhoFactory facCarrinho = new CarrinhoFactory();
        carrinho = facCarrinho.CriarCarrinho();
    }

    public static Cliente getInstance()
    {
        if(instance == null)
        {
            instance = new Cliente();
        }
        return instance;
    }
    
    public float getTotal()
    {
        return carrinho.finalizarCompra();
    }
    
    public void comprar()
    {
        carrinho.comprar();
    }
    
    public Carrinho getCarrinho()
    {
        return carrinho;
    }
    
    public void addCarrinho(Produto produto)
    {
        carrinho.addCarrinho(produto);
    }
    
    public String getRelatCarrinho()
    {
        return carrinho.getRelat();
    }
    
    public void resetCarrinho()
    {
        CarrinhoFactory facCarrinho = new CarrinhoFactory();
        carrinho = facCarrinho.CriarCarrinho();
    }
}
