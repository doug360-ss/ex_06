public class PagamentoBoleto implements Pagamento {
  @Override
  public void pagar(double valor) {
      String cod = "BOL-" + System.currentTimeMillis();
      System.out.println("Pagando " + valor + " via Boleto. Código: " + cod);
  }
}