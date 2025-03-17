public class ProcessadorPagamento {
  private Pagamento pgto;

  public ProcessadorPagamento(Pagamento pgto) {
      this.pgto = pgto;
  }

  public void processar(double valor) {
      pgto.pagar(valor);
  }
}