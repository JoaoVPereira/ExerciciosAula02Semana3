import javax.swing.JOptionPane;
public class LerTresStrings {
   public static void main (String []args){
      String frase1 = JOptionPane.showInputDialog("Digite a primeira frase");
      String frase2 = JOptionPane.showInputDialog("Digite a segunda frase");
      String frase3 = JOptionPane.showInputDialog("Digite a terceira frase");
      int soma = frase1.length() +  frase2.length()  + frase3.length();
      
      JOptionPane.showMessageDialog(null,"A soma é: " soma);
   }
}