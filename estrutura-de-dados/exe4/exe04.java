package exe4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// escolhi usar Filas, pois funciona como "primeiro a entrar, primeiro a sair", eles vão ser processados na ordem que forem cadastrados
public class exe04 {
    private static Queue<String> filaAtendimento = new LinkedList<>();
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
            do{
            System.out.println("Escolha uma opção para: \n(1)Cadastrar atendimento.\n(2)Remover atendimento(Por ordem de chegada).\n(3)Finalizar");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                cadastroAtendimento();
                    break;
                case 2:
                    removeAtendimento();
                    break;
                case 3:
                    System.out.println("FIm!");
                    ler.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    }
                }while(opcao != 3);
                ler.close();
    }

    private static void cadastroAtendimento(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa atendida: ");
        String pessoaAtendida = ler.nextLine();
        filaAtendimento.add(pessoaAtendida);
        System.out.println("Atendimento salvo!");
    }

    private static void removeAtendimento(){
        Scanner ler = new Scanner(System.in);
        if (!filaAtendimento.isEmpty()) {
            String proximoAtendimento = filaAtendimento.poll();
            System.out.println("Atendimento removido: " + proximoAtendimento);
        } else {
            System.out.println("Não há atendimentos na fila.");
        }

    }
    
}
