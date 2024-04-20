import java.util.Scanner;
public class Whos{
        String[] nomes = {
            "Batman Boss", "Babalu", "Maria Canetao", "José Risk", "Ana Koaswki", "Pedro Bala",
            "Pokemon", "Dijkstra", "BinThree", "0xA/", "FFFFAAAA", "C++--"
        };
        String printaNome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do nome:");
        int numeroDoNome = scanner.nextInt();
        scanner.close();
        if (numeroDoNome >= 1 && numeroDoNome <= nomes.length) {
            return "O nome correspondente é: " + nomes[numeroDoNome - 1];
        } else {
            return "Número inválido. Por favor, insira um número entre 1 e 12.";
        }}
}
