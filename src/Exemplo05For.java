public class Exemplo05For {
  public static void main(String[] args) {

    // Imprimir os numeros de 0 a 500 e que são divisiveis por 4
    // para (variável de controle; condição; incremento)

    for (int i = 0; i < 500; i++) {
      if (i % 4 == 0) {
        System.out.println(i);
      }
    }
  }

}