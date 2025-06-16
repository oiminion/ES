/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conceitos;
import java.util.UUID;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author Arthur
 */
public class Funcionario extends Cliente{
    protected String Nome;
    protected String CPF;
    protected UUID ID;
    protected String Email;
    protected String Senha;
    protected float Salario;
    protected LocalDate DataEmpregacao;
    protected ArrayList<String> Categorias;

    public Funcionario(String Nome, String CPF, UUID ID, String Email, String Senha, float Salario, LocalDate DataEmpregacao, ArrayList<String> Categorias) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.ID = ID;
        this.Email = Email;
        this.Senha = Senha;
        this.Salario = Salario;
        this.DataEmpregacao = DataEmpregacao;
        this.Categorias = Categorias;
    }
    
    
    
    public Funcionario(String Nome, String CPF, String Email, String Senha, float Salario, ArrayList<String> Categorias)
    {
        this.Nome = Nome;
        this.CPF = CPF;
        this.ID = UUID.randomUUID();
        this.Email = Email;
        this.Senha = Senha;
        this.Salario = Salario;
        this.DataEmpregacao = LocalDate.now();
        if(Categorias == null)
        {
            this.Categorias = new ArrayList<String>();
        }
        else
        {
            this.Categorias = Categorias;
        }
    }
    
    public void mudarSenha(String senha, UUID sessao)
    {
        if(sessao.equals(banco.getSessao()))
        {
            this.Senha = senha;
        }
    
    }
    
    public boolean compare(String input)
    {
        return (input.equals(Nome) || input.equals(ID.toString()));
    }
    
    public boolean confirmaSenha(String input)
    {
        return (input.equals(Senha));
    }
    
    public String toJSON()
    {
        String result = "{Nome:" + Nome + ",";
        result += "CPF:" + CPF + ",";
        result += "ID:" + ID.toString() + ",";
        result += "Email:" + Email + ",";
        result += "Senha:" + Senha + "?" + ",";
        result += "Salario:" + Float.toString(Salario) + ",";
        result += "Data_empregacao:" + DataEmpregacao.toString() + "}";
        return result;
    }
    
    public String getRelat()
    {
        String result = "Nome: " + Nome;
        result += "\nCPF: " + CPF;
        result += "\nID: " + ID.toString();
        result += "\nEmail: " + Email;
        result += "\nSalario: " + Float.toString(Salario);
        result += "\nData empregacao: " + DataEmpregacao.toString();
        return result;
    }
}
