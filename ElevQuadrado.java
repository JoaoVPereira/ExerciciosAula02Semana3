import javax.swing.JOptionPane;
public class ElevQuadrado{
   public static void main (String []args){
      int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));
      int exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente"));
      double resultado = Math.pow(base, exp);
      
      JOptionPane.showMessageDialog(null, "Resultado :   " + resultado);
   }
}