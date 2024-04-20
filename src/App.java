import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        int contador = 0;
        // enquanto o contador for menor ou igual a 2, imprima a mensagem
        while (contador <= 2) {
            System.out.println("Informe um número");
            if (contador == 0) {
                numero1 = scanner.nextInt();
            } else if (contador == 1) {
                numero2 = scanner.nextInt();
            } else if (contador == 2) {
                numero3 = scanner.nextInt();
            }
            contador = contador + 1;
        }

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);

        // numero1 = scanner.nextInt();

        // System.out.println("Informe um número");
        // numero2 = scanner.nextInt();

        // System.out.println("Informe um número");
        // numero3 = scanner.nextInt();

        // comparar os numeros

    }
}
