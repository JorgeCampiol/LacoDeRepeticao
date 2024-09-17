import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        while (true) {
            System.out.print("Digite sua idade (maior que 0): ");

            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();


                if (idade > 0) {
                    break; // Sai do loop se a idade for válida
                } else {
                    System.out.println("Idade inválida. Por favor, digite um número maior que 0.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        System.out.println("Idade válida fornecida: " + idade);


    }
}
