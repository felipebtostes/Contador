package com.felipe.portifolio;

import java.util.Scanner;

public class ContadorNewVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imprima um numero que deseja iniciar a contagem: ");
        int number1 = scanner.nextInt();

        System.out.println("Imprima um numero que deseja parar a contagem: ");
        int number2 = scanner.nextInt();

        contar(number1, number2);

        scanner.close();
    }

    static void contar(int number1, int number2){

        int quantosNumerosContar = number2 - number1;

        System.out.println("Contando os numeros de " + number1 + " a " + number2);

        for(int i = 1; i <= quantosNumerosContar; i++){
            System.out.println("Imprimindo numero: " + i);
        }
    }
}
