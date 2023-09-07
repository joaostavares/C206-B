package com.joaos.pcmania;

import com.joaos.pcmania.domain.Cliente;
import com.joaos.pcmania.domain.Computador;
import com.joaos.pcmania.services.ComputerBuild;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente client = new Cliente();
        ArrayList<Computador> computadoresComprados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao PCMania!");
        System.out.println("Qual o seu nome: ");
        client.setNome(sc.nextLine());
        System.out.println("Qual o seu CPF: ");
        client.setCpf(sc.nextLine());
        System.out.println("Vamos comecar entao " + client.getNome() + "!");
        int aux = -1;
        while (aux != 0) {
            System.out.println("Digite qual computador deseja comprar (1, 2, 3 ou 0 para encerrar a compra): ");
            aux = sc.nextInt();
            switch (aux) {
                case 1:
                    Computador pc1 = ComputerBuild.buildComputador1();
                    computadoresComprados.add(pc1);
                    break;
                case 2:
                    Computador pc2 = ComputerBuild.buildComputador2();
                    computadoresComprados.add(pc2);
                    break;
                case 3:
                    Computador pc3 = ComputerBuild.buildComputador3();
                    computadoresComprados.add(pc3);
                    break;
                case 0:
                    System.out.printf("%nCompra finalizada! %nComputadores comprados: %n");
                    computadoresComprados.forEach(e -> {
                        e.mostraPcConfigs();
                    });
                    client.setComputadoresComprados(computadoresComprados);
                    System.out.println("O valor total da compra foi de: " + client.calculaTotalCompra());
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}