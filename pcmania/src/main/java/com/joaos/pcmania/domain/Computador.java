package com.joaos.pcmania.domain;

public class Computador {
    String nome;
    String marca;
    float preco;
    SistemaOperacional so;
    HardwareBasico cpu;
    HardwareBasico ram;
    HardwareBasico disco;
    MemoriaUsb memoriaUsb;

    public Computador() {
        so = new SistemaOperacional();
        cpu = new HardwareBasico();
        ram = new HardwareBasico();
        disco = new HardwareBasico();
    }


    public void mostraPcConfigs(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println(this.cpu.nome + " (" + this.cpu.capacidade + " " + this.cpu.unidade + ") ");
        System.out.println(this.ram.capacidade + " " + this.ram.unidade + " de " + this.ram.nome);
        System.out.println(this.disco.capacidade + " " + this.disco.unidade + " de " + this.disco.nome);
        System.out.println("Sistema Operacional " + this.so.nome + " ( " + this.so.tipo + " bits )");
        System.out.println("Acompanha " + this.memoriaUsb.nome + " de " + this.memoriaUsb.capacidade + this.memoriaUsb.unidade);
        System.out.println("----------------------------------------------");
    }


    public void addMemoriaUSB(MemoriaUsb musb){
        this.memoriaUsb = musb;
    }

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCpuName() {
        return cpu.nome;
    }

    public void setCpuName(String nome) {
        this.cpu.nome = nome;
    }

    public float getCpuCapacidade() {
        return cpu.capacidade;
    }

    public void setCpuCapacidade(float capacidade) {
        this.cpu.capacidade = capacidade;
    }

    public String getCpuUnidade() {
        return cpu.unidade;
    }

    public void setCpuUnidade(String unidade) {
        this.cpu.unidade = unidade;
    }

    public String getRamName() {
        return ram.nome;
    }

    public void setRamName(String nome) {
        this.ram.nome = nome;
    }

    public float getRamCapacidade() {
        return ram.capacidade;
    }

    public void setRamCapacidade(float capacidade) {
        this.ram.capacidade = capacidade;
    }

    public String getRamUnidade() {
        return ram.unidade;
    }

    public void setRamUnidade(String unidade) {
        this.ram.unidade = unidade;
    }

    public String getDiscoName() {
        return disco.nome;
    }

    public void setDiscoName(String nome) {
        this.disco.nome = nome;
    }

    public float getDiscoCapacidade() {
        return disco.capacidade;
    }

    public void setDiscoCapacidade(float capacidade) {
        this.disco.capacidade = capacidade;
    }

    public String getDiscoUnidade() {
        return disco.unidade;
    }

    public void setDiscoUnidade(String unidade) {
        this.disco.unidade = unidade;
    }

    public String getSoName() {
        return so.nome;
    }

    public void setSoName(String nome) {
        this.so.nome = nome;
    }

    public int getSoTipo() {
        return so.tipo;
    }

    public void setSoTipo(int tipo) {
        this.so.tipo = tipo;
    }
}
