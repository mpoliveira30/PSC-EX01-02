package ex02;

import javax.swing.JOptionPane;

public class ex02f {

public static void main(String[] args) {
        
        float a, b, c;
        
        a = Float.parseFloat
            (JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Float.parseFloat
            (JOptionPane.showInputDialog("Digite o segundo número:"));
        c = Float.parseFloat
            (JOptionPane.showInputDialog("Digite o terceiro número:"));
        
        if (a<b && b<c)
            JOptionPane.showMessageDialog(null, "A ordem cresencete é: " +a+ " " +b+ " " +c);
        else if (a<c && c<b)
            JOptionPane.showMessageDialog(null, "A ordem cresencete é: " +a+ " " +c+ " " +b);
        else if (b<a && a<c)
            JOptionPane.showMessageDialog(null, "A ordem cresencete é: " +b+ " " +a+ " " +c);
        else if (b<c && c<a)
            JOptionPane.showMessageDialog(null, "A ordem cresencete é: " +b+ " " +c+" " +a);
        else if (c<a && a<b)
            JOptionPane.showMessageDialog(null, "A ordem cresencete é: " +c+ " " +a+ " " +b);
        else if (c<b && b<a)
            JOptionPane.showMessageDialog(null, "A ordem cresencete é: " +c+ " " +b+ " " +a);
        
        
    }
}
