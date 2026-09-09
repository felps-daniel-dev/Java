import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tarefa {

    private int id;

    private String descricao;

    private Prioridade prioridade;

    private boolean concluida;

    Tarefa(int id, String descricao,  Prioridade prioridade, boolean concluida){
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = concluida;
    }

    List<Tarefa> adicionaTarefa(Tarefa tarefa, List<Tarefa> lista){
        lista.add(tarefa);
        return lista;
    }

    List<Tarefa> removePorId(int id, List<Tarefa> lista){
        List<Tarefa> novaLista = lista.stream().filter(t -> t.getId() != id).collect(Collectors.toList());
        return novaLista;
    }

    Tarefa marcaComoConcluida(Tarefa tarefa){
         tarefa.setConcluida(true);
         return tarefa;
    }

    List<Tarefa> listaPendentes(List<Tarefa> lista){
        List<Tarefa> novaLista = lista.stream().filter(t -> !t.isConcluida())
                .sorted(Comparator.comparing(Tarefa::getPrioridade))// ele ja ordena pela ordem que esta no enum
                .collect(Collectors.toList());
        return novaLista;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
