package br.fiap.cliente;

public class Cliente {
    private int cnpj;
    private String cliente;

    public Cliente(int cnpj, String cliente){
        this.cnpj = cnpj;
        this.cliente = cliente;
    }

    public String getDados(){
        String dados = "O cliente: " + cliente + " possui o CNPJ: " + cnpj;

        return dados;
    }
}
