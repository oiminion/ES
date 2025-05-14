/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro.Usuarios;

import Terminal.Output;
import java.util.ArrayList;
import primeiro.Banco.Banco;
import primeiro.Objetos.Produto;
import primeiro.Objetos.Pagamento;
/**
 *
 * @author Arthur
 */
public class Cliente {
    private static Cliente instance;
    protected Banco banco;
    private Pagamento pagamento;
    
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
    
    public void addCarrinho(Produto prod)
    {
        boolean flag = true;
        for(Produto p : Carrinho)
        {
            if(p.compare(prod.getCUP()))
            {
                p.add();
                flag = false;
            }
        }
        if(flag)
        {
            Carrinho.add(prod.criarProdutoCarrinho());
        }
    }
    
    public void relatCarrinho()
    {
        float total = 0;
        for(Produto p : Carrinho)
        {
            total += p.getValor();
            Output.relatProduto(p);
        }
        System.out.println("Valor total: " + Float.toString(total));
    }
    
    public void finalizarCompra()
    {
        
        float total = 0;
        for(Produto p : Carrinho)
        {
            total += p.getValor();
            Output.relatProduto(p);
        }
        System.out.println("Valor total a pagar: " + Float.toString(total));
        
        pagamento = new Pagamento(total);
        
        while( !pagamento.confirmado() ){
            System.out.println("Pagamento inválido, por favor pague novamente");
        }
        System.out.println("Pagado com sucesso!");
    }
}
