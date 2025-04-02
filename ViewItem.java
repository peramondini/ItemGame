import java.util.Scanner;

public class ViewItem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item item = null;
        int op;

        do{
            System.out.println("Escolha uma opcao: 1-Cadastrar Item 2-Exibir Item 0-Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("digite o nome do item:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite a descricao do item:");
                    String descricao = sc.next() + sc.nextLine();
                    System.out.println("O item é raro? (true/false):");
                    boolean raro = sc.nextBoolean();
                    System.out.println("Digite o nivel do poder do item:");
                    int nivelPoder = sc.nextInt();
                    item = new Item (nome, descricao, raro, nivelPoder);
                    break;
                case 2:
                    if (item != null) {
                        System.out.println(" Nome: " + item.nome + " Descricao: " + item.descricao + " Raro: " + item.raro + " Nivel de poder: " + item.nivelPoder);
                    } else {
                        System.out.println("Nenhum item cadastrado aindo.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opcao inválida");


            }
        } while (op !=0);

        sc.close();
    }
}
