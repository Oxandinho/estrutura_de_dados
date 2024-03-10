package exe3;

import java.util.ArrayList;
import java.util.Scanner;
public class exe03 {
    
    private static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
            do{
            System.out.println("Escolha uma opção para: \n(1)Cadastrar produtro.\n(2)Listar Produto.\n(3)Pesquisar produto.\n(4)Alterar produto.\n(5)Remover produto.\n(6)Finalizar");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                cadastroProduto();    
                    break;
                case 2:
                listarProduto();    
                    break;
                case 3:
                pesquisaProduto();        
                    break;
                case 4:
                alterarProduto();
                    break;
                case 5:
                removerProduto();  
                    break;
                case 6:
                    System.out.println("FIm!");
                    ler.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    }
                }while(opcao != 6);
                ler.close();
                
    }
    private static void cadastroProduto(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = ler.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valor = ler.nextDouble();
        produtos.add(new Produto(nome, valor));
        System.out.println("Produto cadastrado");

    }

    private static void listarProduto(){
        System.out.println("Lista de Produtos");

        for (Produto produto : produtos){
            System.out.println("Nome: " + produto.getNome()+ ", valor: R$"+ produto.getValor() + ".");
        }
    }

    private static  void pesquisaProduto(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o termo que esta procurando: ");
        String termo = ler.nextLine();
        for(Produto produto : produtos){
            if(produto.getNome().contains(termo)){
                System.out.println("Produtos encontrados com o termo: "+ "'"+termo+"' :");
                System.out.println("Nome: " + produto.getNome()+ ", valor: R$"+ produto.getValor() + ".");
            }
            System.out.println("Produto não encontrado");

        } 
        
    }

    private static void alterarProduto(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o produto que deseja alterar: ");
        String produtoTrocado = ler.nextLine();

        for(Produto produto : produtos){
            if(produto.getNome().equals(produtoTrocado)){
                System.out.println("Digite o novo produto: ");
                String produtoNovo = ler.nextLine();
                System.out.println("Digite o valor do mesmo: ");
                Double valorNovo = ler.nextDouble();
                produto.setNome(produtoNovo);
                produto.setValor(valorNovo);

                System.out.println("Produto alterado!");
            }
            System.out.println("Produto não encontrado");
        }
        
    }

    private static void removerProduto(){

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o produto que deseja remover: ");
        String produtoRemovido = ler.nextLine();
        for(Produto produto : produtos){
            if(produto.getNome().equals(produtoRemovido)){
                produtos.remove(produto);
                System.out.println("Produto removido!");  
                return;  
            }

        }
        System.out.println("Produto não encontrado");
    } 
    
}
