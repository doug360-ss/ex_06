import java.util.Scanner;

public class PagamentoCartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o número do cartão: ");
        String num = leia.nextLine();
        System.out.println("Pagando " + valor + " via Cartão. Cartão: " + num);
        System.out.println("Pagamento efetuado!");
    }
}
