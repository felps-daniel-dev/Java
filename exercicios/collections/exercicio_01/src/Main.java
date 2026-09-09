import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

        List<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa(1, "Lavar roupa", Prioridade.BAIXA, true));
        tarefas.add(new Tarefa(2, "Compras", Prioridade.BAIXA, true));
        tarefas.add(new Tarefa(3, "Estudo", Prioridade.MEDIA, false));
        tarefas.add(new Tarefa(4, "Trabalho", Prioridade.ALTA, false));
        tarefas.add(new Tarefa(5, "Corrida", Prioridade.MEDIA, false));
        tarefas.add(new Tarefa(6, "Limpar teclado", Prioridade.BAIXA, false));
        tarefas.add(new Tarefa(7, "Pagar contas", Prioridade.ALTA, false));

    }
}




/*--- EXERCÍCIO 1: Gerenciador de Tarefas (List & ArrayList) ---
Objetivo: Praticar manipulação básica de List, iteração e ordenação.
        Descrição:
        - Crie uma classe Tarefa (id, descricao, prioridade [ALTA, MEDIA, BAIXA], concluida).
        - Crie uma lista (List<Tarefa>) para gerenciar as tarefas.
        - Implemente métodos para:
        1. Adicionar novas tarefas.
  2. Remover uma tarefa pelo ID.
  3. Marcar uma tarefa como concluída.
  4. Listar todas as tarefas pendentes, ordenadas por prioridade.*/