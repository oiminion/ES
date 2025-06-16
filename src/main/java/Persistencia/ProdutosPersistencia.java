/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Catalogo.ProdutosCatalogo;
import Factory.ProdutoFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Arthur
 */
class ProdutosPersistencia {
     public static String getProdutosJSON()
    {
        ProdutosCatalogo catalogo = ProdutosCatalogo.getInstance();
        return catalogo.toJSON();
    }
     
     public static void getProdutosCatalogo(JSONArray arr)
     {
         ProdutoFactory facP = new ProdutoFactory();
        
        for(int i = 0; i < arr.length(); i++)
        {
            JSONObject obj = arr.getJSONObject(i);
            
            String CUP = obj.getString("CUP");
            int Quantidade = obj.getInt("Quantidade");
            String Nome = obj.getString("Nome");
            float Preco = obj.getFloat("Preco");
            String Especificacao = obj.getString("Especificacao");
            
            facP.criarProdutoEstoque(CUP, Quantidade, Nome, Preco, Especificacao);
                    
        }
     }
}
