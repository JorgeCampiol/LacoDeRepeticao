import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long fatorial = 1;

        // Solicita ao usuário para fornecer um número
        System.out.print("Digite um número para calcular o fatorial: ");
        numero = scanner.nextInt();

        // Verifica se o número fornecido é negativo
        if (numero < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            // Calcula o fatorial usando um loop do-while
            int i = 1;
            do {
                fatorial *= i;
                i++;
            } while (i <= numero);

            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        // Fecha o scanner
        scanner.close();
    }
}


