import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicite o nome do aluno
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        //Notas do aluno no CP
        System.out.println("Digite as notas dos CPs: ");
        double cp1 = sc.nextDouble();
        double cp2 = sc.nextDouble();
        double cp3 = sc.nextDouble();
        double media = (cp1 + cp2 + cp3) /3;
        //Nota dp aluno no Challenge
        System.out.println("Digite a nota do Challenge: ");
        double challenge = sc.nextDouble();
        //Nota do aluno na GS
        System.out.println("Digite a nota do GS: ");
        double gs = sc.nextDouble();

        //Calculo da média
        double media2 = media *0.2 + challenge * 0.2 + gs*0.6;
        System.out.println("Media: " + media2);
    }
}
