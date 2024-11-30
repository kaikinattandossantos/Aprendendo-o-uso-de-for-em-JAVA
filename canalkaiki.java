import java.util.Scanner;

public class canalkaiki {
    public static void main (String[] arg) {
        //declarações
        System.out.println("bem vindo ao carnaval mais fulero que existe!");
        String[] opcaodediversao = {"bloco de carnaval", "praia", "casa da avó"};
        Double[] precodediversao = {100.00, 50.00, 10.00};

        //lógica de comida
        Scanner scanner = new Scanner(System.in);

        //Amostra e decição
        System.out.println("escolha sua diversão");
        for (int i = 0; i < opcaodediversao.length; i++) {
            System.out.println("(" + (i + 1) + ")" + opcaodediversao[i] + "por R$" + precodediversao[i]);
        }
        int escolhadediversao = scanner.nextInt();
        if (1 > escolhadediversao || escolhadediversao > opcaodediversao.length) {
            System.out.println("opção inválida");
            return;
        }


        //erros:
        // concatenação faltando, \n fica dentro das aspas, construção do int escolhadiversao e lugar dele. o objeto deve ter nome diferente do declarado em main.
        //for (inicialização, condição, iteração);

        //usaremos for, if, nextint
        //conta total

        double total = precodediversao[escolhadediversao - 1];
        System.out.println("resumo dos pedidos: ");

        System.out.println("seu pedido de diversão foi " + opcaodediversao[escolhadediversao - 1] + "e o preço dele é: " + precodediversao[escolhadediversao - 1]);
        System.out.println("o seu total ficou: " + total);


    }
}
