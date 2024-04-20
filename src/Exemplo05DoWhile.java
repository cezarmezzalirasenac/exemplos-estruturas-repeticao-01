import java.util.Scanner;

public class Exemplo05DoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe seu nome");
    String nome = scanner.nextLine();

    // char sexo = scanner.next().charAt(0);

    // while (!(sexo == 'M' || sexo == 'm' ||
    //     sexo == 'F' || sexo == 'f')) {
    //   System.out.println("Informe o sexo");
    //   sexo = scanner.next().charAt(0);
    // }
    char sexo = '#';
    do {
      System.out.println("Informe o sexo");
      sexo = scanner.next().charAt(0);
    } while (!(sexo == 'M' || sexo == 'm' ||
    sexo == 'F' || sexo == 'f'));

  }
}
