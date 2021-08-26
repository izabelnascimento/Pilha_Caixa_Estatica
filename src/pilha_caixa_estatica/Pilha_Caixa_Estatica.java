package pilha_caixa_estatica;
import java.util.Scanner;

public class Pilha_Caixa_Estatica {

    public static void main(String[] args) {
        
        Pilha p1 = new Pilha<Caixa>(5);
        Scanner entrada = new Scanner(System.in);
        Caixa c1 = new Caixa();
        int op;
        
        do{
            System.out.println(".............................................");
            System.out.println("Opções para empilhar caixas: ");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Quantidade de caixas");
            System.out.println("4 - Pilha cheia?");
            System.out.println("0 - Sair");
            op = entrada.nextInt();
            System.out.println(".............................................");
            
            switch(op){
                case 1:
                    System.out.println("Cor da caixa:");
                    c1.setCor(entrada.next());
                    System.out.println("Tamanho da caixa em cm:");
                    c1.setTam(entrada.nextInt());
                    p1.inserir(c1);
                    System.out.println("Caixa inserida");
                    break;
                case 2:
                    p1.remover();
                    System.out.println("Caixa removida");
                    break;
                case 3:
                    System.out.println(p1.getQuantidade() + " caixa(s)");
                    break;
                case 4:
                    System.out.println(p1.isCheia());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
            
        }while(op!=0);
    }
}
