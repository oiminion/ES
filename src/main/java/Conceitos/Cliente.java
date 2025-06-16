/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;

import java.util.ArrayList;
import Catalogo.Banco;

/**
 *
 * @author Arthur
 */
public class Cliente {
    private static Cliente instance;
    protected Banco banco;
    
    protected ArrayList<Produto> Carrinho;
    
    protected Cliente()
    {
        banco = Banco.getInstance();
        Carrinho = new ArrayList<>();
    }

    public static Cliente getInstance()
    {
        if(instance == null)
        {
            instance = new Cliente();
        }
        return instance;
    }
}
