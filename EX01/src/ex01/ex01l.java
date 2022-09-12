package ex01;

import javax.swing.JOptionPane;

public class ex01l {
    
public static void main(String[] args) {
        int nascimento, atual, idade;
        
        nascimento = Integer.parseInt
            (JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
        atual = Integer.parseInt
            (JOptionPane.showInputDialog("Digite o ano atual:"));
        
        idade = atual - nascimento;
        
        JOptionPane.showMessageDialog(null, "Sua idade é: " +idade+ " anos");
        
        
        
        
    }

}
