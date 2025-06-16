/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import Factory.ProdutoFactory;

/**
 *
 */
public class Produto{
    private String CUP;
    private int Quantidade;
    private String Nome;
    private float Preco;
    private String Especificacao;
    
    private Produto()
    {
    
    }
    
    public Produto(String CUP, int Quantidade, String Nome, float Preco, String Especificacao)
    {
        this.CUP = CUP;
        this.Quantidade = Quantidade;
        this.Nome = Nome;
        this.Preco = Preco;
        this.Especificacao = Especificacao;
    }
    
    public boolean compare(String input)
    {
        return (input.equals(Nome) || input.equals(CUP));
    }
    
    public boolean compare(Produto prod)
    {
        return this.CUP.equals(prod.getCUP());
    }
    
    public String getRelat()
    {
        String result = "\nNome: " + Nome;
        result += "\nPreco: " + Float.toString(Preco);
        result += "\nQuantidade: " + Integer.toString(Quantidade);
        result += "\nCUP: " + CUP;
        result += "\nEspecificação: " + Especificacao + "\n";
        return result;
    }
    
    public void add()
    {
        Quantidade += 1;
    }
    
    public void add(int valor)
    {
        Quantidade += valor;
    }
    
    public boolean temNoEstoque()
    {
        return (Quantidade >= 1);
    }
    
    public boolean remove(Produto prod)
    {
        Quantidade -= prod.getQuantidade();
        return Quantidade == 0;
    }
    
    public int getQuantidade()
    {
        return this.Quantidade;
    }
    
    public String getNome()
    {
        return this.Nome;
    }
    
    public String getCUP()
    {
        return this.CUP;
    }
    
    public float getValor()
    {
        return Preco * Quantidade;
    }
    
    public Produto criarProdutoCarrinho()
    {
        if(temNoEstoque())
        {
            ProdutoFactory fac = new ProdutoFactory();
            return fac.criarProdutoCarrinho(CUP, Nome, Preco, Especificacao);
        }
        return null;
    }
    
    public String toJSON()
    {
        String result = "{CUP:" + CUP + ",";
        result += "Quantidade:" + Integer.toString(Quantidade) + ",";
        result += "Nome:" + Nome + ",";
        result += "Preco:" + Float.toString(Preco) + ",";
        result += "Especificacao:" + Especificacao + "}";
        
        return result;
    }
}
