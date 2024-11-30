import java.util.Scanner;

public class CarnavalEntretenimento {
    public static void main(String[] args) {
        // Nome do negócio
        String nomeNegocio = "Carnaval Alegria Total";

        // Vetores para armazenar opções e preços
        String[] opcoesDiversao = {"Bloco de Rua", "Desfile de Escolas de Samba", "Baile de Carnaval"};
        double[] precosDiversao = {10.00, 50.00, 80.00};

        String[] opcoesComida = {"Espetinho", "Hot Dog", "Coxinha"};
        double[] precosComida = {5.00, 7.50, 6.00};

        String[] opcoesBebida = {"Água", "Refrigerante", "Caipirinha"};
        double[] precosBebida = {2.50, 5.00, 10.00};

        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Entrada do nome do cliente
        System.out.println("Bem-vindo ao " + nomeNegocio + "!");
        System.out.print("Por favor, informe seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Olá, " + nomeCliente + "! Escolha como deseja aproveitar o Carnaval.");

        // Escolha de diversão
        //Mostra as opções
        System.out.println("\nEscolha uma opção de diversão:");
        for (int i = 0; i < opcoesDiversao.length; i++) {
            System.out.println("(" + (i + 1) + ") " + opcoesDiversao[i] + " - R$ " + precosDiversao[i]);
        }
        //Recebe as informações
        int escolhaDiversao = scanner.nextInt();
        if (escolhaDiversao < 1 || escolhaDiversao > opcoesDiversao.length) {
            System.out.println("Opção inválida! Saindo do sistema.");
            return;
        }

        // Escolha de comida
        System.out.println("\nEscolha uma opção de comida:");
        //Mostra as opções
        for (int i = 0; i < opcoesComida.length; i++) {
            System.out.println("(" + (i + 1) + ") " + opcoesComida[i] + " - R$ " + precosComida[i]);
        }
        int escolhaComida = scanner.nextInt();
        if (escolhaComida < 1 || escolhaComida > opcoesComida.length) {
            System.out.println("Opção inválida! Saindo do sistema.");
            return;
        }

        // Escolha de bebida
        System.out.println("\nEscolha uma opção de bebida:");
        //Mostra as opções
        for (int i = 0; i < opcoesBebida.length; i++) {
            System.out.println("(" + (i + 1) + ") " + opcoesBebida[i] + " - R$ " + precosBebida[i]);
        }
        int escolhaBebida = scanner.nextInt();
        if (escolhaBebida < 1 || escolhaBebida > opcoesBebida.length) {
            System.out.println("Opção inválida! Saindo do sistema.");
            return;
        }

        // Calculando o total
        double total = precosDiversao[escolhaDiversao - 1] 
                     + precosComida[escolhaComida - 1] 
                     + precosBebida[escolhaBebida - 1];

        // Exibindo resumo das escolhas
        System.out.println("\nResumo do pedido:");
        System.out.println("Diversão: " + opcoesDiversao[escolhaDiversao - 1] + " - R$ " + precosDiversao[escolhaDiversao - 1]);  
        System.out.println("Comida: " + opcoesComida[escolhaComida - 1] + " - R$ " + precosComida[escolhaComida - 1]);
        System.out.println("Bebida: " + opcoesBebida[escolhaBebida - 1] + " - R$ " + precosBebida[escolhaBebida - 1]);
        System.out.println("Total: R$ " + total);

        // Mensagem final
        System.out.println("\nObrigado por escolher o " + nomeNegocio + "! Divirta-se no Carnaval!");
    }
}
    

