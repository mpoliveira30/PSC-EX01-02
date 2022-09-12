package ex02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex02d {
    
public static void main(String[] args) {
        
        
        
        float a, b;
             
             a = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o primeiro número:"));
             b = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o segundo número:"));

        DecimalFormat df = new DecimalFormat("0.00");     
            
             if (a<b)
                 JOptionPane.showMessageDialog(null, "O menor número é: " +a);
             else
                 JOptionPane.showMessageDialog(null, "O menor número é: " +b);
        
        
        
    }

}
