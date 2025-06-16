/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

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
        
        System.out.println("\n\n\n\n\n" + resultado + "\n\n\n\n\n");
        
        JSONObject t = new JSONObject(resultado);
        
        System.out.println(t.toString(5));
        
        /*
        try (FileWriter file = new FileWriter("Dados.json")) {
            file.write(t.toString(5));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
