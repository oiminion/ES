/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Conceitos.Carrinho;
import Conceitos.Pagamento;
import Conceitos.Venda;
import Terminal.Output;
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
    
    public void addVenda(Carrinho carrinho, Pagamento pagamento)
    {
        Venda venda = new Venda(carrinho, pagamento);
        Vendas.add(venda);
    }
    
    public void addVenda(Venda venda)
    {
        Vendas.add(venda);
    }   
    
    public void relatorioVendas()
    {
        for(Venda venda : Vendas)
        {
            Output.relatVenda(venda);
        }
    }
}
