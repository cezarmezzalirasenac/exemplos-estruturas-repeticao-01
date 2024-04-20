import java.util.Scanner;

public class Exemplo03While {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o número desejado para imprimir a sua tabuada");
    int numeroTabuada = scanner.nextInt();

    int contador = 1;

    while (contador <= 10) {
      System.out.printf("%d x %d = %d\n", numeroTabuada, contador, (numeroTabuada * contador));
      contador = contador + 1;
    }

    scanner.close();
  }
}
