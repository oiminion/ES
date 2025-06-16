/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Conceitos.Carrinho;
import Conceitos.Produto;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Arthur
 */
public class CarrinhoFactory {
    public CarrinhoFactory()
    {}
    
    public Carrinho CriarCarrinho()
    {
        Carrinho novo = new Carrinho();
        return novo;
    }
    
    public Carrinho lerCarrinho(JSONArray arr)
    {
        Carrinho novo = CriarCarrinho();
        
        for(int i = 0; i < arr.length(); i++)
        {
            ProdutoFactory facP = new ProdutoFactory();
            
            JSONObject obj = arr.getJSONObject(i);
            
            String CUP = obj.getString("CUP");
            int Quantidade = obj.getInt("Quantidade");
            String Nome = obj.getString("Nome");
            float Preco = obj.getFloat("Preco");
            String Especificacao = obj.getString("Especificacao");
            
            Produto prod = facP.criarProdutoCarrinho(CUP, Nome, Preco, Especificacao);
            for(int j = 0; j < Quantidade; j++)
            {
                novo.addCarrinho(prod);
            }
        }
        return novo;
    }
}
