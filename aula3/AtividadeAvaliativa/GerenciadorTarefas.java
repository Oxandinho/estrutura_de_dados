import java.util.LinkedList;
import java.util.Queue;

public class GerenciadorTarefas{

    private Queue<Tarefa> filaTarefas;

    public GerenciadorTarefas(){
        filaTarefas = new LinkedList<>();
    }

    public void addTarefas(Tarefa tarefa){
        filaTarefas.offer(tarefa);
    }

    public void concluirTarefa(){
        if(!filaTarefas.isEmpty()){
            filaTarefas.poll();
            System.out.println("Tarefa concluída!");
        }
        else{
                System.out.println("Sem tarefas!");
        }
    }

    public void verProxTarefa(){
        if(!filaTarefas.isEmpty()){
            Tarefa verProxTarefa = filaTarefas.peek();
            System.out.println("Próxima tarefa: "+verProxTarefa.getDescricao());
        }
        else{
            System.out.println("Sem tarefas!");
        }
    }
}
