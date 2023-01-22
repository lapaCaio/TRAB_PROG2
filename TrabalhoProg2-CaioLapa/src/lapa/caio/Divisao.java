package lapa.caio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public Divisao() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Informe o primeiro número: ");
            int numA = input.nextInt();
            System.out.print("Informe o segundo número: ");
            int numB = input.nextInt();
            int result = numA / numB;
            System.out.println("O resultado é: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Input inválido, apenas números são permitidos.");
        }
    }
}

