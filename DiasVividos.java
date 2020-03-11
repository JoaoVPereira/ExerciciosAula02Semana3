import javax.swing.JOptionPane;
public class DiasVividos {
   public static void main (String []args){
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
      int dias = (idade * 365);
      
      JOptionPane.showMessageDialog(null, "Dias vividos:  " + dias);
      
   }
}
