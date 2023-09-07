package com.joaos.pcmania.services;

import com.joaos.pcmania.domain.Computador;
import com.joaos.pcmania.domain.MemoriaUsb;

public class ComputerBuild {
    public static Computador buildComputador1() {
        Computador computador = new Computador();
        MemoriaUsb memoriaUsb = new MemoriaUsb("Pen-Drive", 16, "Gb");
        computador.setNome("Promoçao 1");
        computador.setMarca("Positivo");
        computador.setPreco(2300.0f);
        computador.setCpuName("Intel Core i3");
        computador.setCpuCapacidade(2200f);
        computador.setCpuUnidade("MHz");
        computador.setRamName("Memoria Ram");
        computador.setRamCapacidade(8f);
        computador.setRamUnidade("Gb");
        computador.setDiscoName("HD");
        computador.setDiscoCapacidade(500f);
        computador.setDiscoUnidade("Gb");
        computador.setSoName("Linux Ubuntu");
        computador.setSoTipo(32);
        computador.addMemoriaUSB(memoriaUsb);
        return computador;
    }

    public static Computador buildComputador2() {
        Computador computador = new Computador();
        MemoriaUsb memoriaUsb = new MemoriaUsb("Pen-Drive", 32, "Gb");
        computador.setNome("Promoçao 2");
        computador.setMarca("Acer");
        computador.setPreco(5800.0f);
        computador.setCpuName("Intel Core i5");
        computador.setCpuCapacidade(3370f);
        computador.setCpuUnidade("MHz");
        computador.setRamName("Memoria Ram");
        computador.setRamCapacidade(16f);
        computador.setRamUnidade("Gb");
        computador.setDiscoName("HD");
        computador.setDiscoCapacidade(1f);
        computador.setDiscoUnidade("Tb");
        computador.setSoName("Windows 8");
        computador.setSoTipo(64);
        computador.addMemoriaUSB(memoriaUsb);
        return computador;
    }

    public static Computador buildComputador3() {
        Computador computador = new Computador();
        MemoriaUsb memoriaUsb = new MemoriaUsb("HD Externo", 1, "Tb");
        computador.setNome("Promoçao 3");
        computador.setMarca("Vaio");
        computador.setPreco(1800.0f);
        computador.setCpuName("Intel Core i7");
        computador.setCpuCapacidade(4500f);
        computador.setCpuUnidade("MHz");
        computador.setRamName("Memoria Ram");
        computador.setRamCapacidade(32f);
        computador.setRamUnidade("Gb");
        computador.setDiscoName("HD");
        computador.setDiscoCapacidade(2f);
        computador.setDiscoUnidade("Tb");
        computador.setSoName("Windows 10");
        computador.setSoTipo(64);
        computador.addMemoriaUSB(memoriaUsb);
        return computador;
    }
}
