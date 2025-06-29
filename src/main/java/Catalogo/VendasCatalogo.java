/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Conceitos.Venda;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class VendasCatalogo {
    private static VendasCatalogo instance;
    private ArrayList<Venda> Vendas;

    private VendasCatalogo()
    {
        Vendas = new ArrayList<>();
    }

    public static VendasCatalogo getInstance()
    {
        if(instance == null)
        {
            instance = new VendasCatalogo();
        }
        return instance;
    }
    
    public Venda getVenda(String input)
    {
        for(Venda venda : Vendas)
        {
            if(venda.compare(input))
            {
                return venda;
            }
        }
        return null;
    }
    
    public void addVenda(Venda venda)
    {
        Vendas.add(venda);
    }   
    
    public String relatorioVendas()
    {
        String result = "Vendas:\n";
        for(Venda venda : Vendas)
        {
            result += venda.getRelat();
        }
        return result;
    }
    
    private String getVendasJSON()
    {
        String resultado = "Vendas:[";
        for(Venda venda : Vendas)
        {
            resultado += venda.toJSON();
            resultado += ",";
        }
        if(resultado.endsWith(","))
        {
            resultado = resultado.substring(0, resultado.length() - 1);
        }
        resultado += "]";
        
        return resultado;
    }
    
    public String toJSON()
    {   
        return getVendasJSON();
    }
}
