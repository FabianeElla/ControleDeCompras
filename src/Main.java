import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Informe seu limite: R$ ");
        Scanner leitor = new Scanner(System.in);

        double limite = leitor.nextDouble();
        Cartao cartao = new Cartao(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.print("Informe descrição da compra: ");
            String produto = leitor.nextLine();

            System.out.print("Informe o valor da compra: R$ ");
            Double valor = leitor.nextDouble();

            Compras compras = new Compras(produto, valor);

            boolean saldoSuficiente = cartao.verificaLimite(compras);

            if (saldoSuficiente){
                System.out.println("\nCompra realizada!");
                System.out.println("Digite 1 para continuar ou 0 para encerrar");
                sair = leitor.nextInt();
            } else {
                System.out.println("""
                   \n*******SALDO INSUFICIENTE*******
                   Sua compra não pôde ser realizada!
                   
                   Seu saldo: R$""" + cartao.getSaldo());
                sair = 0;
            }
        }

        Collections.sort(cartao.getListaCompras());

        System.out.println("*******Lista de Compras*******");
        for (Compras unidade: cartao.getListaCompras()) {
            System.out.println(unidade);
        }

    }
}
