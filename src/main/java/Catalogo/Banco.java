/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Terminal.Output;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Arthur
 */
public class Banco {
    private static Banco instance;
    private UUID Sessao;

    private Banco()
    {

    }

    public static Banco getInstance()
    {
        if(instance == null)
        {
            instance = new Banco();
        }
        return instance;
    }
    
    public void mudarSessao()
    {
        this.Sessao = UUID.randomUUID();
    }
    
    public UUID getSessao()
    {
        return Sessao;
    }
    
}
