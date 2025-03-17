public class PagamentoPix implements Pagamento {
  @Override
  public void pagar(double valor) {
      String cod = "PIX-" + (int)(Math.random() * 1000000);
      System.out.println("Pagando " + valor + " via PIX. Código: " + cod);
  }
}
