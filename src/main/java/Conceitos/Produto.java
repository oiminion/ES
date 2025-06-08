/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

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
            return new Produto(CUP, 1, Nome, Preco, Especificacao);
        }
        return null;
    }
}
