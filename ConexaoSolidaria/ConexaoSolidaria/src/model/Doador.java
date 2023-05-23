package model;

import java.util.ArrayList;

public class Doador extends Pessoa {
    ArrayList<Doador> listaDeDoadores = new ArrayList<Doador>();
    
    public Doador (String nome, String cpf, int dependentes, float salario, String endereco, String telefone , String email){
        super(nome, cpf, dependentes, salario, endereco, telefone, email);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
