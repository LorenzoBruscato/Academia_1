/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        int op = -1;
        while (op != 0) {
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
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
