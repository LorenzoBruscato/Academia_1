package principal;

import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        int op;
        while (true) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bem-vindo\n"
                    + "1 - Cadastrar o Cliente\n"
                    + "2 - Mostrar Dados do Cliente\n"
                    + "3 - Sair"));

            switch (op) {
                case 1:
                    a.leituracliente();
                    break;
                case 2:
                    a.imprimircliente();
                    break;
                case 3:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
