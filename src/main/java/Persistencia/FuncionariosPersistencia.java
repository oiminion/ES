/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Catalogo.FuncionariosCatalogo;
import java.io.FileWriter;
import java.io.IOException;
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
}
