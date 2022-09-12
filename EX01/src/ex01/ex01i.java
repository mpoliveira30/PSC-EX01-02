package ex01;

import javax.swing.JOptionPane;

public class ex01i {
    
public static void main(String[] args) {
        
        int nascimento, idade;
        int virada = 2101;
        
        nascimento = Integer.parseInt
            (JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
        
        idade = virada - nascimento;
        
        
        JOptionPane.showMessageDialog(null, "Sua idade na virada do século será: " +idade+ " anos");
        
        
        
        
    }

}
