/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Catalogo.VendasCatalogo;

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
}
