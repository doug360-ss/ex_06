public class FabricaPagamento {
  public static Pagamento criar(String tipo) {
      if (tipo.equalsIgnoreCase("PIX")) {
          return new PagamentoPix();
      } else if (tipo.equalsIgnoreCase("CARTAO")) {
          return new PagamentoCartao();
      } else if (tipo.equalsIgnoreCase("BOLETO")) {
          return new PagamentoBoleto();
      } else {
          throw new IllegalArgumentException("Tipo inválido: " + tipo);
      }
  }
}