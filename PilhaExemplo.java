import java.util.Stack;

public class PilhaExemplo {
    public static void main(String[] args) {
        // Criando uma pilha de inteiros
        Stack<Integer> pilha = new Stack<>();

        // Adicionando elementos (Push)
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Pilha após push: " + pilha);

        // Consultando o topo da pilha (Peek)
        System.out.println("Topo da pilha: " + pilha.peek());

        // Removendo o elemento do topo (Pop)
        System.out.println("Elemento removido: " + pilha.pop());

        // Verificando o estado da pilha
        System.out.println("Pilha após pop: " + pilha);

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
