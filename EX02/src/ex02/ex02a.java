package ex02;

import javax.swing.JOptionPane;

public class ex02a {
   
public static void main(String[] args) {
        
        float p1, p2, media;
             
             p1 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota P1:"));
             p2 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota P2:"));
             
             media = (p1 + p2)/2;
             
             if (media >= 6)
                 JOptionPane.showMessageDialog(null, "Você foi aprovado!\nSua média final é: " +media);
             else
                 JOptionPane.showMessageDialog(null, "Você foi reprovado!\nSua média final é: " +media);
             
     
        
    }

}
