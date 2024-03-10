package exe2;
import java.util.Scanner;
public class exe02{
        static String[] nomes = new String[10];
        
            public static void main (String args[]){

                Scanner ler = new Scanner(System.in);
                /*
                * Utilizando um array estático de dez posições, desenvolva um algoritmo com 
                * as seguintes funcionalidades:

                Cadastrar;
                Listar todos os nomes;
                Alterar;
                Remover;
                Finalizar.

	            Essa estrutura ficará em um laço de repetição.
                */
                while(true){
                System.out.println("Escolha uma opção:\n(1)Cadastrar\n(2)Listar todos os nomes\n(3)Alterar\n(4)Remover\n(5)Finalizar");
                int opcao = ler.nextInt();
                    switch(opcao){
                        case 1:
                        Cadastrar();
                        break;
                        case 2: 
                        Listar();
                        break;
                        case 3:
                        Alterar();
                        break;
                        case 4:
                        Remover();
                        break;
                        case 5:
                        System.out.println("Programa encerrado");
                        ler.close();
                        return;
                        default:
                        System.out.println("Opção inválida. Tente novamente");    
                    }
                }
            }
            static void Cadastrar(){
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o nome que deseja cadastrar: ");
                String nome = ler.next();
                for (int i = 0; i < nomes.length; i++){
                    if(nomes[i] == null){
                        nomes[i] = nome;
                        System.out.println("Nome cadastrado com sucesso.");
                        return;
                    }
                }
                System.out.println("Não há mais espaço disponíveis.\nRemova algum nome para fazer um novo cadastro!");
            }

            static void Listar(){
                Scanner ler = new Scanner(System.in);
                System.out.println("Nomes cadastrados");
                    for (String nome: nomes){
                        if(nome != null){
                            System.out.println(nome);
                        }
                    }
                }

            static void Alterar(){
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o nome a ser alterado: ");
                String nomeAntigo = ler.nextLine();

                System.out.print("Digite o novo nome: ");
                String nomeNovo = ler.nextLine();
                
                for (int i = 0; i < nomes.length; i++) {
                    if (nomes[i] != null && nomes[i].equals(nomeAntigo)) {
                        nomes[i] = nomeNovo;
                        System.out.println("Nome alterado com sucesso!");
                        return;
                    }
                    System.out.println("Nome não encontrado.");
                }
                
            }

            static void Remover(){
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o nome que desesjas remover: ");
                String nomeRemovido = ler.next();
                for(int i = 0; i < nomes.length; i++ ){
                    if( nomes[i] != null && nomes[i].equals(nomeRemovido)){
                        nomes[i] = null;
                        System.out.println("Nome removido!");
                    }
                    System.out.println("Nome não encontrado.");
                }
                
            }
}

        
    

