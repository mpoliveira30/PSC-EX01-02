package ex01;

import javax.swing.JOptionPane;

public class ex01a {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
             float a, b, c, d;
             
             a = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite um número:"));
             b = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite um número:"));
             c = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite um número:"));
             
             d = a * b * c;
             
             JOptionPane.showMessageDialog(null, d);
         }


}
