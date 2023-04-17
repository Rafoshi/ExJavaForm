package br.fiap.carga;

import java.util.Random;

import br.fiap.cliente.Cliente;

public class Carga {
    Random rng = new Random();

    private int id = rng.nextInt(26);
    private String destino;
    private double peso = rng.nextDouble(80.0);
    private Cliente cliente;

    public Carga(String destino, Cliente cliente){
        this.destino = destino;
        this.cliente = cliente;
    }

    public String getDados(){
        String dados = "O " + cliente.getDados() + "de id: " + id + " vai para " + destino + "com o peso de " + peso;
        
        return dados;
    }

}
