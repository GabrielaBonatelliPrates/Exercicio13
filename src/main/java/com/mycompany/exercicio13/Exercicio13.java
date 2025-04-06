

package com.mycompany.exercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio13 {

    public static void main(String[] args) {
        double sb = Integer.parseInt(JOptionPane.showInputDialog("Seu salário bruto: "));
        double p = Integer.parseInt(JOptionPane.showInputDialog("Valor da prestação: "));

        if (p< sb * 0.3) {
            JOptionPane.showMessageDialog(null, "O empréstimo pode ser concedido");
        } else {
              JOptionPane.showMessageDialog(null, "O empréstimo não pode ser concedido");
        }
        }

    }
