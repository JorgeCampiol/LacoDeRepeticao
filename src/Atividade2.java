import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inicial para a contagem regressiva: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, digite um número não negativo.");
        } else {
            System.out.println("Contagem regressiva:");
            while (numero >= 0) {
                System.out.println(numero);
                numero--; // Decrementa o número
                //professor pedi ajuda ao chat gpt mas juro que tentei s2
            }
        }
    }
}

