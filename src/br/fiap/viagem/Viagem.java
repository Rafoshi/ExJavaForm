package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {
    private double capacidade = 10000;
    private int index = 0;
    private Carga[] carga = new Carga[20];
    
    public Viagem(Carga[] carga){
        this.carga = carga;
        
        
    }
    
}
