/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio9exer3.pkg1;

import java.util.Scanner;

/**
 *
 * @author baung
 */
public class Desafio9Exer31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int animal, contador, quantCobaia, acRato, acCoelho;
        double  porcentagemRato,porcentagemCoelho,total;
        acRato = 0;
        acCoelho = 0;
        contador = 0;
        quantCobaia = 0;

        while (contador < 3) {
            System.out.println("Insira 1-Ratos ou 2-Coelhos");

            animal = ler.nextInt();
            System.out.println("Insira o quantidade de cobaias.");
            quantCobaia = ler.nextInt();
            if (animal == 1) {
                acRato = acRato + quantCobaia;
                contador++;
            } else if (animal == 2) {
                acCoelho = acCoelho + quantCobaia;
                contador++;
            } else {
                System.out.println("insira numero valido");
            }
        }
        total=acRato + acCoelho;
        porcentagemRato = acRato*100/total;
        porcentagemCoelho = acCoelho*100/total;
        System.out.println("A quantidade de cobaias utilizadas foi de:"+total);
        System.out.println("A quantidade de Ratos foi de:" + acRato);
        System.out.println("A quantidade de coelhos foi de:" + acCoelho);
        System.out.println("O percentual de ratos foi de:"+porcentagemRato);
    }
    

}
