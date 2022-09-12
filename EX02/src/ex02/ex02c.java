package ex02;

import javax.swing.JOptionPane;

public class ex02c {
    
public static void main(String[] args) {
        
        int a, b;
             
             a = Integer.parseInt
                 (JOptionPane.showInputDialog("Digite o primeiro número:"));
             b = Integer.parseInt
                 (JOptionPane.showInputDialog("Digite o segundo número:"));

             
            
             if (a>b)
                 JOptionPane.showMessageDialog(null, "O maior número é: " +a);
             else
                 JOptionPane.showMessageDialog(null, "O maior número é: " +b);
        
        
        
    }

}
