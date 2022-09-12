package ex01;

import javax.swing.JOptionPane;

public class ex01e {
    
    public static void main(String[] args) {
        float base, altura, area;
             
             base = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da base:"));
             altura = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da altura:"));
             
             area = base * altura;
             
             JOptionPane.showMessageDialog(null,"A área do retângulo é: " +area);
        
        
    }
    
}
