
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alimentos: ");

        int quantidadeAlimentos = scanner.nextInt();
        double[] avaliacoes = new double[quantidadeAlimentos];

        int bons = 0;
        int ruins = 0;

        for (int i = 0; i < quantidadeAlimentos; i++) {
            double nota;
            while (true) {
                System.out.print("Digite a avaliação para o alimento " + (i + 1) + " (0 a 10): ");
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.println("Nota inválida! Por favor, digite uma nota entre 0 e 10.");
                }
            }

            avaliacoes[i] = nota;


            if (nota >= 6) {
                bons++;
            } else {
                ruins++;
            }
        }


        System.out.println("Resultados das avaliações:");
        System.out.println("Quantidade de alimentos avaliados como bons: " + bons);
        System.out.println("Quantidade de alimentos avaliados como ruins: " + ruins);

        scanner.close();
    }
}