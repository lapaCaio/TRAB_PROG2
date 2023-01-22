package lapa.caio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorInteiros {
    public VetorInteiros(){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                int num = input.nextInt();
                if (num == 0) {
                    break;
                }
                vetor[contador++] = num;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Você digitou mais de 10 valores, a digitação será interrompida.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido, somente números inteiros são permitidos.");
                input.nextLine();
            }
        }
        System.out.println("Valores digitados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(vetor[i]);
        }
    }
}

