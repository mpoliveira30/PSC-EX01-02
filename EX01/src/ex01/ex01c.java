package ex01;

import javax.swing.JOptionPane;

public class ex01c {
    
public static void main(String[] args) {
        
        float salario, novo;
             
             salario = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite seu salário atual:"));
             
             novo = salario + (salario/4);
             
             JOptionPane.showMessageDialog(null, "Seu novo salário é: R$" +novo);
        
        
        
        
    }

}
