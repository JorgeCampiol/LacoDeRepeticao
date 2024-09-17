import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de valores que você deseja inserir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O número de valores deve ser maior que 0.");
        } else {
            double soma = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o valor " + i + ": ");
                if (scanner.hasNextDouble()) {
                    double valor = scanner.nextDouble();
                    soma += valor;
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                    scanner.next();
                    i--; // Decrementa o contador para repetir a entrada
                }
            }

            double media = soma / n;
            System.out.println("A média dos valores inseridos é: " + media);
        }

    }
}
