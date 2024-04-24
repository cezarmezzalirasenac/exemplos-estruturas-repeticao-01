public class Exemplo06For {
  public static void main(String[] args) {
    // imprimir os números pares de 100 até 0
    // para (inicializa contador;
    //       condição;
    //       incremento ou decremento contador) {
    //      // executa o que está aqui no bloco
    // }
    for (int contador = 100; contador >= 0; contador = contador - 1) {
      if (contador % 2 > 0) {
        System.out.println(contador);
      }
    }
  }
}
