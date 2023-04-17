package br.fiap.viagem;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;

public class Viagem {
    private double capacidade = 10000;
    private int index = 0;
    private Carga[] carga = new Carga[20];
    
    public Viagem(Carga[] carga){
        this.carga = carga;
        
    }

    public String getDados(){
        String dados = "Carga";
        return "";
    }

    public boolean permitidoReservar(){
        return index != 20;
    }

    public double capacidadeReservada(){

        return index;
    }

    public Carga reservar(){
        Cliente rafael = new Cliente(232191112, "Rafael");
        Carga carga = new Carga("Av Manoel Pedro Pimentel", rafael);

        if(permitidoReservar()){
            this.carga[index] = carga;
            index++;
        }

        return carga;
    }
    
}
