package ex01;

import javax.swing.JOptionPane;

public class ex01f {
    
    public static void main(String[] args) {
        float base, altura, area;
             
             base = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da base:"));
             altura = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da altura:"));
             
             area = (base * altura)/2;
             
             JOptionPane.showMessageDialog(null,"A área do triângulo é: " +area);
        
        
    }
    
}
