import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Whos whos = new Whos();

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do mês:");
        int numeroDoMes = scanner.nextInt();

        if (numeroDoMes >= 1 && numeroDoMes <= 12) {
            System.out.println("O mês correspondente é: " + meses[numeroDoMes - 1]);
            System.out.println(whos.printaNome());//printa who is
        } else {
            System.out.println("Número inválido. Por favor, insira um número entre 1 e 12.");
        }

        scanner.close();
    }
}
