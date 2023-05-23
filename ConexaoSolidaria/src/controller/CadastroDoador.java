package controller;

import java.util.ArrayList;
import java.util.List;

import model.Doador;

public class CadastroDoador {

    private List<Doador> doadores;
   

    private Doador doadorEncontrado;
    //private static final float RENDA_FAMILIAR_MINIMA = 2000.00f;

    //construtor
    public CadastroDoador(){
        doadores = new ArrayList<>();
    }

    // Método para adicionar um novo doador
    public void adicionarDoador(Doador doador) {
        doadores.add(doador);
        System.out.println("Doador adicionado com sucesso!" + doador.getNome());
    }

    // Método para buscar um doador pelo CPF
    public void buscarDoador(String CPF) {
        for (Doador doador : doadores) {
            if (doador.getCPF().equals(CPF)) {
                doadorEncontrado = doador;
                System.out.println("Doador encontrado: " + doador.getNome());
                return;
            } 

        }

        System.out.println("doador n encontrado");
                
    }
    
    // Método para atualizar os dados de um doador
    public void atualizarDoador(String CPF, Doador novoDoador) {
        for (int i = 0; i < doadores.size(); i++) {
            Doador doador = doadores.get(i);
            if (doador.getCPF().equals(CPF)) {
                doadores.set(i, novoDoador);
                System.out.println("Doador atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Doador não encontrado!");
    }

    // Método para remover um doador pelo CPF
    public void removerDoador(String CPF) {
        for (int i = 0; i < doadores.size(); i++) {
            Doador doador = doadores.get(i);
            if (doador.getCPF().equals(CPF)) {
                doadores.remove(i);
                System.out.println("Doador removido com sucesso!");
                return;
            }
        }
        System.out.println("Doador não encontrado!");
    }

    public List<Doador> getDoadores() {
        return doadores;
    }

    public void setDoadores(List<Doador> doadores) {
        this.doadores = doadores;
    }
}




    
