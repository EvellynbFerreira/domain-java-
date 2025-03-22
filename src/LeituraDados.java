import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        //Criar o objeto reponsável por ler as informações
        Scanner leitor = new Scanner(System.in);

        //Criar uma variável e lê um valor do tipo float
        System.out.println("Digite o valor do produto");
        float valor = leitor.nextFloat();

        //Lê a quantidade do produto
        System.out.println("Qual a quantida do produto?");
        int quantidade = leitor.nextInt();

        // Exibir valor total
        double valorFinal = valor * quantidade;
        System.out.println(valorFinal);
    }
}
