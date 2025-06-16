/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Factory.GerenteFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author Arthur
 */
public class PersistenciaGeral {
    public static void escreverJSON()
    {
        String resultado = "{" + FuncionariosPersistencia.getFuncionariosJSON() + ",";
        resultado += ProdutosPersistencia.getProdutosJSON() + ",";
        resultado += VendasPersistencia.getVendasJSON();
        resultado += "}";
        
        System.out.println(resultado);
        
        JSONObject ojt = new JSONObject(resultado);
        
        try (FileWriter file = new FileWriter("Dados.json")) {
            file.write(ojt.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean lerJSON()
    {
        try (FileReader fileReader = new FileReader("Dados.json");
            
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String resultado = bufferedReader.readLine();
            
            JSONObject ojt = new JSONObject(resultado);
            
            System.out.println(ojt);
            
            if(ojt.isEmpty())
            {
                return false;
            }
            else
            {
                FuncionariosPersistencia.getFuncionariosCatalogo(ojt.getJSONObject("FuncionariosCatalogo"));
                ProdutosPersistencia.getProdutosCatalogo(ojt.getJSONArray("Produtos"));
                VendasPersistencia.getVendasCatalogo(ojt.getJSONArray("Vendas"));
                return true;
            }
        } catch (IOException e) {
            return false;
        }
    }
}
