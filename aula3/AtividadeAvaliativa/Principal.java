import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        GerenciadorTarefas gerTarefas = new GerenciadorTarefas();
        int opcao;
        
        do{
            System.out.println("Escolha uma opção: ");
            System.out.println("(1)Adicionar Tarefa: \n(2)Concluir Tarefa: \n(3)Ver próxima tarefa: \n(4)Sair");
           
            try {
                opcao = ler.nextInt();
                ler.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a descrição da tarefa");
                        String descricao =ler.nextLine();
                        gerTarefas.addTarefas(new Tarefa(descricao));
                        break;
                        case 2:
                            gerTarefas.concluirTarefa();
                        break;
                        case 3:
                        gerTarefas.verProxTarefa();
                        break;
                        case 4:
                        System.out.println("Programa Finalizado!");
                        break;
                    default:
                    System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro. (De 1 até 4)");
                ler.nextLine();
                opcao = 0;
            }
           

        }while(opcao != 4);

        ler.close();
    }
    
}
