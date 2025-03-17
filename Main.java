import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String tipo = "";

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão");
        System.out.println("3 - Boleto");
        System.out.print("Opção: ");
        int op = leia.nextInt();
        leia.nextLine();

        System.out.print("Digite o valor: ");
        double valor = leia.nextDouble();
        leia.nextLine(); 

        switch(op) {
            case 1:
                tipo = "PIX";
                break;
            case 2:
                tipo = "CARTAO";
                break;
            case 3:
                tipo = "BOLETO";
                break;
            default:
                System.out.println("Opção inválida!");
                leia.close();
                return;
        }

        Pagamento pgto = FabricaPagamento.criar(tipo);
        ProcessadorPagamento proc = new ProcessadorPagamento(pgto);
        proc.processar(valor);

        leia.close();
    }
}