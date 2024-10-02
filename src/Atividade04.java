import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que irão votar: ");
        int quantidadeVotantes = scanner.nextInt();


        String[] times = {"Taffismo Club", "Patinho Branquinho", "Lucas FC", "Sport Redes fc"};
        int[] votos = new int[times.length];

        System.out.println("Escolha um time para votar:");
        System.out.println("80 - " + times[0]);
        System.out.println("70 - " + times[1]);
        System.out.println("60 - " + times[2]);
        System.out.println("50 - " + times[3]);


        for (int i = 0; i < quantidadeVotantes; i++) {
            int voto = 0;

            while (true) {
                System.out.print("Votante " + (i + 1) + ", digite o número do time (80, 70, 60, 50): ");
                voto = scanner.nextInt();


                if (voto == 80) {
                    votos[0]++;
                    break;
                } else if (voto == 70) {
                    votos[1]++;
                    break;
                } else if (voto == 60) {
                    votos[2]++;
                    break;
                } else if (voto == 50) {
                    votos[3]++;
                    break;
                } else {
                    System.out.println("Voto inválido! Por favor, digite 80, 70, 60 ou 50.");
                }
            }
        }


        int maxVotos = 0;
        int timeVencedor = -1;
        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                timeVencedor = i;
            }
        }


        System.out.println("Resultados da votação:");
        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i] + ": " + votos[i] + " votos");
        }

        if (timeVencedor != -1) {
            System.out.println("O time vencedor é: " + times[timeVencedor] + " com " + maxVotos + " votos!");
        }

        scanner.close();
    }
}
