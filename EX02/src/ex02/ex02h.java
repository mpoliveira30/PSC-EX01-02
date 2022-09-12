package ex02;

import javax.swing.JOptionPane;

public class ex02h {
    
public static void main(String[] args) {
        
        float base1, altura1, area1;
             
             base1 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da base do primeiro triângulo:"));
             altura1 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da altura do primeiro triângulo:"));
             
             area1 = (base1 * altura1)/2;
             
            
             
             
        float base2, altura2, area2;
             
             base2 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da base do segundo triângulo:"));
             altura2 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da altura do segundo triângulo:"));
             
             area2 = (base2 * altura2)/2;
             
             
             
             
        float base3, altura3, area3;
             
             base3 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da base do terceiro triângulo:"));
             altura3 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite o valor da altura do terceiro triângulo:"));
             
             area3 = (base3 * altura3)/2;
             
             
             
             
             
             if (area1>area2 && area1>area3)
                JOptionPane.showMessageDialog(null, "O maior triângulo é o primeiro\ne sua área é: " +area1);
             else if (area2>area1 && area2>area3)
                JOptionPane.showMessageDialog(null, "O maior triângulo é o segundo\ne sua área é: " +area2);
             else if (area3>area1 && area3>area2)
                JOptionPane.showMessageDialog(null, "O maior triângulo é o terceiro\ne sua área é: " +area3);
        
        
        
    }

}
