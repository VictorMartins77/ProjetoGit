import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        String input = JOptionPane.showInputDialog("Digite o número do mês:");
        int numeroDoMes = Integer.parseInt(input);

        if (numeroDoMes >= 1 && numeroDoMes <= 12) {
            JOptionPane.showMessageDialog(null, "O mês correspondente é: " + meses[numeroDoMes - 1]);
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido. Por favor, insira um número entre 1 e 12.");
        }
    }
}
