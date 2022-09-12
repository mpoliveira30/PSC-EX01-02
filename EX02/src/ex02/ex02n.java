package ex02;

import javax.swing.JOptionPane;

public class ex02n {
    
public static void main(String[] args) {
        
        float np1, np2, nt1, nt2, nt3, nt, media;
             
             np1 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota da prova 1:"));
             np2 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota da prova 2:"));
             nt1 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota do trabalho 1:"));
             nt2 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota do trabalho 2:"));
             nt3 = Float.parseFloat
                 (JOptionPane.showInputDialog("Digite a nota do trabalho 3:"));
             
             nt = ((nt1+nt2+nt3)*4)/3;
             
             media = (np1*3 + np2*3 + nt)/10;
             
             
             if (media>=6)
                JOptionPane.showMessageDialog(null, "Você está aprovado com a nota: " +media);
             else if (media<=6 && media>=4)
                JOptionPane.showMessageDialog(null, "Você ficou de exame com a nota: " +media);
             else if (media<4)
                JOptionPane.showMessageDialog(null, "Você foi reprovado com a nota: " +media);
        
        
        
    }

}
