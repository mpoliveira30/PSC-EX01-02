package ex01;

import javax.swing.JOptionPane;

public class ex01b {

public static void main(String[] args) {
             float p1, p2, p3, media;
             
             p1 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota P1:"));
             p2 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota P2:"));
             p3 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota P3:"));
             
             media = (p1*3 + p2*3 + p3*4)/10;
             
             JOptionPane.showMessageDialog(null, "Sua média é: " +media);
         }

}
