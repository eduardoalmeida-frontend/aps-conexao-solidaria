package controller;
import model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Data date1 = new Data(1, 1, 2021);
        
        Doador doador1 = new Doador("Gabriel", "1", 5, 10000.00f, "Rua 1, 123", "1234-5678",  "gabriel@gmail.com");
        Doador doadorAtualizado = new Doador("GabrielAtualizado", "1", 3, 9000.00f, "Rua 777, 777", "1234-4444",  "gabirelMatue@gmail.com");
        
        Doador doador2 = new Doador("Eduardo", "2", 5, 10000.00f, "Rua 2, 173", "4004-5678", "eduardo@gmail.com");

        CadastroDoador cadastroDoador = new CadastroDoador();

        //cadastrando usuários
        cadastroDoador.adicionarDoador(doador1);
        cadastroDoador.adicionarDoador(doador2);

        //Buscando usuários
        cadastroDoador.buscarDoador("1");
        cadastroDoador.buscarDoador("3");

        //Retornando a lista cheia de usuários formatada: 
        System.out.println(cadastroDoador.getDoadores());

        //Atualizando um cadastro
        cadastroDoador.atualizarDoador("1", doadorAtualizado);

        //Retornando a lista cheia de usuários formatada: 
        System.out.println(cadastroDoador.getDoadores());

        cadastroDoador.removerDoador("1");
        //cadastroDoador.removerDoador("2");

        //Retornando a lista cheia de usuários formatada: 
        System.out.println(cadastroDoador.getDoadores());

    }
}
