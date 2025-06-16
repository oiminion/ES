/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Catalogo.ProdutosCatalogo;

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
}
