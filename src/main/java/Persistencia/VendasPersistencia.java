/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Catalogo.VendasCatalogo;
import Factory.VendaFactory;
import java.time.LocalDateTime;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Arthur
 */
public class VendasPersistencia {
    public static String getVendasJSON()
    {
        VendasCatalogo catalogo = VendasCatalogo.getInstance();
        return catalogo.toJSON();
    }
    
    public static void getVendasCatalogo(JSONArray arr)
    {
        VendaFactory facV = new VendaFactory();
        
        for(int i = 0; i < arr.length(); i++)
        {
            JSONObject obj = arr.getJSONObject(i);
            
            UUID ID = UUID.fromString(obj.getString("ID"));;
            JSONArray carrinho = obj.getJSONArray("Carrinho");
            LocalDateTime data = LocalDateTime.parse(obj.getString("Data").replace('?', ':'));
            float pagamento = obj.getFloat("Preco");
            
            facV.lerVenda(ID, carrinho, data, pagamento);
                    
        }
    }
}
