/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Catalogo.ProdutosCatalogo;
import Conceitos.Produto;

/**
 *
 * @author Arthur
 */
public class ProdutoFactory {
    public ProdutoFactory()
    {}
    
    public Produto criarProdutoEstoque(String CUP, int Quantidade, String Nome, float Preco, String Especificacao)
    {
        ProdutosCatalogo catalogo_produto = ProdutosCatalogo.getInstance();
        Produto novo = new Produto(CUP, Quantidade, Nome, Preco, Especificacao);
        catalogo_produto.addProduto(novo);
        return novo;
    }
    
    public Produto criarProdutoCarrinho(String CUP, String Nome, float Preco, String Especificacao)
    {
        Produto novo = new Produto(CUP, 1, Nome, Preco, Especificacao);
        return novo;
    }
}
