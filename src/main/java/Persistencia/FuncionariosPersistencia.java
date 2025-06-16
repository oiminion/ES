/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Catalogo.FuncionariosCatalogo;
import Factory.FuncionarioFactory;
import Factory.GerenteFactory;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Arthur
 */
public class FuncionariosPersistencia {
    public static String getFuncionariosJSON()
    {
        FuncionariosCatalogo catalogo = FuncionariosCatalogo.getInstance();
        return catalogo.toJSON();
    }
    
    private static void getFuncionarios(JSONArray arr)
    {
        FuncionarioFactory facF = new FuncionarioFactory();
        
        for(int i = 0; i < arr.length(); i++)
        {
            JSONObject obj = arr.getJSONObject(i);
            
            String Nome = obj.getString("Nome");
            String CPF = obj.getString("CPF");
            UUID ID = UUID.fromString(obj.getString("ID"));
            String Email = obj.getString("Email");
            String Senha = obj.getString("Senha");
            Senha = Senha.substring(0, Senha.length() - 1);
            float Salario = obj.getFloat("Salario");
            LocalDate DataEmpregacao = LocalDate.parse(obj.getString("Data_empregacao"));
            ArrayList<String> Categorias = null;
            
            facF.lerFuncionario(Nome, CPF, ID, Email, Senha, Salario, DataEmpregacao, Categorias);
                    
        }
    }
    
    private static void getGerentes(JSONArray arr)
    {
        GerenteFactory facG = new GerenteFactory();
        
        for(int i = 0; i < arr.length(); i++)
        {
            JSONObject obj = arr.getJSONObject(i);
            
            String Nome = obj.getString("Nome");
            String CPF = obj.getString("CPF");
            UUID ID = UUID.fromString(obj.getString("ID"));
            String Email = obj.getString("Email");
            String Senha = obj.getString("Senha");
            Senha = Senha.substring(0, Senha.length() - 1);
            float Salario = obj.getFloat("Salario");
            LocalDate DataEmpregacao = LocalDate.parse(obj.getString("Data_empregacao"));
            ArrayList<String> Categorias = null;
            
            facG.lerGerente(Nome, CPF, ID, Email, Senha, Salario, DataEmpregacao, Categorias);
                    
        }
    }
    
    public static void getFuncionariosCatalogo(JSONObject obj)
    {
        getFuncionarios(obj.getJSONArray("Funcionarios"));
        getGerentes(obj.getJSONArray("Gerentes"));
    }
}
