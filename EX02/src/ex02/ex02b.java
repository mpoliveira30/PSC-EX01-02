package ex02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex02b {
     public static void main(String[] args){
        double altura, sexo;
        double homem, mulher;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        altura = Double.parseDouble
            (JOptionPane.showInputDialog(null, "Digite sua Altura: "));
        sexo = 
            (JOptionPane.showConfirmDialog(null, "Você é do sexo Masculino? "));

        homem = 72.7 * altura - 58;
        mulher = 62.1 * altura - 44.7;

        if (sexo == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "O peso ideal para o sexo Masculino, \ncom base na sua altura é: " +decimalFormat.format(homem) +"kg.");
        } else {
            JOptionPane.showConfirmDialog(null, "Você é do sexo Feminino? ");
            JOptionPane.showMessageDialog(null, "O peso ideal para o sexo Feminino, \n com base na sua altura é: " +decimalFormat.format(mulher) +"kg.");
        }
        

    }
}
