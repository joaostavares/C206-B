package com.joaos.pcmania.domain;

import java.util.ArrayList;

public class Cliente {
    String nome;


    // no exercicio pede por um long nesse campo porém não existe sentido nisso já que long vai ignorar o 0 a esquerda que faz parte de alguns cpf`s
    String cpf;

    ArrayList<Computador> computadoresComprados;


    public float calculaTotalCompra(){
        float total = 0;
        for (Computador e : this.computadoresComprados) {
            total += e.getPreco();
        }
        return total;
    }

    //getter and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Computador> getComputadoresComprados() {
        return computadoresComprados;
    }

    public void setComputadoresComprados(ArrayList<Computador> computadoresComprados) {
        this.computadoresComprados = computadoresComprados;
    }
}
